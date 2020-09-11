package Lab3;

public class Haski extends Dog {
    String por = "Хаски";
    Haski() {
        setName();
        setOld();
    }
    void out()
    {
        System.out.println("Порода: "+ por + ", имя: " + name + ", возраст: " + old);
    }
}
