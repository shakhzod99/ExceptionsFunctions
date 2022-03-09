package com.princeInc.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
  /**
   * [1000_000] -> age -> max
   * <p>
   * [1000_000] -> age -> max -> max
   * <p>
   * [1000_000] -> age -> max
   */
  public static void main(String[] args) {
    Optional<Student> maybeStudent = Stream.of(
        new Student(18, "John"),
        new Student(23, "Michael"),
        new Student(34, "Leo"),
        new Student(45, "Ashraf"),
        new Student(20, "Markus"),
        new Student(68, "Bred"),
        new Student(101, "Thomas")
    )
        .sequential()
//        .flatMap(student -> student.getMarks().stream())
//        .map(mark -> )
//        .map(Student::getAge)
        .reduce(((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2));

    maybeStudent.map(Student::getAge)
//        .flatMap(age -> Optional.ofNullable(null))
        .map(age -> null)
        .ifPresent(System.out::println);
  }
}
