package com.example.demo.model;


public class Tile {
    private final String id;
    private String name;
    private int height;
    private int width;
    private int price;
    private String material;
    private String productionLocation;

    public Tile(String id, String name, int height, int width, int price, String material, String productionLocation) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.price = price;
        this.material = material;
        this.productionLocation = productionLocation;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setProductionLocation(String productionLocation) {
        this.productionLocation = productionLocation;
    }

    public String getProductionLocation() {
        return productionLocation;
    }


}
