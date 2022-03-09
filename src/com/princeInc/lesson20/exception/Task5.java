package com.princeInc.lesson20.exception;

/**
 * Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 *
 */
public class Task5 {
  public static void main(String[] args) {
    try {
    catchCustomException();
    } catch (PrinceIncException exception){
      exception.printStackTrace();
    }
  }
  public static void catchCustomException(){
    try {
      unsafe();
    } catch (RuntimeException exception){
      System.out.println("catch in catchCustomException method");
      throw new PrinceIncException(exception);
    }
  }

  public static void unsafe() {
    throw new RuntimeException("Ooops");
  }
}
