package practice;

public class CommonElement {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = {20, 25, 30, 50, 60, 70};

        int[] common = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common[k] = arr1[i];
                    k++;
                }
            }
        }

        System.out.println("Common Elements:");

        for (int i = 0; i < k; i++) {
            System.out.println(common[i]);
        }
    }
}