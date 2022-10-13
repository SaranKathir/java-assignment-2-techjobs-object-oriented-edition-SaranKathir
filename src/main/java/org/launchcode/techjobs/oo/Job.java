package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name=name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        String noData = "Data not available";
        // If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist
        /*  if(name == null && name == "") //  || employer == null && employer =="" || location == null && location =="" || positionType == null && positionType =="" || coreCompetency == null && coreCompetency =="")
        {
            // return "\n" + "Name:" + (noData); + "\n" + "Employer:" + noData +"\n" + "Location:" + noData +"\n" + "PositionType:"+ noData +"\n" +"Core Competency:" + noData +"\n";
        }*/
        if(name == null || name == "")
        {
         name=noData;
        }
        if(employer.getValue() == null || employer.getValue() ==""){
            employer.setValue(noData);
        }
        if(location.getValue() == null || location.getValue() =="" ){
            location.setValue(noData);
        }
        if(positionType.getValue() == null || positionType.getValue() ==""){
            positionType.setValue(noData);
        }
        if(coreCompetency.getValue() == null || coreCompetency.getValue() ==""){
            coreCompetency.setValue(noData);
        }


       return "\n" + "ID: "+ id +"\n" + "Name: " + name + "\n" + "Employer: " + employer +"\n" + "Location: " + location +"\n" + "Position Type: "+ positionType +"\n" +"Core Competency: " + coreCompetency +"\n";


    }


}
