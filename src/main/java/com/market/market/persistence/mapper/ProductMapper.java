package com.market.market.persistence.mapper;

import com.market.market.domain.Product;
import com.market.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);

    /*
    private int productId; // Representa idProducto de persistence/entity/Producto
    private String name; // Representa nombre de persistence/entity/Producto
    private int categoryId; // Representa idCategoria de persistence/entity/Producto
    private double price; // Representa precioVenta de persistence/entity/Producto
    private int stock; // Representa cantidadStock de persistence/entity/Producto
    private boolean active; // Representa estado de persistence/entity/Producto
    private Category category; // Representa categoria de persistence/entity/Producto
    // barCode (persistence/entity/Producto.codigoBarras) no va a estar representado

    target
        productId
        name
        categoryId
        price
        stock
        active
        category
    source
        idProducto
        nombre
        idCategoria
        precioVenta
        cantidadStock
        estado
        categoria
    * */

    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Producto toProducto(Product product);

}
