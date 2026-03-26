package lesson6_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phone) {
        if (surname == null || surname.trim().isEmpty()) {
            System.out.println("Ошибка: фамилия не может быть пустой.");
            return;
        }

        if (phone == null || phone.trim().isEmpty()) {
            System.out.println("Ошибка: номер телефона не может быть пустым.");
            return;
        }

        surname = surname.trim();
        phone = phone.trim();

        if (!phoneBook.containsKey(surname)) {
            Set<String> phones = new HashSet<>();
            phones.add(phone);
            phoneBook.put(surname, phones);
            System.out.println("Добавлено: " + surname + " " + phone);
        } else {
            Set<String> phones = phoneBook.get(surname);
            if (phones.contains(phone)) {
                System.out.println("Номер " + phone + " уже существует для фамилии " + surname);
            } else {
                phones.add(phone);
                System.out.println("Добавлен номер " + phone + " для " + surname);
            }
        }
    }

    public void get (String surname) {
        if (surname == null || surname.trim().isEmpty()) {
            System.out.println("Ошибка: фамилия не может быть пустой.");
            return;
        }

        surname = surname.trim();
        Set<String> phones = phoneBook.get(surname);

        if (phones == null || phones.isEmpty()) {
            System.out.println(surname + " не найден(а)");
        } else {
            System.out.println(surname);
            int counter = 1;
            for (String phone : phones) {
                System.out.println(phone);
                counter++;
            }
        }
    }
}
