package org.prototype;

import java.time.LocalDateTime;

public class CsvFile implements File{

  private final FileType fileType;
  private final String dataFromFile;
  private final LocalDateTime dateCreation;

  CsvFile(String dataFromFile, LocalDateTime date)
  {
    this.dataFromFile=dataFromFile;
    this.dateCreation = date;
    this.fileType= FileType.PDF;
  }


  @Override
  public File clone() {
    return new CsvFile(this.dataFromFile, this.dateCreation);
  }

  @Override
  public String toString() {
    return "PdfFile{" +
        "fileType=" + fileType +
        ", dataFromFile='" + dataFromFile + '\'' +
        ", dateCreation=" + dateCreation +
        '}';
  }
}
