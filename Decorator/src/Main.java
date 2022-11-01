import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String students = "Sivograkov Kirill\nGolovnev Glev\nBeketov Dmitri";
        BaseDecorator encoded = new EncryptDecorator(
                        new FileDataSource("out/Demo.txt"));
        encoded.writeData(students);
        DataSource plain = new FileDataSource("out/Demo.txt");

        System.out.println("- Input ----------------");
        System.out.println(students);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}