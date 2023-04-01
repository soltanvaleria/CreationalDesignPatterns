package org.prototype;

import java.time.LocalDateTime;

public class TxtFile implements File{
  private final FileType fileType;

  private final String dataFromFile;
  private final LocalDateTime dateCreation;

  TxtFile(String dataFromFile, LocalDateTime date)
  {
    this.dataFromFile=dataFromFile;
    this.dateCreation = date;
    this.fileType = FileType.TXT;
  }

  @Override
  public File clone() {
    return new TxtFile(this.dataFromFile, this.dateCreation);
  }

  @Override
  public String toString() {
    return "TxtFile{" +
        "fileType=" + fileType +
        ", dataFromFile='" + dataFromFile + '\'' +
        ", dateCreation=" + dateCreation +
        '}';
  }
}
