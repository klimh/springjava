package com.typeshit4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repo;

    @Autowired
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    // CREATE
    public Product create(Product p) {
        return repo.save(p);
    }

    // READ all
    public List<Product> findAll() {
        return repo.findAll();
    }

    // READ by id
    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }

    // UPDATE
    public Optional<Product> update(Long id, Product updated) {
        return repo.findById(id)
                .map(p -> {
                    p.setName(updated.getName());
                    p.setPrice(updated.getPrice());
                    return repo.save(p);
                });
    }

    // DELETE
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
