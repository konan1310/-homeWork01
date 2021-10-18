package HomeWorkApp;

public class Maine {
    public static void main(String[] args) {
        printThreeWords();
        CheckSumSing();
        printColors();
        Numbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aple");
    }

    public static void CheckSumSing() {
        int A = -2;
        int B = 2;
        int C = A + B;

        if (C >= 0) {
            System.out.println("Сумма положительная");
        }
        if (C < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColors() {
        int value = 101;
        if (value <= 0) {
           System.out.println("Красный");
        } if (value > 0 && value < 100) {
        System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зелёный");
    }   }
    public static void Numbers() {
        int A = 2;
        int B = 3;
        if (A >= B || A < B) {
            System.out.println("А больше или = Б");
        }
    }

}






