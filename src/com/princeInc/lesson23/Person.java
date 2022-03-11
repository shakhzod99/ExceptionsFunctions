package com.princeInc.lesson23;

import java.io.Serializable;

public class Person implements Serializable {

  private static final long serialVersionUID = 1L;
  private int age;
  private transient String FirstName;

  public Person(int age, String firstName) {
    this.age = age;
    FirstName = firstName;
  }

  public int getAge() {
    return age;
  }

  public String getFirstName() {
    return FirstName;
  }

  @Override
  public String toString() {
    return "Person{" +
        "age=" + age +
        ", FirstName='" + FirstName + '\'' +
        '}';
  }
}
