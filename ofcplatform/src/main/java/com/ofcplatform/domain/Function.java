package com.ofcplatform.domain;

import javax.persistence.*;

/**
 * Created by Nenad on 4/17/2017.
 */
@Entity
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String function;

    private boolean OpportunitiesForImprovements;

   

    @Enumerated(EnumType.ORDINAL)
    private IntegrationProbability integrationProbability;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public boolean isOpportunitiesForImprovements() {
        return OpportunitiesForImprovements;
    }

    public void setOpportunitiesForImprovements(boolean opportunitiesForImprovements) {
        OpportunitiesForImprovements = opportunitiesForImprovements;
    }

    public IntegrationProbability getIntegrationProbability() {
        return integrationProbability;
    }

    public void setIntegrationProbability(IntegrationProbability integrationProbability) {
        this.integrationProbability = integrationProbability;
    }
}
