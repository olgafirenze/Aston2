package lesson3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Park {
    private String parkName;
    private Address address;
    private LocalTime parkOpenTime;
    private LocalTime parkCloseTime;
    private ArrayList<Attraction> attractions = new ArrayList<>();

    public class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getFullAddress() {
            return city + ", " + street + ", д. " + building;
        }
    }

    public class Attraction {
        private String attractionName;
        private LocalTime attractionOpenTime;
        private LocalTime attractionCloseTime;
        private double price;

        public Attraction(String attractionName, LocalTime attractionOpenTime, LocalTime attractionCloseTime, double price) {
            this.attractionName = attractionName;
            this.attractionOpenTime = attractionOpenTime;
            this.attractionCloseTime = attractionOpenTime;
            this.price = price;
        }

        public String getInfo() {
            return attractionName + " " + attractionOpenTime + " - " + attractionCloseTime + " " + price + " ₽";
        }
    }


    public Park(String parkName, String city, String street, int building,
                LocalTime parkOpenTime, LocalTime parkCloseTime) {
        this.parkName = parkName;
        this.parkOpenTime = parkOpenTime;
        this.parkCloseTime = parkCloseTime;
        this.address = this.new Address(city, street, building);
    }

    public void addAttraction(String attractionName, LocalTime attractionOpenTime, LocalTime attractionCloseTime, double price) {
        Attraction attraction = this.new Attraction(attractionName, attractionOpenTime, attractionOpenTime, price);
        attractions.add(attraction);
    }

    public void printParkInfo() {
        System.out.println(parkName);
        System.out.println("Адрес: " + address.getFullAddress());
        System.out.println("Время работы: " + parkOpenTime + " - " + parkCloseTime);
        System.out.println("Аттракционы:");
        for (Attraction a : attractions) {
            System.out.println(a.getInfo());
        }
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        Park park = new Park(
                "Парк Горького",
                "Москва", "ул. Крымский Вал", 9,
                LocalTime.parse("09:00", formatter),
                LocalTime.parse("23:00", formatter)
        );

        park.addAttraction("Колесо обозрения",
                LocalTime.parse("10:00", formatter),
                LocalTime.parse("22:00", formatter), 300);

        park.addAttraction("Американские горки",
                LocalTime.parse("11:00", formatter),
                LocalTime.parse("21:00", formatter), 500);

        park.addAttraction("Комната страха",
                LocalTime.parse("12:00", formatter),
                LocalTime.parse("20:00", formatter), 400);

        park.printParkInfo();
    }
}