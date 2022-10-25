import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> name = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            name.add(sc.nextLine());
        }



        for (int i = 0; i < name.size(); i++) {
            String temp = name.get(i);
            String reverse = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);
            }
            name.set(i, reverse);
        }


        List<String> firstName = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            String temp = name.get(i);
            String first = "";
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == ' ') {
                    break;
                }
                first += temp.charAt(j);
            }
            firstName.add(first);
        }


        for (int i = 0; i < firstName.size(); i++) {
            String temp = firstName.get(i);
            String reverse = "";
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverse += temp.charAt(j);
            }
            firstName.set(i, reverse);
        }


        for (int i = 0; i < firstName.size(); i++) {
            for (int j = i + 1; j < firstName.size(); j++) {
                if (firstName.get(i).compareTo(firstName.get(j)) > 0) {
                    String temp = firstName.get(i);
                    firstName.set(i, firstName.get(j));
                    firstName.set(j, temp);
                }
            }
        }



        int count = 1;
        for (int i = 0; i < firstName.size() -1 ; i++) {

            if (firstName.get(i).equals(firstName.get(i + 1))) {
                count++;
            } else {
                System.out.println(firstName.get(i) + " " + count);
                count = 1;
            }
        }

        System.out.print(firstName.get(firstName.size() - 1) + " " + count);
        

    }
}
