package com.example.listareparacionesservice.Repository;

import com.example.listareparacionesservice.Entity.ValorReparacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorReparacionRepository extends JpaRepository<ValorReparacionEntity, Long> {
    @Query("SELECT vr.monto FROM ValorReparacionEntity vr WHERE vr.numeroReparacion = :numeroReparacion AND vr.tipoMotor = :tipoMotor")
    int findMontoByNumeroReparacionAndTipoMotor(int numeroReparacion, String tipoMotor);

}

