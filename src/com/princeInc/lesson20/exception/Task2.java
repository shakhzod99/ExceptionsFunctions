package com.princeInc.lesson20.exception;

/**
 * Написать код, который создаст, а затем отловит
 * ArrayIndexOfBoundException.
 */
public class Task2 {
  public static void main(String[] args) {
    int[] values = {1,2,4,6,8};
    try{
      for (int i=0; i<=values.length; i++){
        System.out.println(values[i]);
      }
    }
    catch (ArrayIndexOutOfBoundsException exception){
      System.err.println("Catch");
      exception.printStackTrace();
    }
    System.err.println("end");
  }
}
