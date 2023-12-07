package com.market.market.persistence.crud;

import com.market.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>  {

}
