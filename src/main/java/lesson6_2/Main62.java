package lesson6_2;

public class Main62 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7(495)123-45-67");
        phoneBook.add("Петров", "+7(926)321-55-66");
        phoneBook.add("Иванов", "+7(495)123-45-67");
        phoneBook.add("Сидоров", "+7(903)999-01-01");
        phoneBook.add("Иванов", "+7(985)929-12-35");

        phoneBook.get("Иванов");
        phoneBook.get("Петров");
        phoneBook.get("Сидоров");
        phoneBook.get("Смирнов");
    }
}
