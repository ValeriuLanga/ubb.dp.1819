package ro.ubb.dp1819.lab1.exercises.services;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class CoffeeInterpreterService implements ICoffeeInterpreterService {
//        -- a line containing only 3 or 4 words is a valid ingredients line. Fewer or more words are invalid.
//
//        -- of the 3 or 4 words:
//
//        --- one should be a quantity (200)
//
//                --- one should be a unit (ml)
//
//                --- one should be an ingredient (milk)
//
//                --- the last one is optional and should be an adjective (boiled, steamed, roasted, etc.)
    private IFileReaderService fileReaderService;

    public CoffeeInterpreterService(IFileReaderService FileReader){
        fileReaderService = FileReader;
    }

    @Override
    public void interpretIngredients() throws IOException {
        fileReaderService.readFileContents();
        List<String> ingredients = fileReaderService.getFileContents();


    }


}
