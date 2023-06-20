package com.h2.ejerciciozara.ejerciciozara.repositorio;

import com.h2.ejerciciozara.ejerciciozara.modelo.Price;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(Long brandId, Long productId, LocalDateTime startDate, LocalDateTime endDate);
}
