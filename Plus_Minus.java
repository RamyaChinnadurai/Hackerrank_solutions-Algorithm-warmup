import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0){
                pos++;
            }else if(arr[arr_i]<0){
                neg++;
            }else{
                  zero++;      
            }
        }
        System.out.println((pos/n)+"\n"+(neg/n)+"\n"+(zero/n));
    }
}
