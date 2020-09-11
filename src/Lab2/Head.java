package Lab2;

import java.util.Scanner;

public class Head {
    String word;

    String say() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово, что бы сказать");
        word = sc.nextLine();
        return word;
    }

    public Head() {
        String g = say();
        System.out.println("Гоша сказал: " + g);
    }
}
