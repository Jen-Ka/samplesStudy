package homework9l;

public class Dog { // самост.задание 9 лекция. П.2 - перегрузка метода SOUND

    public void sound(char x) {
        System.out.println("Собака лает");
    }

    public void sound(byte x) {
        System.out.println("Собака воет");
    }

    public void sound(short x) {
        System.out.println("Собака скулит");
    }

    public void sound(int x) {
        System.out.println("Собака повизгивает");
    }

    public void sound(long x) {
        System.out.println("Собака тявкает");
    }

    public void sound(float x) {
        System.out.println("Собака подвывает");
    }

    public void sound(double x) {
        System.out.println("Собака взвизгивает");
    }
}
