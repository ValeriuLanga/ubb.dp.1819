package ro.ubb.dp1819.lab1.exercises.services;

import java.io.IOException;
import java.util.List;

public interface IFileReaderService {

    void readFileContents() throws IOException;

    List<String> getFileContents();
}
