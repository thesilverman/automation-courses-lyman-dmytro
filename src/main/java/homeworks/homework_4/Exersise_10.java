package homeworks.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Exersise_10 {

  public static void main(String[] args) {

       int [] array = {12,104,81};
        int accum = 0;

        for(int i = 0; i < array.length; i++) {
            String[] arr2 = Integer.toString(array[i]).split("");
            System.out.println(Arrays.toString(arr2));
            for(int k = 0; k < arr2.length; k++) {
               accum = accum + Integer.parseInt(arr2[k]);
            }
        }
      System.out.println(accum);



    }
}
