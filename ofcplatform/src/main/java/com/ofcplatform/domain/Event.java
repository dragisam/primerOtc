package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Nenad on 4/18/2017.
 */
@Entity
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Client owner;

    @OneToOne
    private Client organizer;

    private Date dateFrom;

    private Date dateTo;

    private String hostCity;

    private String hostCountry;

    private String website;

    private boolean multipleSportEvent;

    private String sport;

    private String budget;

    private Long numberOfAthletes;

    private Integer numberOfSports;

    private Integer numberOfDisciplines;

    private Integer numberOfSportVenues;

    private Long numberOfSpectators;

    private Long numberOfViewers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Client organizer) {
        this.organizer = organizer;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getHostCity() {
        return hostCity;
    }

    public void setHostCity(String hostCity) {
        this.hostCity = hostCity;
    }

    public String getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(String hostCountry) {
        this.hostCountry = hostCountry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isMultipleSportEvent() {
        return multipleSportEvent;
    }

    public void setMultipleSportEvent(boolean multipleSportEvent) {
        this.multipleSportEvent = multipleSportEvent;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Long getNumberOfAthletes() {
        return numberOfAthletes;
    }

    public void setNumberOfAthletes(Long numberOfAthletes) {
        this.numberOfAthletes = numberOfAthletes;
    }

    public Integer getNumberOfSports() {
        return numberOfSports;
    }

    public void setNumberOfSports(Integer numberOfSports) {
        this.numberOfSports = numberOfSports;
    }

    public Integer getNumberOfDisciplines() {
        return numberOfDisciplines;
    }

    public void setNumberOfDisciplines(Integer numberOfDisciplines) {
        this.numberOfDisciplines = numberOfDisciplines;
    }

    public Integer getNumberOfSportVenues() {
        return numberOfSportVenues;
    }

    public void setNumberOfSportVenues(Integer numberOfSportVenues) {
        this.numberOfSportVenues = numberOfSportVenues;
    }

    public Long getNumberOfSpectators() {
        return numberOfSpectators;
    }

    public void setNumberOfSpectators(Long numberOfSpectators) {
        this.numberOfSpectators = numberOfSpectators;
    }

    public Long getNumberOfViewers() {
        return numberOfViewers;
    }

    public void setNumberOfViewers(Long numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }
}
