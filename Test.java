import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int size = 0;
        List<Integer> square = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] n = new int[a];
        for (int i = 0; i < a; i++) {
            n[i] = sc.nextInt();
            list1.add(n[i]);
        }

        for (int i = 0; i < a; i++) {
            if (Check(n[i])) {
                square.add(n[i]);
                list2.add(i);
            }
        }

        Collections.sort(square,Collections.reverseOrder());

        for (int i = 0; i < list2.size(); i++) {
            list1.set(list2.get(i),square.get(i));

        }
            //print list 1
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }

    public static boolean Check(int n) {
        int temp = (int)Math.sqrt(n);
        return temp * temp == n;
    }


}
