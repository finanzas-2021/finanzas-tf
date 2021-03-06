package com.upc.edu.facturas.core.repository;

import com.upc.edu.facturas.core.entity.CostoFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostoFinalRepository extends JpaRepository<CostoFinal, String> {
}
