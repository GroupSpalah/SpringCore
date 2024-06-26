package org.example.via_xml;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@NoArgsConstructor
public class FileReader {
    String fileName;

    /*public FileReader(String fileName) {
        this.fileName = fileName;
    }*/

    public void print() {
        System.out.println("Read from file: " + fileName);
    }

}

