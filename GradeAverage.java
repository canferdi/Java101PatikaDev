import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int math, physic, chemistry, eng, history, music;

        System.out.print("Please enter your Math greade: ");
        math = input.nextInt();

        System.out.print("Please enter your Physic greade: ");
        physic = input.nextInt();

        System.out.print("Please enter your Chemistry greade: ");
        chemistry = input.nextInt();

        System.out.print("Please enter your English greade: ");
        eng = input.nextInt();

        System.out.print("Please enter your History greade: ");
        history = input.nextInt();

        System.out.print("Please enter your Music greade: ");
        music = input.nextInt();

        double average = (math + physic + chemistry + eng + history + music) / 6;

        String result = (average >= 60) ? "Passed the class" : "Failed the class";

        System.out.println("Your greade average: " + average);
        System.out.println(result);
        input.close();
    }
}
