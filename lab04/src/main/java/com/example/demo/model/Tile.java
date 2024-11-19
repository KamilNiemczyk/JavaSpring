package com.example.demo.model;

import javax.validation.constraints.*;
import java.util.Date;

public class Tile {
    @NotBlank(message = "ID must not be blank")
    private final String id;
    @NotBlank(message = "Name must not be blank")
    private String name;
    @Min(value= 0, message = "Height must be greater than 0")
    private int height;
    @Min(value= 0, message = "Width must be greater than 0")
    private int width;
    @Min(value= 0, message = "Price must be greater than 0")
    private int price;
    @NotBlank(message = "Material must not be blank")
    private String material;
    @Pattern(regexp = "^[A-Z]", message = "Production location must start with an uppercase letter")
    private String productionLocation;
    private boolean isAvailable;
    @PastOrPresent(message = "Date of production must be in the past or present")
    private Date dateOfProduction;

    public Tile(String id, String name, int height, int width, int price, String material, String productionLocation) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.price = price;
        this.material = material;
        this.productionLocation = productionLocation;
        this.isAvailable = true;
        this.dateOfProduction = new Date();
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

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


}
