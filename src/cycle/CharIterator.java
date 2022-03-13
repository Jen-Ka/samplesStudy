package cycle;

public class CharIterator {
    public static void main(String[] args) {
        String s = "dfdsgfg";    // new String ("dfdsgfgfdhdh")

        char[] charArray = s.toCharArray();  // сюда перенесена инициализация в случае, когда метод со ссылкой на массив char (см.ниже)

        /*char[] charArray = s.toCharArray();               // так было до extract method printCharWithFor(s);
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }*/
        // printCharWithFor(s);                             // extract method printCharWithFor(s);
        //printCharWithFor(charArray);                      // вид метода в случае, когда метод со ссылкой на массив char (см.ниже)

        /*for (char selectedChar : charArray) {             //foreach - в первой части выражения уже зашифрована раскладка по индексу
            System.out.println(selectedChar);               // так выглядел метод до extract method printCharsWithForEach(charArray);
        }*/

        printCharsWithForEach(charArray);

        /*for (;;){                                     // примеры бесконечных циклов
        //while (true) {
            System.out.println("test");
        }*/
    }
    private static void printCharsWithForEach(char[] charArray) {
        for (char selectedChar : charArray) {        //foreach - в первой части выражения уже зашифрована раскладка по индексу

            /*for (char s2 : charArray){             // вложенный цикл; в таком виде break действует только на внутреннюю часть

                break;
            }*/

    //if (selectedChar == 'f') continue;     // пример работы с безусл.переходом continue - f пропускается, и сразу переход к след.значению.
    //if (selectedChar == 'f'|| selectedChar == 'g') continue;     // пример работы с безусл.переходом continue - f или g пропускается, и сразу переход к след.значению.
    //if (selectedChar == 'g') break;          // пример работы с безусл.переходом break - при встрече с g цикл останавливается.
    System.out.println(selectedChar);
    }
    }


    /*private static void printCharWithFor(char[] charArray) {  // вариант метода с циклом for с ссылкой на массив char[], инициализация выше, в main
    //while (true) return;                                      // место выхода из метода, дальше не идём;
    //   i    0,   1,   2,   3,   4,   5,   6                   // примеры индексов строкового значения
    //char   "d", "f", "d", "s", "g", "f", "g"

        for (int i = 0; i < charArray.length; i++) {
        System.out.println(charArray[i]);
    }*/
    /*private static void printCharWithFor (String s) {             // вариант метода c циклом for с ссылкой на s, инициализация здесь же
        char[] charArray = s.toCharArray();
        //while (true) return;                                      // место выхода из метода, дальше не идём;
        //   i    0,   1,   2,   3,   4,   5,   6                   // примеры индексов строкового значения
        //char   "d", "f", "d", "s", "g", "f", "g"

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        }*/

}
