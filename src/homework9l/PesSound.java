package homework9l;

public class PesSound { // самост.задание 9 лекция. П.2 - перегрузка метода SOUND
    public static void main(String[] args) {
        Dog dogs = new Dog();
        byte a = 100;
        dogs.sound(a);
        short b = 2;
        dogs.sound(b);
        char c = 'q';
        dogs.sound(c);
        int d = 4;
        dogs.sound(d);
        long e = 237;
        dogs.sound(e);
        float f = 8;
        dogs.sound(f);
        double g = 3.23;
        dogs.sound(g);


    }
}
