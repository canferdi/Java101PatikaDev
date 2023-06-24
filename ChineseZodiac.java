import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear, yearMod12;
        String zodiac = "";

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = input.nextInt();

        yearMod12 = birthYear % 12;

        switch (yearMod12) {
            case 0:
                zodiac = "Maymun";
                break;

            case 1:
                zodiac = "Horoz";
                break;

            case 2:
                zodiac = "Köpek";
                break;

            case 3:
                zodiac = "Domuz";
                break;

            case 4:
                zodiac = "Fare";
                break;

            case 5:
                zodiac = "Öküz";
                break;

            case 6:
                zodiac = "Kaplan";
                break;

            case 7:
                zodiac = "Tavşan";
                break;

            case 8:
                zodiac = "Ejderha";
                break;

            case 9:
                zodiac = "Yılan";
                break;

            case 10:
                zodiac = "At";
                break;

            case 11:
                zodiac = "Koyun";
                break;

            default:
                System.out.println("Hatalı doğum tarihi!");
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        input.close();
    }
}
