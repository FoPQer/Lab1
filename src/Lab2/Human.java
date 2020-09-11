package Lab2;

import java.util.Scanner;

public class Human {
    private int old = 30;
    private String name = "Gosha";

    public int Job() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public String sayname() {
        return name;
    }

    public Human() {
        int g = Job();
        String gg = sayname();
        System.out.println(g + ' ' + gg);
    }
}
