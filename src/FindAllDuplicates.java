import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(FindDuplicates(nums));
    }

    //Here the values in array are in the range of [1,N]
    //so use index = value - 1;
    static List<Integer> FindDuplicates(int nums[]){
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(nums,i,current);
            }
            else{
                i++;
            }
        }

        //Adding the duplicates where nums[i] == nums[current] into the list
        ArrayList<Integer> list = new ArrayList<>();
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != ind+1){
                list.add(nums[ind]);
            }
        }

        return list;
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
