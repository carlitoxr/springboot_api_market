package com.market.market.persistence;

import com.market.market.persistence.crud.ProductoCrudRepository;
import com.market.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        /* La idea es obtener todos los productos pertenecientes a la misma categoría por ejemplo limpieza
            y que estén ordenados por nombre
         */
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    // Alta de producto
    public Producto nuevoProducto(Producto p) {
        return productoCrudRepository.save(p);
    }

    // Baja de producto
    public void bajaProducto(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
