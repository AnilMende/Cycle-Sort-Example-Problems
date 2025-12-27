import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int [] findErrorNums(int nums[]){
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(nums, i, current);
            }
            else{
                i++;
            }
        }

        //add the missing number and repeating number to the array
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != ind+1){
                return new int[] {nums[ind], ind+1};
            }
        }

        return new int[] {-1,-1};
    }
    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
