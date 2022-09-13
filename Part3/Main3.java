package Part3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    private static String inputDataString;

    public static void main(String[] args) {
        stringInput(inputDataString);
    }
    public static void readFile(String fileName){
        File file = new File(fileName);
        try (FileReader input = new FileReader(file)){
            char[] chars = new char[(int) file.length()];
            input.read(chars);
            inputDataString = new String(chars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void stringInput(String text){
        String [] strings = text.split("\n");
        for (String string:strings) {
            if ((string.startsWith("//")));
        }
    }
}
