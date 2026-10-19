package uk.ac.westminster.products_api.product;

public class PhysicalProduct extends Product {

    private double weight;
    private String dimension;

    public PhysicalProduct() {

    }

    public PhysicalProduct(long id, String name, double price, double weight, String dimension) {
        super(id, name, price);
        this.weight = weight;
        this.dimension = dimension;

    }

    public double getWeight() {
        return weight;
    }

    public String getDimension(){
        return dimension;
    }
}
