public class Lesson2 {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //checkSumFrom10To20(5, 11);
        //numberSign(18);
        //negativeNumber(-125)
        //printString("Мяу", 7);
        //leapYear_(1978);
        //arrInversion();
        //arr100();
        //arrLess6();
        //arrDiagonal();
        //lenInitialValue (5,72);
    }

    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign () {
        int a = 15;
        int b = -5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void printColor () {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

    }

    public static void compareNumbers () {
        int a = 1;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumFrom10To20 (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberSign (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean negativeNumber (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString (String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear_ (int year) {
        if (year % 400 == 0) {return true;}
        if (year % 100 == 0) {return false;}
        if (year % 4 ==0) {return true;}
        else {return false;}
    }

    public static void arrInversion () {
        int [] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int a : arr) {
            if (a == 1) {
                a =0;
            } else {
                a =1;
            }
            System.out.print(a + ",");
        }
    }

    public static void arr100 () {
        int counter = 1;
        int [] arr = new int [100];
        for (int i = 0; i < 100; i++) {
            arr [i] = counter;
            System.out.print(arr [i] + " ");
            counter++;
        }
    }

    public static void arrLess6 () {
        int [] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int a : arr) {
            if (a < 6) {
                a*=2;
            }
        }
    }

    public static void arrDiagonal () {
        int [] [] arr = new int [5] [5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    arr [i] [j] = 1;
                }
            }
        }
    }

    public static int [] lenInitialValue (int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr [i] = initialValue;
        }
        return arr;
    }
}