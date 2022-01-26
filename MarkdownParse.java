// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
<<<<<<< HEAD
        boolean foundParen = true;
        while(currentIndex < markdown.length() && foundParen) {
=======
        boolean failSafe = false;
        while(currentIndex < markdown.length() && !failSafe) {
>>>>>>> c0662ffbc46e23af01098ca16945a491c8914a75
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
<<<<<<< HEAD
            if(!markdown.substring(closeParen+1, markdown.length()).contains(")")){
                foundParen = false;
            }
            if(markdown.substring(openParen+1, closeParen).contains(".") &&
               !markdown.substring(openParen+1, closeParen).contains(" ") &&
               (nextOpenBracket == 0 ||
               !markdown.substring(nextOpenBracket - 1, nextOpenBracket).contains("!"))){
                toReturn.add(markdown.substring(openParen + 1, closeParen));
               }
=======
            if(markdown.substring(openParen+1, closeParen).contains(".") && !markdown.substring(openParen+1, closeParen).contains(" ")){
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            if (!markdown.substring(closeParen+1,markdown.length()).contains(")") ) {
                failSafe = true;
            }

            
>>>>>>> c0662ffbc46e23af01098ca16945a491c8914a75
            currentIndex = closeParen + 1;
        }

        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}