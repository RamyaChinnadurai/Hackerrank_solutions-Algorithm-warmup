import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String hour = time.substring(0,2);
        String mins = time.substring(3,5);
        String secs = time.substring(6,8);
        String meri = time.substring(8,10);
        if(meri.equals("AM")){
            if(Integer.parseInt(hour) == 12){
                System.out.println("00:"+mins+":"+secs);
            }
            else{
                System.out.println(hour+":"+mins+":"+secs);
            }
        }else{
            if(Integer.parseInt(hour) < 12 ){
                System.out.println((12+Integer.parseInt(hour))+":"+mins+":"+secs);
            }
            else{
                System.out.println(hour+":"+mins+":"+secs);
            }
        }
        
    }
}
