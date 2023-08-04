public class NumberFrequency {
    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
        System.out.println("Tekrar Sayıları : ");

        for (int i = 0; i < list.length; i++) {
            int repeat = 0;
            boolean isCount = false;

            for (int j = i - 1; j >= 0; j--) {
                if (list[i] == list[j]) {
                    isCount = true;
                    break;
                }
            }

            if (!isCount) {
                for (int k = 0; k < list.length; k++) {
                    if (list[i] == list[k]) {
                        repeat++;
                    }
                }
                System.out.println(list[i] + " sayısı " + repeat + " kere tekrar edildi.");
            }
        }

    }
}