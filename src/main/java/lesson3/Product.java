package lesson3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private String name;
    private LocalDate prodDate;
    private String manufacturer;
    private String originCountry;
    private double price;
    private boolean reserved;

    public Product(String name, LocalDate prodDate, String manufacturer, String originCountry, double price, boolean reserved) {
        this.name = name;
        this.prodDate = prodDate;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.price = price;
        this.reserved = reserved;
    }

    public void info() {
        System.out.println("название: " + name + "; дата производства: " + prodDate + "; производитель: " + manufacturer + "; страна происхождения: " + originCountry + "; цена: " + price + "; состояние бронирования покупателем: " + reserved);
    }

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", LocalDate.parse("01.02.2025", dateFormatter), "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("X1", LocalDate.parse("02.03.2025", dateFormatter), "Autovaz", "Russia", 15000, false);
        productsArray[2] = new Product("Y 2", LocalDate.parse("03.04.2025", dateFormatter), "Amazon", "USA", 15599, false);
        productsArray[3] = new Product("123 Canada", LocalDate.parse("04.05.2025", dateFormatter), "Samsung Corp.", "Canada", 12599, true);
        productsArray[4] = new Product("Yamaha 500", LocalDate.parse("05.06.2025", dateFormatter), "Yamaha Corp.", "Japan", 10000, true);
        for (Product product : productsArray) {
            product.info();
        }
    }
}
