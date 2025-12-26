
import java.util.ArrayList;
import java.util.List;
class FindAllMissing {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNums(nums));
    }
    static List<Integer> findDisappearedNums(int nums[]){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        //Add elements to the list
        ArrayList<Integer> list = new ArrayList<>();
        for(int ind = 0;ind < nums.length;ind++){
            if(nums[ind] != ind + 1){
                list.add(ind+1);
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
