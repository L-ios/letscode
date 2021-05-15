package com.lib8.leetcodecn.primary.string;

public class Palindrome {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        while (low < high) {
            char lowChar = (char) 0;
            while (low < high) {
                lowChar = Character.toLowerCase(s.charAt(low));
                if (Character.isAlphabetic(lowChar)
                        || Character.isDigit(lowChar)) {
                    break;
                }
                lowChar = (char) 0;
                low++;
            }

            char highChar = (char) 0;
            while (low < high) {
                highChar = Character.toLowerCase(s.charAt(high));
                if (Character.isAlphabetic(highChar)
                        || Character.isDigit(highChar)) {
                    break;
                }
                highChar = (char) 0;
                high--;
            }

            if (lowChar != highChar && highChar != 0) {
                return false;
            }
            high--;
            low++;
        }
        return true;
    }
}
