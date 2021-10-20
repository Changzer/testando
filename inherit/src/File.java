import java.io.FileWriter;
import java.io.IOException;

public class File {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setRaca("chihuahua");
        try {
            FileWriter myWriter = new FileWriter("arquivo.txt");
            myWriter.write(dog.toString());
            myWriter.close();
            System.out.println("deu certo");
        } catch (IOException e) {
            System.out.println("deu errado");
            e.printStackTrace();
        }
    }
}

