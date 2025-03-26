package com.flight.flight.controller;
import com.flight.flight.flightEntity.FlightDetails;
import com.flight.flight.repository.flightRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class FlightController {
    private final JPAStreamer jpaStreamer;
    @Autowired
    flightRepository repo;

    public FlightController(final JPAStreamer jpaStreamer) {
        this.jpaStreamer=jpaStreamer;
    }

    @GetMapping("/get/{source}/{destination}/{date}")
    public List<Map<String, Object>> details(@PathVariable String source,
                                       @PathVariable String destination,
                                       @PathVariable String date){
//        List<FlightDetails>details= repo.findBySourceAndDestinationAndDepartureDateTime(source, destination, date);
        return jpaStreamer.stream(FlightDetails.class).filter(flight -> flight.getDestination().equals(destination)&&
                        flight.getSource().equals(source)&&
                        flight.getDepartureDateTime().equals(date))
                .map(flight -> Map.<String, Object>of(
                        "source", flight.getSource(),
                        "destination", flight.getDestination(),
                        "baseFareBdt", flight.getBaseFareBdt()) // Handle null values
                )
                .toList();
    }
}
