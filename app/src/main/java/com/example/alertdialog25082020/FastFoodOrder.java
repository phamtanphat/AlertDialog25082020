package com.example.alertdialog25082020;

public class FastFoodOrder implements OrderBuilder {
    private Location location;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
    @Override
    public OrderBuilder setLocation(Location location) {
        this.location = location;
        return this;
    }

    @Override
    public OrderBuilder setBreadType(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(location,breadType,sauceType,vegetableType);
    }
}
