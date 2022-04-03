package Massive;

public class Moloko {
    public static int CAPACITY = 1; // статическое поле - константа

    private String name;

    public Moloko(String name){
        this.name = name;
    }

    @Override    // переопределённый метод toString из класса Object для корректной печати name в main
    public String toString() {
        return "Moloko{" +
                "name= '" + name + '\'' +
                "}";
    }
}
