package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.deploy.util.StringUtils;

public class L438_FindAllAnagramsInAString {
    public static List<Integer> solution1_bruteforce(String s, String p) {
        // exceeds time limit
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        for (int i = 0; i+k <=s.length(); i++){
            if (isAnagram(p, s.substring(i, i+k))) list.add(i);
        }

        return list;
    }

    public static boolean isAnagram(String s1, String s2){
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i<a1.length; i++){
            if (a1[i] != a2[i]) return false;
        }

        return true;
    }

}
