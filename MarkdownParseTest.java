import static org.junit.Assert.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.IOException;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMarkDownParseTestFile() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testMarkDownParseTestFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testMarkDownParseImageTest() throws IOException{
        Path fileName = Path.of("imageTest.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));
    }

    @Test
    public void testMarkDownParseNewLine() throws IOException{
        Path fileName = Path.of("newLineAtEnd.md");
	    String contents = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(contents), List.of("https://something.com", "some-page.html"));
    }
    
    /*
    //New Test added for Snippet 1 Lab Report 4
    @Test
    public void testMarkDownParseSnippet1() throws IOException{
        Path fileName = Path.of("snippet1.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("'google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(contents));
    }

    //New Test added for Snippet 2 Lab Report 4
    @Test
    public void testMarkDownParseSnippet2() throws IOException{
        Path fileName = Path.of("snippet2.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(contents));
    }

    //New Test added for Snippet 3 Lab Report 4
    @Test
    public void testMarkDownParseSnippet3() throws IOException{
        Path fileName = Path.of("snippet3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/"), MarkdownParse.getLinks(contents));
    }
    */

    
} 
