package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Job extends JobField{
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
    id = nextId;
    nextId++;
    }

    public Job(String name,
               Employer employer,
               Location location,
               PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name.isBlank() ? "Data not available" : name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString(){
        return "\nID:  " + id + "  \n"
                + "Name:  " + getName() + "  \n"
                + "Employer:  " + getEmployer() + "  \n"
                + "Location:  " + getLocation() + "  \n"
                + "Position Type:  " + getPositionType() + "  \n"
                + "Core Competency:  " + getCoreCompetency();
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
