import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Exemplo de BufferedOutputStream
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

        // Exemplo de BufferedInputStream
        try {

            // Cria um objeto da classe FileInputStream
            FileInputStream arquivo = new FileInputStream("teste.txt");

            // Cria um objeto da classe BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(arquivo);

            // Lê o primeiro byte do arquivo
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                // Lê o próximo byte do arquivo
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }
}
