package LeetCode.com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class LastRemaining {
    public static void main (String argss[]){
         System.out.println("圆圈中最后剩下的数字:"+lastRemaining(5,3));        
    }
        private static int lastRemaining(int n, int m) {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(i);
            }
            int index = 0;
            while(n>1){
                 index = (index+m-1)%n;
                list.remove(index);
                n--;
            } 
            return list.get(0);
        }
}
