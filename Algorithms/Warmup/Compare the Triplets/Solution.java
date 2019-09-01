import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> res = new ArrayList<>();
        res = compareTriplets(a, b);
        System.out.println(res.get(0));
        System.out.println(res.get(1));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.clear();
        int ra = 0;
        int rb = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)>=1 && a.get(i)<=100 && b.get(i)>=1 && b.get(i)<=100){
                if (a.get(i) > b.get(i)) {
                    ra = ra + 1;
                } else if (a.get(i) < b.get(i)) {
                    rb = rb + 1;
                } else if (a.get(i) == b.get(i)) {

                }
            }
        }
        result.add(ra);
        result.add(rb);

        return result;
    }
}
