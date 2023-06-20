package com.h2.ejerciciozara.ejerciciozara.controlador;

import com.h2.ejerciciozara.ejerciciozara.modelo.Price;
import com.h2.ejerciciozara.ejerciciozara.servicio.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/precios")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    public ResponseEntity<Price> obtenerPrecio(
            @RequestParam("cadenaId") Long brandId,
            @RequestParam("productoId") Long productId,
            @RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate) {

        Price precio = priceService.consultarPrecio(brandId, productId, applicationDate);

        if (precio == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(precio);
    }
}
