public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalsum = n *(n + 1) /2;
        int actualsum=0;

        for(int num : nums){
            actualsum+=num;
        }

        return totalsum-actualsum;
    }
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        int[] nums = {3, 0, 1};
        System.out.println("Missing Number: " + solution.missingNumber(nums)); // Output: 2
    }
} 
