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
} 
