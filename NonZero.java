import java.util.Arrays;

class NonZero {
    public void moveZeroes(int[] nums) {
    //     int index =  0;

    //    for(int num : nums){
    //         if(num != 0){
    //             nums[index++]=num;
    //         }
    //    } 

    //     while(index < nums.length){
    //             nums[index++]=0;
    //         }
    // }
        int nonZero =0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){

                int temp=nums[nonZero];
                nums[nonZero]=nums[i];
                nums[i]=temp;
                nonZero++;
            }
        }

    }
    public static void main(String[] args) {
        NonZero solution = new NonZero();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.println("Array after moving zeroes: " + Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
}