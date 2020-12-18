
//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针 
// 👍 696 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public static void main(String[] args) {
        Solution solution = new LeetCode18().new Solution();
        List<List<Integer>> lists = solution.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        System.out.println(lists);
    }
        //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums==null||nums.length<4) return ans;
        Arrays.sort(nums);
        int length=nums.length;
        for(int i=0;i<length-3;i++){
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            //剪枝
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target){
                break;
            }
            if(nums[i]+nums[length-1]+nums[length-2]+nums[length-3]<target){
                continue;
            }
            for(int j=i+1;j<length-2;j++){
                if(j!=i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                //剪枝
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target){
                    break;
                }
                if(nums[i]+nums[j]+nums[length-1]+nums[length-2]<target){
                    continue;
                }
                int thirdIndex=j+1,fourthIndex=length-1;
                while (thirdIndex<fourthIndex){
                    //如果等于结果就保存
                    int sum=nums[i]+nums[j]+nums[thirdIndex]+nums[fourthIndex];
                    if(sum==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[thirdIndex]);
                        list.add(nums[fourthIndex]);
                        ans.add(list);
                    }
                    if(sum<=target){
                        //当要遍历的下一个值还是等于上一个就要跳过
                        while (thirdIndex<fourthIndex&&nums[thirdIndex+1]==nums[thirdIndex]){
                            thirdIndex++;
                        }
                        thirdIndex++;
                    }else if(sum>target){
                        //当要遍历的下一个值还是等于上一个就要跳过
                        while (thirdIndex<fourthIndex&&nums[fourthIndex-1]==nums[fourthIndex]){
                            fourthIndex--;
                        }
                        fourthIndex--;
                    }
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}