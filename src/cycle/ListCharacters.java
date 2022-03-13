package cycle;

public class ListCharacters {


    public static void main(String[] args) {
        //for (char c = 0; c < 128; c++) {
        //if (Character.isLowerCase(c)) //char строчная буква
        //     System.out.println("3нaчeниe: " + (int) c + " символ " + c);

        for (int i = 1; i <= 3; i++) {
            for (int r = 1; r <= 3; r++) {
                System.out.println("Вы можете пройти в зал № " + i + ", к окну № " + r);
            }
        }
    }


}
