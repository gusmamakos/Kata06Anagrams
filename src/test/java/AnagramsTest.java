import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramsTest {

    @Test
    public void count() {
        List<String> words = new ArrayList<>();
        words.add("Bering");
        words.add("Binger");
        words.add("coempted");
        words.add("competed");
        words.add("enervates");
        words.add("venerates");
        words.add("hair");
        words.add("bottle");
        words.add("phrasing");
        Anagrams anagrams = new Anagrams();
        words.forEach(anagrams::add);
        assertEquals("Failed",3,anagrams.count());
    }
    @Test
    public void count2() {
        List<String> words = new ArrayList<>();
        words.add("venerates");
        words.add("hair");
        words.add("bottle");
        words.add("phrasing");
        Anagrams anagrams = new Anagrams();
        words.forEach(anagrams::add);
        assertEquals("Failed",0,anagrams.count());
    }

}