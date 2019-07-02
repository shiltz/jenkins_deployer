package io.jenkins.plugin.deploy.statistics.model;

import java.util.*;

public class DeploymentConfiguration {
    private List<CountryDeploymentStats> countryDeploymentStats;

    public void setCountryDeploymentStats(List<CountryDeploymentStats> countryDeploymentStats) {
        this.countryDeploymentStats = countryDeploymentStats;
    }

    public List<CountryDeploymentStats> getCountryDeploymentStats() {
        return countryDeploymentStats;
    }

}
