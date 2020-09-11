package Lab2;

import java.util.Scanner;

public class Head {
    String word;

    String say() {
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        return word;
    }

    public Head() {
        String g = say();
        System.out.println(g);
    }
}
