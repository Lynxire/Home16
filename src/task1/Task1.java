package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void findDublicat(String[] words){
        Map<String, Boolean> hashmap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if(hashmap.containsKey(words[i])) {
                hashmap.put(words[i], true);
            }
            else{
                hashmap.put(words[i],false);
            }
        }

        System.out.println(hashmap);
    }
}
