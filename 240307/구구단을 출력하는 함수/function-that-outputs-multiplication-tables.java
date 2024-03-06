import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final List<Integer> integers = new ArrayList<>();
        integers.add(sc.nextInt());
        integers.add(sc.nextInt());
        integers.add(sc.nextInt());
        Collections.sort(integers);

        int middleNum = integers.get(1);

        for(int j = integers.get(0) ; j <= integers.get(2); j++) {
            if(middleNum == j) {
                continue;
            }
            for (int i = 1 ; i <= 9 ; i ++) {
                System.out.println(j + " * " + i + " = " + j*i);
            }
        }
    }
}