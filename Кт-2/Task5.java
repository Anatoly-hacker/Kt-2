
import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){
        int[] nums = {1, 5, 9};
        Arrays.sort(nums);
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]) {
                int set = nums[i + 1] - nums[i];
                if(set > 1){
                    for (int j = 1; j < set; j++) {
                        num.add(nums[i] + j);
                    }
                }
            }
            else{
                num.add(nums[i] + 1);
            }
        }
        System.out.println(num);
    }
}
