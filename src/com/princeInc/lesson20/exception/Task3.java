package com.princeInc.lesson20.exception;

/**
 * Создать собственный класс-исключения - наследник класса Exception.
 *  Создать метод, выбрасывающий это исключкие.
 *  Вызвать этот метод и отловить исключение. Вывести stack trace
 *  в консоль.
 */
public class Task3 {
  public static void main(String[] args) {
    try {
      unsafe();
    } catch (PrinceIncException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCause());
      e.printStackTrace();
    }
  }
  public static void unsafe() {
    throw new PrinceIncException(new RuntimeException("runTime exception"));
  }
}
