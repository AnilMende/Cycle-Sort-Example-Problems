public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        System.out.println(MissingPositive(nums));
    }
    static int MissingPositive(int nums[]){
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            //Ignore -ve nums, because we need to return +ve nums
            //nums[i] <= nums.length because if the nums are in 1 to N then N is the greatest Number
            //we can not place the larger than N elements in their right indices
            //compare if the i and current equal or not then swap
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[current]){
                swap(nums, i, current);
            }
            else{
                i++;
            }
        }
        //finding the first missing positive
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != ind+1){
                return ind+1;
            }
        }
        //if all the elements are in the correct indices
        //[1] the output should be 2 because it is the
        //next smallest missing +ve integer
        return nums.length+1;
    }

   static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
