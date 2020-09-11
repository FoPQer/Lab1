package Lab3;
public class Dogg extends Dog {
    String por = "Дог";

    Dogg() {
        setName();
        setOld();
    }
    void out()
    {
        System.out.println("Порода: "+ por + ", имя: " + name + ", возраст: " + old);
    }
}
