package ru.clevertec.product.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import ru.clevertec.product.entity.Product;

public interface ProductRepository {

    Optional<Product> findById(UUID uuid);
    List<Product> findAll();

}
