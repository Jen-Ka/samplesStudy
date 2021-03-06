package types;

public class PrimitiveTypes {           // лекция 9 - приведение типов - примеры
    public static void main(String[] args) {

        PrimitiveOverloading check = new PrimitiveOverloading(); // перегрузка методов с примитивами
        check.fl(1);                       // выполняем операцию с 1, получаем fl(int)
        check.fl('a');    //выполняем с char (при этом можно закомментировать метод для char в PrimitiveOverloading, получим также fl(int)
        byte b = 100;
        check.fl(b); //выполняем с byte (при этом можно закомментировать метод для byte в PrimitiveOverloading, получим fl(short)

        /*int t = 200;
        long k = t;                     // простое повышающее приведение - проходит легко, и само
        t = (int) k;                    // понижающее приведение - только принудительно, может сопровождаться потерей данных!
        {
            System.out.println(t);
        }

        int i = 13;
        byte b = (byte) i;  // Принудительное преобразование int в byte
        i = (int) 13.456;   // Принудительное преобразование литерала типа double в int 13
        {
            System.out.println(i);
        }*/

        /*boolean b = true;           //boxing - из примитивного типа в Обёртку
        Boolean b1 = b;

        b = b1;                     //unboxing  - обратно из обёртки в примитивный тип
        {
            System.out.println((boolean) b);
        } */
    }


}
