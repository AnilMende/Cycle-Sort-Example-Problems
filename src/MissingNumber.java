import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int nums[] = {4,0,1,2};
        System.out.println(sort(nums));
    }

    static int sort(int nums[]){
        int i = 0;
        while(i < nums.length){
            int current = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[current]){
                swap(nums,i, current);
            }
            else{
                i++;
            }
        }
        //searching for the missing element
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != ind){
                return ind;
            }
        }

        return nums.length;
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
