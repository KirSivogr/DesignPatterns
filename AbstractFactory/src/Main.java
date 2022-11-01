import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Application application = new Application();
        String os = in.next();
        application.configApplication(os);
    }
}