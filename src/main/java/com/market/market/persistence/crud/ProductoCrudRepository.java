package com.market.market.persistence.crud;

import com.market.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>  {

    /*
    *   usando query nativo
    * *
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);
    /*  usando query nativo - fin

     *   usando Query Methods
    List<Producto> findByIdCategoria(int idCategoria);
     *   usando Query Methods - fin
     * */
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
