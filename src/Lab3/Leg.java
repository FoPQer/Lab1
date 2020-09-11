package Lab3;

public class Leg {
    int rast = 0;

    int hod() {
        rast++;
        return rast;
    }

    public Leg() {
        int g = hod();
        System.out.println(g);
    }
}
