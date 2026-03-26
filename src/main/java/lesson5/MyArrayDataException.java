package lesson5;

public class MyArrayDataException  extends Exception {
    private int row;
    private int col;
    private String value;

    public MyArrayDataException (int row, int col, String value) {
        super (String.format("Ошибка в ячейке [%d][%d]: '%s' не является числом", row, col, value));
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
    public String getValue() { return value; };
}
