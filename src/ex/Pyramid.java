package ex;

public class Pyramid {

    public static void main(String[] args) {
        int line = 10;

        for (int i = 0; i < line ; i++) {

            for (int j = 1; j < line -i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
