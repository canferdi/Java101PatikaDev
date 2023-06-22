import java.util.Scanner;

public class AdvancedGradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int grade, total = 0, lessons = 0;
        double average;

        System.out.print("Matematik notu: ");
        grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            total += grade;
            lessons++;
        }

        System.out.print("Fizik notu: ");
        grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            total += grade;
            lessons++;
        }

        System.out.print("Türkçe notu: ");
        grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            total += grade;
            lessons++;
        }

        System.out.print("Kimya notu: ");
        grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            total += grade;
            lessons++;
        }

        System.out.print("Müzik notu: ");
        grade = input.nextInt();
        if (grade <= 100 && grade >= 0) {
            total += grade;
            lessons++;
        }

        average = total / lessons;

        System.out.println("Ortalamaya katılan ders sayısı: " + lessons);
        System.out.println("Not ortalamanız: " + average);
        
        input.close();

    }
}
