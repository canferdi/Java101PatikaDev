import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password, choice, newPassword;

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarıyla giriş yaptınız.");
            
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?: ");
            choice = inp.nextLine();
            inp.close();

            if (choice.equals("evet")) {

                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz!");
                
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
                
            } 
                
            
        }

    }
}
