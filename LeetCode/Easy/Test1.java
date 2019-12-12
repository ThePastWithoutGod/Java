package leetcode.NumArry;

/**
*   暴力循环数组
*/

public class Test1 {
    public int[] twoSum(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == target - nums[j])
                {
                    return new int[]{i, j};
                }
            }
        }
        /**
         * 表示向方法传递了一个不合法的参数
         */
        throw new IllegalArgumentException("No two sum solution");
    }
}
