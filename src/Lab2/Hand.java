package Lab2;

public class Hand {
    int dlina = 50;

    int dl() {
        return dlina;
    }

    Hand() {
        int g = dl();
        System.out.println("Длина руки: " + g);
    }
}
