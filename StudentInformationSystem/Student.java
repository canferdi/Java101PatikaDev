package StudentInformationSystem;

public class Student {

    String name, stuNo;
    Course course1, course2, course3;
    double avarage;
    int classes;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int course1, int course2, int course3) {
        if (course1 >= 0 && course1 <= 100) {
            this.course1.note = course1;
        }
        if (course2 >= 0 && course2 <= 100) {
            this.course2.note = course2;
        }
        if (course3 >= 0 && course3 <= 100) {
            this.course3.note = course3;
        }

    }

    public void isPass() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");

        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti");

            } else {
                System.out.println("Sınıfta kaldı");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.course1.note + this.course2.note + this.course3.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("-------------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println(this.course1.name + " Dersinin Notu: " + this.course1.note);
        System.out.println(this.course2.name + " Dersinin Notu: " + this.course2.note);
        System.out.println(this.course3.name + " Dersinin Notu: " + this.course3.note);

    }

}
