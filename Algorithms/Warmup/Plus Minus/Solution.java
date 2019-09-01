public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = -4;
        arr[1] = 3;
        arr[2] = -9;
        arr[3] = 0;
        arr[4] = 4;
        arr[5] = 1;
        plusMinus(arr);
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int a = 0, b = 0, c = 0;
        double length = arr.length;
        for (int val : arr) {
            if (val >= -100 && val <= 100) {
                if (val > 0) {
                    a += 1;
                } else if (val < 0) {
                    b += 1;
                } else if (val == 0) {
                    c += 1;
                }
            }
        }

        System.out.println(String.format("%.5f", (a / length)));
        System.out.println(String.format("%.5f", (b / length)));
        System.out.println(String.format("%.5f", (c / length)));
    }
}
