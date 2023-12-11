package com.market.market.domain;

public class Product {
    private int productId; // Representa idProducto de persistence/entity/Producto
    private String name; // Representa nombre de persistence/entity/Producto
    private int categoryId; // Representa idCategoria de persistence/entity/Producto
    private double price; // Representa precioVenta de persistence/entity/Producto
    private int stock; // Representa cantidadStock de persistence/entity/Producto
    private boolean active; // Representa estado de persistence/entity/Producto
    private Category category; // Representa categoria de persistence/entity/Producto

    // barCode (persistence/entity/Producto.codigoBarras) no va a estar representado

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
