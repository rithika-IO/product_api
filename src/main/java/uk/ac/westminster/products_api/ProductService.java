package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.product.DigitalProduct;
import uk.ac.westminster.products_api.product.PhysicalProduct;
import uk.ac.westminster.products_api.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ArrayList<Product> products= new ArrayList<>();
    private Long nextId = 1l;

    public List<Product> getAllProducts(){
        return products;
    }

    public Optional<Product> getProductByID(Long Id){
        return products.stream()
                .filter(p -> p.getId().equals(Id))
                .findFirst();
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        products.add(new DigitalProduct(5L,"java basics",1500.00,"fghjk",58.5));
        products.add(new PhysicalProduct(7L,"wireless mouse",14500.00,0.15,"null"));
        return product;

    }

    // Activity 4: removeIf deletes matching items safely (no ConcurrentModificationException)
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Activity 5: keep every product whose name contains the search text
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}
