package Part2;

import java.io.*;
import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Main2 {
    public static void main(String[]args){
        readFromPDF();
    }
    public static void readFromPDF() {
        long startTime = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream("3.3.pdf")){
            int data = inputStream.read();
            while (data != -1) {
                data = inputStream.read();
            }
            long endTime = System.currentTimeMillis();
            long seconds = (endTime - startTime)/1000;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void readFromPDFWithBuffer() {
        long startTime = System.currentTimeMillis();
        try (InputStream inputStream = new FileInputStream("6.1.pdf")){
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            while (true) {
                byte b = dataInputStream.readByte();
            }
            long seconds = (endTime - startTime)/1000;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}