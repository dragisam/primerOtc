package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Nenad on 4/18/2017.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;

    private String name;

    private String website;

    @Column(length = 200)
    private String headline;

    @Column(length = 500)
    private String summary;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private Set<ClientBranchOfficeAddress> clientBranchOfficeAddresses;

    private String linkedIn;

    private String crunchbase;

    @OneToOne(fetch= FetchType.LAZY, mappedBy="owner")
    private Event own;

    @OneToOne(fetch= FetchType.LAZY, mappedBy="organizer")
    private Event organize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Set<ClientBranchOfficeAddress> getClientBranchOfficeAddresses() {
        return clientBranchOfficeAddresses;
    }

    public void setClientBranchOfficeAddresses(Set<ClientBranchOfficeAddress> clientBranchOfficeAddresses) {
        this.clientBranchOfficeAddresses = clientBranchOfficeAddresses;
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

    public Event getOwn() {
        return own;
    }

    public void setOwn(Event own) {
        this.own = own;
    }

    public Event getOrganize() {
        return organize;
    }

    public void setOrganize(Event organize) {
        this.organize = organize;
    }
}
