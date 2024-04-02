package org.example.via_xml;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
public class ReaderService {
    FileReader reader;

    public void setReader(FileReader reader) {
        System.out.println("Inside setter");
        this.reader = reader;
    }
}
