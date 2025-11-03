import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        String username = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String password = scanner.nextLine();  // Konsolda görünür

        System.out.println("Kullanıcı adı: " + username);
        System.out.println("Şifre: " + password);

        if("admin".equalsIgnoreCase(username) && "1234".equalsIgnoreCase(password)) {
            System.out.println("Başarılı");

        }else{
            System.out.println("Başarısız");

        }
    }
}
