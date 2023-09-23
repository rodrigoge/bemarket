package br.com.bemarket.api;

import br.com.bemarket.db.Product;
import br.com.bemarket.services.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@Log4j2
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        log.info("Starting get products.");
        var response = productService.getProducts();
        log.info("Finishing get products.");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
