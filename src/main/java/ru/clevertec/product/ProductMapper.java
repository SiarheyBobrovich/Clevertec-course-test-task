package ru.clevertec.product;

import ru.clevertec.product.data.ProductDto;
import ru.clevertec.product.entity.Product;

public interface ProductMapper {

    Product toProduct(ProductDto productDto);
    ProductDto toProductDto(Product product);
}
