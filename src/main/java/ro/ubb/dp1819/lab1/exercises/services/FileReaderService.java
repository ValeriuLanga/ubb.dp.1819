package ro.ubb.dp1819.lab1.exercises.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService implements IFileReaderService {

    private String path;
    List<String> fileContents;

    public FileReaderService(String Path){
        path = Path;
    }

    public void SetPath(String Path){
        path = Path;
    }


    @Override
    public void readFileContents() throws IOException {

        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<String> stringList = new ArrayList<>();
        String string;

        while ((string = bufferedReader.readLine()) != null)
            stringList.add(string);

        stringList.forEach(System.out::println);
    }

    @Override
    public List<String> getFileContents() {
        return fileContents;
    }
}
