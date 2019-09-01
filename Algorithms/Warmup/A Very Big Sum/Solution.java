public class Solution {
    public static void main(String[] args) {
        long[] ar = new long[5];
        ar[0] = 1000000001;
        ar[1] = 1000000002;
        ar[2] = 1000000003;
        ar[3] = 1000000004;
        ar[4] = 1000000005;
        System.out.println(aVeryBigSum(ar));
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long val : ar) {
            if(val >= 0 && val <= Math.pow(10,10)){
                result += val;
            }
        }
        return result;
    }
}
