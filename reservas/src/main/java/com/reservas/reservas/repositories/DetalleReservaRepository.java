package com.reservas.reservas.repositories;

import com.reservas.reservas.entidades.Cliente;
import com.reservas.reservas.entidades.DetalleReserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleReservaRepository extends JpaRepository<DetalleReserva, Long> {
}
