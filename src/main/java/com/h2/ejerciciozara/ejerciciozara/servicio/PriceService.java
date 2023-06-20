package com.h2.ejerciciozara.ejerciciozara.servicio;

import com.h2.ejerciciozara.ejerciciozara.modelo.Price;

import java.time.LocalDateTime;

public interface PriceService {
     Price consultarPrecio(Long brandId, Long productId, LocalDateTime applicationDate);

}
