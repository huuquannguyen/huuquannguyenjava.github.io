package lab6.FileHandling;

import java.io.File;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception{
        File file = new File("MyFile.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Java");
        fileWriter.close();
    }
}
