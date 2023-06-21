import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        String data = "Primeiro teste";

        try {

            FileOutputStream file = new FileOutputStream(" teste2006.txt");


            BufferedOutputStream buffer = new BufferedOutputStream(file);


            buffer.write(data.getBytes());


            buffer.flush();
            System.out.println("Os dados foram inseridos no arquivo txt");
            buffer.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
