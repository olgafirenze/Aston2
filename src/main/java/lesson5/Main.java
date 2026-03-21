public class Main {

    public static void main(String[] args) {
        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };


        try {
            int sum = processArray(testArray);
            System.out.println("Сумма: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        try {
            testArray [6][1] = "0";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nЗадание 4. Вы вышли за границы массива.");
        }
    }

    public static int processArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4.");
        }
        for (int i = 0; i< array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4.");
            }
        }


        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
    return sum;
    }
}
