import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Read {
    public static void main(String[] args) {
        try{
            File myObj = new File("arquivo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("deu errado!");
            e.printStackTrace();
        }
    }
}
