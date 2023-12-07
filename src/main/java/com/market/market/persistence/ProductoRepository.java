package com.market.market.persistence;

import com.market.market.persistence.crud.ProductoCrudRepository;
import com.market.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
