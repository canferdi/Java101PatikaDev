public class DuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] list = { 2, 7, 2, 2, 2, 9, 10, 21, 6, 33, 9, 6 };
        int[] duplicateEven = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] % 2 == 0) && (i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicateEven, list[i])) {
                        duplicateEven[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicateEven) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}
