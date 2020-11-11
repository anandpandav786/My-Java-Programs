
import java.util.Scanner;

class Dog {

    //variables(attributes)
    String breed, color, temper;

    //Method(Actions)
    void setData(String a, String b, String c) {
        breed = a;
        color = b;
        temper = c;
    }

    void show() {
        System.out.println(breed + " " + color + " " + temper);
    }

}

public class DogClass {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setData("Labro", "Black", "Aggressive");
        d1.show();
    }

}
