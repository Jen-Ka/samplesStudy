package types;

public class Tree {

    private int height;

        public Tree() {  // пример перегрузки методов - тут конструктор пустой-простой, без параметров; ниже - с параметром, и тем же именем.
            System.out.println("Сажаем росток");
            height = 0;
        }

        public Tree(int initialHeight) {
            height = initialHeight;
            System.out.println("Создание нового дерева высотой "+ height + " м.");
        }

        public void info() { // метод без параметров, ниже с параметром.
            System.out.println("Дерево высотой " + height + " м.");
        }

        public void info(String s) { // второй такой же метод создать нельзя, должен отличаться типом аргумента (пример ниже)
            System.out.println(s + ": Дерево высотой " + height + " м.");
        }

        public void info(Integer s) {
            System.out.println(s + ": Дерево высотой " + height + " м.");
        }

        /*public void String info(String s) {       // возвращаемый тип не является конструкцией для возможности перегрузки метода!
            System.out.println(s + ": Дерево высотой " + height + " м.");
        }*/
}

