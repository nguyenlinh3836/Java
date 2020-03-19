package ExArray;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n,count = 0;
        int sum = 0 ;
        float avgTemp;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Input n :");
            n = in.nextInt();
        } while (n<0);
        Integer[] temp = new Integer[n];
        System.out.println("Enter" + n + "interger values");
        for(int i =0; i<n;i++){
            temp[i] = in.nextInt();
            sum += temp[i];
        }
        avgTemp = (float)sum /n;
        System.out.println("Temprature Avg is : " + avgTemp);
        for (int i = 0 ; i <n; i++){
            if ((float) temp[i] > avgTemp){
                count++;
            }
        }
        System.out.println("Has " + count + " day higher than average temprature");
    }
}
