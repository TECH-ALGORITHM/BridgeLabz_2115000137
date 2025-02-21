import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            HashMap<String, Integer> map = new HashMap<>();
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split(" ")) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            br.close();
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> b.getValue() - a.getValue());
            for (int i = 0; i < 5 && i < list.size(); i++) {
                System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
            }
        } catch (IOException e) {
            System.out.println("Error occurred.");
        }
    }
}
