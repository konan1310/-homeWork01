package HomeWorkApp;

public class HomeWork02 {
    public static void main(String[] args) {

        System.out.println(within10and20(1,2));
        System.out.println(within10and20(9,9));
        System.out.println(within10and20(1,99));
        isPositiveOrNegative(10);
        isPositiveOrNegative(-4);
        System.out.println(isNegative(-2));
        System.out.println(isNegative(-1));
        System.out.println(isNegative(2));
        Lenin();
    }



    public static boolean within10and20(int a, int b) {
        int sum = a+b;
        if (sum >= 10 && sum <=20){
            return true;
        }
        else
        {
            return false;
            //return sum >= 10 && sum <=20 ? true : false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        else

            return false;
    }
    public static void Lenin() {
        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Учиться, ");
            }
            System.out.println("и ещё раз учиться!");
        }
    }
}

