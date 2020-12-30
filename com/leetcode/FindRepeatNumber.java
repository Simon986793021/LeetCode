package LeetCode.com.leetcode;

public class FindRepeatNumber{
    public static void main (String argss[]){
        int test []=new int [] {2,3,1,1,4,2,6};
        System.out.println("数组中第一个重复的数字为："+findRepeatNumber(test));
    }
    private static int findRepeatNumber(int nums[]){
        int temp[] = new int[nums.length];
        for(int num :nums){
            temp[num]++;
            if(temp[num]>1){
                return num;
            }
        }
        return -1;
    }
}