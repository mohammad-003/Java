import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character , Integer> map= new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
                if(map.get(s.charAt(i))==1){
                    return i;
                }
        }

            return -1;

    }
    public static void main(String[] args) {
        FirstUniqChar solution = new FirstUniqChar();
        String s = "leetcode";
        System.out.println("First Unique Character Index: " + solution.firstUniqChar(s)); // Output: 0
    }
} 
