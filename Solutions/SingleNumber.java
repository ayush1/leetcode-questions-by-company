public class SingleNumber{
    public int singleNumber(int[] nums) {
        int x = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++){
            x ^= nums[i];
        }
        return x;
    }
}