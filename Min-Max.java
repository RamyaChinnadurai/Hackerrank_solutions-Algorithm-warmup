import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        long a[] = new long[5];
        for(int i=0;i<5;i++){
            a[i] = in.nextLong();
            sum += a[i];
        }
        Arrays.sort(a);
        System.out.print((sum - a[4])+" "+ (sum-a[0]) );
        
    }
}
