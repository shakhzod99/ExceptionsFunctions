package com.princeInc.lesson22;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class OutputRunner {
  public static void main(String[] args) throws IOException {
    File file = Path.of("resources", "output.txt").toFile();
    try (BufferedOutputStream outputStream =new BufferedOutputStream(new FileOutputStream(file,true))) {
      LocalDateTime localDateTime = LocalDateTime.now();
      String value = "Hello world!";
      String dateTime = localDateTime.toString();
      outputStream.write(dateTime.getBytes());
      outputStream.write(System.lineSeparator().getBytes());
      System.out.println("Successfully written data to " + file);
    }
  }
}
