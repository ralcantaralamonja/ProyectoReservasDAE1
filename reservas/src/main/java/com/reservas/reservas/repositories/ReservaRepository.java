package com.reservas.reservas.repositories;

import com.reservas.reservas.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long > {


}
