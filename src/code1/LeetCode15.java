package code1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zdl
 * @create 2020/9/17 14:25
 */
public class LeetCode15 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums=new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }

    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     *给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     *
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists=new ArrayList<>();
            Arrays.sort(nums);
            //数据长度
            int n=nums.length;
            for(int first=0;first<n;first++){
                //因为不能存在重复三元组，需要跳过相同的
                if(first>0&&nums[first]==nums[first-1]){
                    continue;
                }
                //第三个数从右边遍历
                int third=n-1;
                for(int second=first+1;second<third;second++){
                    if(second>first+1&&nums[second]==nums[second-1]){
                        continue;
                    }
                    //当满足第三个数大于第二个数时，如果三数之和大于0则第三个数向前移一位
                    while (second<third&&nums[first]+nums[second]+nums[third]>0){
                        third--;
                    }
                    if(second==third){
                        break;
                    }
                    if(nums[first]+nums[second]+nums[third]==0){
                        List list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        lists.add(list);
                    }
                }


            }
            return lists;
        }
    }
}


