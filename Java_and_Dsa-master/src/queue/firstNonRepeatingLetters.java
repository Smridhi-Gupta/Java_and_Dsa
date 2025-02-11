package queue;
import java.util.*;
import java.util.Queue;

public class firstNonRepeatingLetters {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // 'a'-'z'
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
    }
}
