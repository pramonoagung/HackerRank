public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        if(n>=1 && n<=100){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
