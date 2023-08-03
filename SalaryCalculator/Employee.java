package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() { //? Maaşa uygulanan vergiyi hesaplar
        if (salary >= 1000) {
            return salary * 0.03;
        }
        return 0;
    }

    public int bonus() {  //? Mesai ücretini hesaplar
        if (workHours > 40) {
            return ((workHours - 40) * 30);
        }
        return 0;
    }

    public double raiseSalary() {  //? Zammı hesaplar
        int workYear = 2021 - hireYear;
        if (workYear < 10) {
            return (salary * 0.05);

        } else if (workYear > 9 && workYear < 20) {
            return (salary * 0.10);

        } else if (workYear > 19) {
            return (salary * 0.15);
        }
        return 0;
    }

    public void printEmploye() { //? Bilgileri yazdırır
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile Birlikte Maaş : " + (salary - tax() + bonus()));
        System.out.println("Zamdan sonraki maaş : "+(salary+raiseSalary()));
    }

}
