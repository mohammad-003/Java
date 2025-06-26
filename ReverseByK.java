public class ReverseByK {
    
    public String reverseStr(String s, int k) {
        
        char[] arr= s.toCharArray();

        for(int i=0; i< arr.length ; i+= 2*k){

            int start=i;
            int end=Math.min(i+k-1,arr.length-1);
            reverse(arr , start , end);

        }
           return new String(arr);

    }

    public void reverse(char[] arr,int start,int end){

        while(start < end){

                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;

        }
        
    }
    public static void main(String[] args) {
        ReverseByK solution = new ReverseByK();
        String s = "abcdefg";
        int k = 2;
        System.out.println("Reversed String: " + solution.reverseStr(s, k)); // Output: "bacdfeg"
    }
    
}
