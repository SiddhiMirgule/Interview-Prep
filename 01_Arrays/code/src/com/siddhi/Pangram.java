package com.siddhi;
import java.util.*;

public class Pangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            letters.add(c);
        }

        return letters.size() == 26;
    }

    public static void main(String[] args) {
        Pangram solution = new Pangram();
        String str = "thequickbrownfoxjumpsoverthelazydog";
        solution.checkIfPangram(str);
    }

}
