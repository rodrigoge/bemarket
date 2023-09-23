package br.com.bemarket.services;

import br.com.bemarket.db.Product;
import br.com.bemarket.repositories.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        log.info("Starting flow get products.");
        var products = productRepository.findAll();
        log.info("Finishing flow get products.");
        return products;
    }
}
