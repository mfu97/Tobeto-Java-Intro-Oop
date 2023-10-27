package oopWithNLayeredApp.entities;

public class Product {
    private int Id;
    private String name;
    private double unitPrice;

    public Product() {

    }

    public Product(int id, String name, double unitPrice) {
        Id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
