public class FindDuplicateNumber {
    public static void main(String[] args) {

        int nums [] = {1,3,4,2,2};
        System.out.println(sort(nums));
    }
    static int sort(int nums[]){
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i + 1){
                int current = nums[i] - 1;
                //only swap if the element at the i and current index are different
                if(nums[i] != nums[current]){
                    swap(nums,i, current);
                }
                //else block gets executed if the elements at the
                //i and current indexes are equal indicates tha duplicate element
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
