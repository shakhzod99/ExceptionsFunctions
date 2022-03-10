package com.princeInc.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class WriterRunner {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("resources", "writer2.poem");
    LocalDateTime localDateTime = LocalDateTime.now();
//    try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {

    Files.write(path, List.of("Hello world!", localDateTime.toString()));

//    try (BufferedWriter fileWriter = Files.newBufferedWriter(file) ) {
//      fileWriter.append(" Hello World! ");
//      fileWriter.newLine();
//      fileWriter.append(localDateTime.toString());
//    }
  }
}
