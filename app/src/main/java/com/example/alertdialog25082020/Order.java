package com.example.alertdialog25082020;

public class Order {
    private Location location;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public Order(Location location, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
        this.location = location;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }
    // alt + insert

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public void setVegetableType(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "location=" + location +
                ", breadType=" + breadType +
                ", sauceType=" + sauceType +
                ", vegetableType=" + vegetableType +
                '}';
    }

    static class Builder implements OrderBuilder{
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
}
