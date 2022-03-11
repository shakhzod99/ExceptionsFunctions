package com.princeInc.lesson22.FileTasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Задан файл с java-кодом. Прочитьать текст программы из файла и все слова
 * public в объявления атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src","com","princeInc","lesson22","FileTasks","Task4.java");
    String stringValue = Files.readString(path);

    String result = stringValue.replace("public", "private");

    Path resultPath = Path.of("resources", "task3.java");
    Files.writeString(resultPath, result);
  }
}
