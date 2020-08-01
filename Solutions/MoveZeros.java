public class MoveZeros{
    public void moveZeroes(int[] nums) {

        int len = nums.length;
        int temp;
        int i = 0;

        for(int j = 1; j < len; j++){
            if(nums[i] == 0 && nums[j] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            } else if(nums[i] != 0){
                i++;
            }
        }
    }
}