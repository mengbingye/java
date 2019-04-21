package lengthOfLongestSubstring;


import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Solution {


    public static void  test01(int n,int j) {
        if (n == 1) return;
        System.out.println(j);
        test01(n-1,n-1);
    }

    public static void  test02(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {

//        long l = System.currentTimeMillis();
//        test01(100000,0);
//        long l1 = System.currentTimeMillis();

        long l3 = System.currentTimeMillis();

        test02(11);
        long l4 = System.currentTimeMillis();
//        System.out.printf("递归 时间差距 + {%s}\n",l1-l);
        System.out.printf("循环 时间差距 + {%s}",l4-l3);
    }
}
