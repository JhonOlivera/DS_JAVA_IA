package com.JavaSabados.gestor_productos.controller;

import com.JavaSabados.gestor_productos.dto.ProductoDTO;
import com.JavaSabados.gestor_productos.model.Producto;
import com.JavaSabados.gestor_productos.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoDTO> obtenerProductos() {
        return productoService.listarProductos()
                .stream()
                .map(ProductoDTO::new)
                .toList();
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<ProductoDTO> obtenerPorCategoria(@PathVariable Long categoriaId) {
        return productoService.listarPorCategoria(categoriaId)
                .stream()
                .map(ProductoDTO::new)
                .toList();
    }

    @PostMapping
    public ProductoDTO crearProducto(@RequestBody Producto producto) {
        Producto guardado = productoService.agregarProducto(producto);
        return new ProductoDTO(guardado);
    }
}