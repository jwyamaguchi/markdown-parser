//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int exclamationPoint = markdown.indexOf("!", currentIndex);
            int openBracket = markdown.indexOf("[", currentIndex);
            if (openBracket == -1) {
                break;
            }
            int closeBracket = markdown.indexOf("]", openBracket);
            if (closeBracket == -1) {
                break;
            }
            int openParen = markdown.indexOf("(", closeBracket);
            if (openParen == -1) {
                break;
            }
            int openParenPlusSpace = openParen;
            if (markdown.indexOf(" ", openParenPlusSpace) == openParenPlusSpace + 1) {
                openParenPlusSpace++;
            }
            int closeParen = markdown.indexOf(")", openParen);
            if (closeParen == -1) {
                break;
            }
            System.out.println(markdown.substring(openParen + 1, closeParen));
            if (openParen == closeBracket + 1 && exclamationPoint != openBracket - 1) {
            toReturn.add(markdown.substring(openParenPlusSpace + 1, closeParen));
            }
            currentIndex = closeParen + 1;
        }
        if (toReturn.size() == 0) {
            toReturn.add("no links found");
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}

// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" ./MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest