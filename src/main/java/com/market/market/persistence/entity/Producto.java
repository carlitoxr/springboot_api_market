package com.market.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
/*
* id_producto int(11) AI PK
nombre varchar(45)
id_categoria int(11)
codigo_barras varchar(150)
precio_venta decimal(16,2)
cantidad_stock int(11)
estado
* */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //por auto_increment
    @Column(name = "id_producto")
    private int idProducto;

    private String nombre; // Como se llama igual que la tabla no hay que poner la anotación

    @Column(name = "id_categoria")
    private int idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "cantidad_stock")
    private int cantidadStock;

    private boolean estado;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
