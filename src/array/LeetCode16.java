
//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
//。假定每组输入只存在唯一答案。 
//
// 
//
// 示例： 
//
// 输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 双指针 
// 👍 643 👎 0

package array;

import java.util.Arrays;

public class LeetCode16 {
    public static void main(String[] args) {
        Solution solution = new LeetCode16().new Solution();
        int ans = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(ans);
    }
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=0;i<length;i++){
            //固定第一个数，如果第一个数与上次固定的一样就更新
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            //固定第二个数和第三个数的起始位置
            int secondIndex=i+1,thirdIndex=length-1;
            while (secondIndex<thirdIndex){
                int sum=nums[i]+nums[secondIndex]+nums[thirdIndex];
                //如果结果更接近目标就更新
                if(Math.abs(target-ans)>Math.abs(target-sum)){
                    ans=sum;
                }
                if(sum<target){
                    secondIndex++;
                }else if(sum>target){
                    thirdIndex--;
                }else {
                    break;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}