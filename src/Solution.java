import java.util.Stack;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }else {
                stack.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length-count;i++){
            nums[i]=stack.pop();
        }
        for(int i=0;i<nums.length-count;i++){
            System.out.println(nums[i]);
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] a={0,1,2,2,3,0,4,2};
        int m=removeElement(a,2);
        System.out.println(m);
    }
}
