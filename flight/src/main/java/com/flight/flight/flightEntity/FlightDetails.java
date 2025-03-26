package com.flight.flight.flightEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "flightdetails")
public class FlightDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Airline")
    private String airline;

    @Column(name = "Source")
    private String source;

    @Column(name = "Source Name")
    private String sourceName;

    @Column(name = "Destination")
    private String destination;

    @Column(name = "Destination Name")
    private String destinationName;

    @Column(name = "Departure Date & Time")
    private String departureDateTime;

    @Column(name = "Arrival Date & Time")
    private String arrivalDateTime;

    @Column(name = "Duration (hrs)")
    private Double durationHrs;

    @Column(name = "Stopovers")
    private String stopovers;

    @Column(name = "Aircraft Type")
    private String aircraftType;

    @Column(name = "Class")
    private String flightClass;

    @Column(name = "Booking Source")
    private String bookingSource;

    @Column(name = "Base Fare (BDT)")
    private Double baseFareBdt;

    @Column(name = "Tax & Surcharge (BDT)")
    private Double taxSurchargeBdt;

    @Column(name = "Total Fare (BDT)")
    private Double totalFareBdt;

    @Column(name = "Seasonality")
    private String seasonality;

    public Integer getDaysBeforeDeparture() {
        return daysBeforeDeparture;
    }

    public void setDaysBeforeDeparture(Integer daysBeforeDeparture) {
        this.daysBeforeDeparture = daysBeforeDeparture;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Double getDurationHrs() {
        return durationHrs;
    }

    public void setDurationHrs(Double durationHrs) {
        this.durationHrs = durationHrs;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getStopovers() {
        return stopovers;
    }

    public void setStopovers(String stopovers) {
        this.stopovers = stopovers;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public Double getBaseFareBdt() {
        return baseFareBdt;
    }

    public void setBaseFareBdt(Double baseFareBdt) {
        this.baseFareBdt = baseFareBdt;
    }

    public Double getTotalFareBdt() {
        return totalFareBdt;
    }

    public void setTotalFareBdt(Double totalFareBdt) {
        this.totalFareBdt = totalFareBdt;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    public Double getTaxSurchargeBdt() {
        return taxSurchargeBdt;
    }

    public void setTaxSurchargeBdt(Double taxSurchargeBdt) {
        this.taxSurchargeBdt = taxSurchargeBdt;
    }

    @Column(name = "Days Before Departure")
    private Integer daysBeforeDeparture;

    // Getters and Setters
}