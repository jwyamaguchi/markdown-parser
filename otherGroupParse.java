//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class otherGroupParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
       
        while(currentIndex < markdown.length()) {

            int openBracket = markdown.indexOf("[", currentIndex);
            if (openBracket < 0){
                break;
            }else if(openBracket > 0){
                if (markdown.indexOf("!", currentIndex) + 1 == openBracket){
                    break;
                }
            }

            int closeBracketAndOpenParentheses = markdown.indexOf("](", openBracket);
            if (closeBracketAndOpenParentheses < 0){break;}
            int closeParen = markdown.indexOf(")", closeBracketAndOpenParentheses);
            if(closeParen < 0){break;}
            if(!markdown.substring(closeBracketAndOpenParentheses + 2, closeParen).contains(" ")){
               toReturn.add(markdown.substring(closeBracketAndOpenParentheses + 2, closeParen));
            }
            currentIndex = closeParen + 1;
        
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        System.out.println("Done!");
        System.out.println("New change!!!!!!");
    }
}