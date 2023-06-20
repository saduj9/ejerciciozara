package com.h2.ejerciciozara.ejerciciozara.servicio;


import com.h2.ejerciciozara.ejerciciozara.modelo.Price;
import com.h2.ejerciciozara.ejerciciozara.repositorio.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService {

   private final PriceRepository priceRepository;

    @Override
    public Price consultarPrecio(Long brandId, Long productId, LocalDateTime applicationDate) {
        List<Price> precios = priceRepository.findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                brandId, productId, applicationDate,applicationDate);

        if (precios.isEmpty()) {
            // Manejar caso de precio no encontrado
            return null;
        }

        // Obtener el precio con mayor prioridad
        Price precioAplicar = precios.stream()
                .max(Comparator.comparingInt(Price::getPriority))
                .orElse(null);

        return precioAplicar;
    }

}
