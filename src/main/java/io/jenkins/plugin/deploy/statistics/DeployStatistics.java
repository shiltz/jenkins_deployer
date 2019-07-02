package io.jenkins.plugin.deploy.statistics;

import hudson.model.*;
import io.jenkins.plugin.deploy.statistics.model.*;
import jenkins.model.*;
import net.sf.json.*;
import netscape.javascript.*;
import org.jenkinsci.plugins.workflow.job.*;

import javax.annotation.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class DeployStatistics implements RunAction2 {

    private WorkflowJob project;

    public DeployStatistics(WorkflowJob project) {
        this.project = project;
    }

    public List<CountryDeploymentStats> getCountryDeploymentStats() throws IOException {
        return ((DeploymentConfiguration) JSONObject.fromObject(this.readDeploymentHistory())
                .toBean(DeploymentConfiguration.class)).getCountryDeploymentStats();
    }

    private String readDeploymentHistory() throws IOException {
        return new String(Files.readAllBytes(project.getRootDir().toPath().resolve("../../workspace/"+project.getName()+"/output.json")));
    }

    @CheckForNull
    @Override
    public String getIconFileName() {
        return "clipboard.png";
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return "Deploy History";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "stats";
    }

    @Override
    public void onAttached(Run<?, ?> run) {
        System.out.println("onAttached" + run.toString());
    }

    @Override
    public void onLoad(Run<?, ?> run) {
        System.out.println("onLoad" + run.toString());
    }
}
