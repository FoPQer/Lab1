package Lab2;

import java.util.Scanner;

public class Human {
    private int old = 30;
    private String name = "Гоша";

    public int Job()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменные для работы");
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
        System.out.println("Результат работы " + g + " Имя человека: " + gg);
    }
}
