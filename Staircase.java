import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int k=n-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
