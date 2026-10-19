package uk.ac.westminster.products_api.product;

public class DigitalProduct extends Product {

    private String dowloadUrl;
    private double fileSizeMb;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id,String name, double price,String dowloadUrl, double fileSizeMb){
        super(id, name,price);
        this.dowloadUrl = dowloadUrl;
        this.fileSizeMb = fileSizeMb;
    }

    public String getDowloadUrl() {
        return dowloadUrl;
    }

    public double getFileSizeMb() {
        return fileSizeMb;
    }
}
