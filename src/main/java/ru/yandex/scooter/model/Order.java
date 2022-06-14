package ru.yandex.scooter.model;

import java.util.List;

public class Order {

    private final String firstName = "Женя";

    private final String lastName = "Лукашин";

    private final String address = "3-я улица строителей 25";

    private final int metroStation = 4;

    private final String phone = "+71111111111";

    private final int rentTime = 4;

    private final String deliveryDate = "2022-05-25";

    private final String comment = "Комментаотй";

    private List<String> scooterColor;

    public Order() {
    }

    public Order(List<String> scooterColor) {
        this.scooterColor = scooterColor;
    }

    public List<String> getScooterColor() {
        return scooterColor;
    }

    public void setScooterColor(List<String> scooterColor) {
        this.scooterColor = scooterColor;
    }
}

