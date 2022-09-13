package Part4;
import java.io.File;
import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input file path: ");
        String folderName = in.nextLine();
        File file = new File(folderName);
        File[] folders = file.listFiles();
        if (file.exists()){
            assert file !=null;
            for (File ignored : folders) {
                if (file.isDirectory());
            }
        }

    }
}
