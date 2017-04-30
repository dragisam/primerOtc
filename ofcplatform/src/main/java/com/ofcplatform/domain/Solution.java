package com.ofcplatform.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Nenad on 4/18/2017.
 */
@Entity
public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private Set<Supplier> contractors;

    @OneToMany
    private Set<Product> products;

    @OneToMany
    private Set<Supplier> subcontractors;

    @OneToMany
    private Set<Client> sponsors;

    @OneToMany
    private Set<Client> partners;

    private String event;

    private Date dateFrom;

    private Date dateTo;

    private String title;

    private String summary;

    private String budget;

    private boolean isOnBudget;

    private String stuffNumber;





}
