package org.prototype;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

  public static void main(String[] args) {
    List<File> files = new ArrayList<>();
    java.io.File file = new java.io.File("C:/UTM/Anul3/TMPS/laborator_1/src/main/java/org/prototype/file.txt");
    java.io.File file2 = new java.io.File("C:/UTM/Anul3/TMPS/laborator_1/src/main/java/org/prototype/csvfile.csv");
    String dataTxt = "";
    String dataCsv = "";
    try {
      Scanner reader = new Scanner(file);
      Scanner readerCsv = new Scanner(file2);
      while (reader.hasNext()){
        dataTxt = dataTxt+"\n"+reader.nextLine();
      }
      while (readerCsv.hasNext()){
        dataCsv = dataCsv+"\n"+readerCsv.nextLine();
      }
      TxtFile txtFile = new TxtFile(dataTxt, LocalDateTime.now());
      files.add(txtFile);
      files.add(txtFile.clone());
      CsvFile csvFile = new CsvFile(dataCsv,LocalDateTime.now());
      files.add(csvFile);
      files.add(csvFile.clone());


      for (File f: files){
        System.out.println(f.toString());
      }

      System.out.println();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }

  }

}
