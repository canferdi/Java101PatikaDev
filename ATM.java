import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int balance, price, right, choose;

        balance = 1500;
        right = 3;

        while (right > 0) {

            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Bankamıza hoşgeldiniz");

                do {
                    System.out.println("---------------------");
                    System.out.println("1-Para yatırma \n2-Para çekme \n3-Bakiye görüntüleme \n4-Çıkış yapma");
                    System.out.print("Seçiminiz: ");
                    choose = input.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar: ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Paranız başarılı bir şekilde yatırıldı.");

                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar: ");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                                System.out.println("Paranız başarılı bir şekilde çekildi.");
                            }

                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + "TL");

                            break;

                        default:
                            break;
                    }
                } while (choose != 4);
                System.out.println("Çıkış yapılıyor");
                break;

            } else { // username veya password hatalı olma durumu
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre, lütfen tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz!");

                } else {
                    System.out.println(right + "deneme hakkınız kaldı.");
                }
            }

        }
        input.close();
    }

}
