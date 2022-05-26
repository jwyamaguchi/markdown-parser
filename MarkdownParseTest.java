import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.Assert.*; // imports the neccessary junit programs v
import org.junit.*;

public class MarkdownParseTest { // the main class for MarkdownParseTest
@Test // signifies that there is a test method to junit
public void addition() { // the test method
assertEquals(2, 1 + 1); // the test, assertEquals, checks if the first input is equal to the right input
}

@Test
public void test1() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("https://something.com");
        testArray.add("some-thing.html");
assertEquals(testArray, links);
}

@Test
public void test2() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("https://something.com");
        testArray.add("some-page.html");
assertEquals(testArray, links);
}

@Test
public void test3() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test4() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test5() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test6() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test7() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test8() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("no links found");
assertEquals(testArray, links);
}

@Test
public void test9() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("is_technically_a_link");
assertEquals(testArray, links);
}

@Test
public void test10() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("`google.com");
        testArray.add("google.com");
        testArray.add("ucsd.edu");
assertEquals(testArray, links);
}

@Test
public void test11() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("a.com");
        testArray.add("a.com(())");
        testArray.add("example.com");
assertEquals(testArray, links);
}

@Test
public void test12() throws IOException {
        MarkdownParse md = new MarkdownParse();
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
assertEquals(testArray, links);
}

@Test
public void test13() throws IOException {
        test md = new test();
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("`google.com");
        testArray.add("google.com");
        testArray.add("ucsd.edu");
assertEquals(testArray, links);
}

@Test
public void test14() throws IOException {
        test md = new test();
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("a.com");
        testArray.add("a.com(())");
        testArray.add("example.com");
assertEquals(testArray, links);
}

@Test
public void test15() throws IOException {
        test md = new test();
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = md.getLinks(content);
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
assertEquals(testArray, links);
}
}
