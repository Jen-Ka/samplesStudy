package cycle;

public class TestSwitch {
    public static void main(String[] args) {
        char[] charTestSwitch = "abcde".toCharArray();
        for (char selectChar : charTestSwitch){
            switch (selectChar) {
                case 'a' :
                    System.out.println("буква A"); break;
                case 'b' :
                    System.out.println("буква B"); break;
                case 'c' :
                    System.out.println("буква C"); break;
                case 'd' :
                    System.out.println("буква D"); break;
                case 'e' :
                    System.out.println("буква E"); break;
                default: System.out.println("алфавит закончился"); break;
            }
        }
    }
}
