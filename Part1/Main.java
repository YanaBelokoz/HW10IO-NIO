package Part1;

import java.io.*;


public class Main {

    public static void main (String[]args)throws Exception {
        writeToFile();

    }
    public static void writeToFile()throws Exception{
        OutputStream outputStream = new FileOutputStream("first.txt");
        String text = "Write to text by byte";
        outputStream.write(text.getBytes());
        outputStream.close();
    }
    public static void readFromFileByteStream() throws Exception {
        InputStream inputStream = new FileInputStream("second.txt");
        byte[] byteArray = inputStream.readAllBytes();
        String textInput = new String(byteArray);
        String s = "From file we get: " + textInput;
        inputStream.close();
    }

    public static void writeToFileCharacter() throws Exception {
        Writer writer = new FileWriter("third.txt");
        String text = "Some text for write in the third file";
        writer.write(text);
        writer.close();
    }

    public static void readFromFileCharacter(){
        try (Reader reader = new FileReader("third.txt")) {
            int data = reader.read();
            String s = "";
            while (data != -1){
                char dataChar = (char) data;
                s = s + dataChar;
                data = reader.read();
                String s1 = "Here is a text from file " + s;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
