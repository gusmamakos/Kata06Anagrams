import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("wordlist.txt") );
        Anagrams anagrams = new Anagrams();
        String word;
        while ((word = br.readLine()) != null) {
            anagrams.add(word);
        }
        br.close();
        anagrams.printVerbose();
    }



}
