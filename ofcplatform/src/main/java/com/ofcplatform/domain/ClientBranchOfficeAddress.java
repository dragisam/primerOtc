package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nenad on 4/18/2017.
 */
@Entity
public class ClientBranchOfficeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String country;

    private String postalCode;

    @ManyToOne
    private Client client;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientBranchOfficeAddress")
    private Set<ClientBranchOfficeContact> clientBranchOfficeAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
