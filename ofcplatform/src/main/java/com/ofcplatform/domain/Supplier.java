package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nenad on 4/16/2017.
 */
@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String website;

    @Column(length = 200)
    private String headline;

    @Column(length = 500)
    private String summary;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
    private Set<SupplierBranchOfficeAddress> supplierBranchOfficeAddresses;

    private String linkedIn;

    private String crunchbase;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<SupplierBranchOfficeAddress> getSupplierBranchOfficeAddresses() {
        return supplierBranchOfficeAddresses;
    }

    public void setSupplierBranchOfficeAddresses(Set<SupplierBranchOfficeAddress> supplierBranchOfficeAddresses) {
        this.supplierBranchOfficeAddresses = supplierBranchOfficeAddresses;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getCrunchbase() {
        return crunchbase;
    }

    public void setCrunchbase(String crunchbase) {
        this.crunchbase = crunchbase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}
