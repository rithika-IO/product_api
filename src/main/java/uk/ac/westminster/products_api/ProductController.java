package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Products")
public class ProductController {
    @GetMapping("/{id}")
        public Product GetById(@PathVariable Long id){
            return new Product(id, "Laptop", 999.99);
    }



}

