package com.visual.casalinda;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String code;
    private String description;
    private int quantity;

    private String category;

    public static List<Product> productList = new ArrayList<>();

    public Product(String productName, String productCode, String productDescription, String productQuantity, String productCategory) {
        this.name = productName;
        this.code = productCode;
        this.description = productDescription;
        this.quantity = Integer.parseInt(productQuantity);
        this.category = productCategory;
        productList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) { //abrir janela q n é possivel ter quantidade negativa na segunda tela

        if (this.quantity < 0) {
           System.out.println("Nao eh possiver ter quantidade negativa");
        }
        this.quantity += quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                '}';
    }
}


