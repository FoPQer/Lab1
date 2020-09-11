package Lab4;

import java.util.Scanner;

public abstract class Dog {
    Scanner sc = new Scanner(System.in);
    String name;
    int old;

    void setName() {
        System.out.println("Введите имя собаки");
        name = sc.nextLine();
    }

    void setOld() {
        System.out.println("Введите возраст собаки");
        old = sc.nextInt();
    }
}
