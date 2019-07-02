package io.jenkins.plugin.deploy.statistics.model;

public class CountryDeploymentStats {
    private String previousArtifactVersion;
    private String previousDeploymentDate;
    private String previousDeploymentStatus;
    private String currentArtifactVersion;
    private String currentDeploymentDate;
    private String currentDeploymentStatus;
    private String country;

    public String getPreviousArtifactVersion() {
        return previousArtifactVersion != null ? previousArtifactVersion : "-";
    }

    public String getCurrentArtifactVersion() {
        return currentArtifactVersion != null ? currentArtifactVersion : "-";
    }

    public String getCountry() {
        return country != null ? country : "-";
    }

    public void setPreviousArtifactVersion(String previousArtifactVersion) {
        this.previousArtifactVersion = previousArtifactVersion;
    }

    public void setCurrentArtifactVersion(String currentArtifactVersion) {
        this.currentArtifactVersion = currentArtifactVersion;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getPreviousDeploymentStatus() {
        return previousDeploymentStatus != null ? previousDeploymentStatus : "-";
    }

    public void setPreviousDeploymentStatus(String previousDeploymentStatus) {
        this.previousDeploymentStatus = previousDeploymentStatus;
    }

    public String getPreviousDeploymentDate() {
        return previousDeploymentDate != null ? previousDeploymentDate : "-";
    }

    public void setPreviousDeploymentDate(String previousDeploymentDate) {
        this.previousDeploymentDate = previousDeploymentDate;
    }

    public String getCurrentDeploymentDate() {
        return currentDeploymentDate != null ? currentDeploymentDate : "-";
    }

    public void setCurrentDeploymentDate(String currentDeploymentDate) {
        this.currentDeploymentDate = currentDeploymentDate;
    }

    public String getCurrentDeploymentStatus() {
        return currentDeploymentStatus != null ? currentDeploymentStatus : "-";
    }

    public void setCurrentDeploymentStatus(String currentDeploymentStatus) {
        this.currentDeploymentStatus = currentDeploymentStatus;
    }
}
