package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nenad on 4/18/2017.
 */
@Entity
public class SupplierBranchOfficeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String country;

    private String postalCode;

    @ManyToOne
    private Supplier supplier;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplierBranchOfficeAddress")
    private Set<SupplierBranchOfficeContact> supplierBranchOfficeContacts;

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

    public Set<SupplierBranchOfficeContact> getSupplierBranchOfficeContacts() {
        return supplierBranchOfficeContacts;
    }

    public void setSupplierBranchOfficeContacts(Set<SupplierBranchOfficeContact> supplierBranchOfficeContacts) {
        this.supplierBranchOfficeContacts = supplierBranchOfficeContacts;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
