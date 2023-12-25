package task2;

import java.util.HashMap;

public class Task2 {

    public static void pulling(String[] strings){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            String start = "" + strings[i].charAt(0);
            String lastInd = strings[i].charAt(strings[i].length() - 1) + "";
            hashMap.put(start, lastInd);
        }
        System.out.println(hashMap);
    }
}
