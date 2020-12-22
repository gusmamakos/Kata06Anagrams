import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    private final HashMap<String, List<String>> results = new HashMap<>();

    public void add(String word){
        String key = getKey(word);
        List<String> temp;
        if(results.containsKey(key)){
            temp = results.get(key);
        }else{
            temp = new ArrayList<>();
        }
        temp.add(word);
        results.put(key,temp);
    }

    public int count(){
        int i = 0;
        for (List<String> value : results.values()) {
            if(value.size() > 1) {
                i++;
            }
        }
       return i;
    }
    public void printVerbose(){
        int i = 0;
        for (List<String> value : results.values()) {
            if(value.size() > 1) {
                System.out.println(value);
                i++;
            }
        }
        System.out.println(i + " anagrams found");
    }
    private String getKey(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars){
            sb.append(c);
        }
        return sb.toString();
    }

}
