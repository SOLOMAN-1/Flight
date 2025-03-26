package com.flight.flight.repository;

import com.flight.flight.flightEntity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface flightRepository extends JpaRepository<FlightDetails,Long> {
    List<FlightDetails> findBySourceAndDestinationAndDepartureDateTime(String source,String destination,String date);
}
