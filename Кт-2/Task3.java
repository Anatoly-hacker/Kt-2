import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5,   2 };
        Arrays.sort(nums);
        int count = 1;
        int maxcount = 1;
        int element = nums[0];
        boolean twoElement = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                    element = nums[i];
                    twoElement = false;
                } else if (count == maxcount) {
                    twoElement = true;
                }
            } else
                count = 1;
        }
        if(twoElement)
            System.out.println(-1);
        else {
            System.out.println(element);
        }
    }
}
