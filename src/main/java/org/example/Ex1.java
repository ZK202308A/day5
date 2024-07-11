package org.example;

public class Ex1 {

   public static int[] choiceTwo(int[] targetArr) {

       int[] result = new int[2];

       int[ ] arr = targetArr;

       int first = arr[ (int)(Math.random()* arr.length)];
       int second  = arr [ (int)(Math.random()* arr.length)];

       result[0] = first;
       result[1] = second;

       return result;
   }
}
