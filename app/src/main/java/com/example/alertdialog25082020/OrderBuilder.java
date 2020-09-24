package com.example.alertdialog25082020;

public interface OrderBuilder {
    OrderBuilder setLocation(Location location);
    OrderBuilder setBreadType(BreadType breadType);
    OrderBuilder setSauceType(SauceType sauceType);
    OrderBuilder setVegetableType(VegetableType vegetableType);
    Order build();
}
//new Order().setLocation(ON_SITE).setBreadType
