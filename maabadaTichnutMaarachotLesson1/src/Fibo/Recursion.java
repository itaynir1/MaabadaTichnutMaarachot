package Fibo;

public class Recursion {
    public static boolean evenWith4(int i, int count , int [] nums)
    {
        if (i == nums.length)
            return  count >= 4;
        if (nums[i] %2 ==0) return false;
        else
        {
            count++;
            return evenWith4(i+1 , count , nums);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        System.out.println(evenWith4(0,0,nums));
    }
}
