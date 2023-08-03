public class AvarageArray {

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6 };
        double avarage, harmonicAvarage, sum = 0.0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        avarage = sum / list.length;

        for (int i = 0; i < list.length; i++) {
            sum += (1 / list[i]);
        }
        harmonicAvarage = (list.length / sum);

        System.out.println("Listenin Ortalaması : " + avarage);
        System.out.println("Listenin Harmonik Ortalaması : " + harmonicAvarage);

    }

}
