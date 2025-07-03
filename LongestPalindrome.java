import java.util.*;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character , Integer> map = new HashMap<>();
         
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int result=0;
        for(int count : map.values()){
            result+= count /2 * 2;
        }

        return result < s.length() ? result + 1 : result; 
    }
    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String s = "abccccd";
        System.out.println("Length of Longest Palindrome: " + solution.longestPalindrome(s)); // Output: 7
    }
}