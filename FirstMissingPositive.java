class  FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        //cycle sort
        int n=nums.length;

        for(int i=0;i<n ;i++){
            while(nums[i]>0 &&
                    nums[i]<=n &&
                    nums[i]!=nums[nums[i]-1]){

                        int temp=nums[i];
                        nums[i]=nums[temp-1];
                        nums[temp-1]=temp;
                    }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return n+1;
    }

    public static void main(String[] args) {
        FirstMissingPositive solution = new FirstMissingPositive();
        int[] nums = {3, 4, -1, 1};
        System.out.println("First Missing Positive: " + solution.firstMissingPositive(nums)); // Output: 2
    }
}