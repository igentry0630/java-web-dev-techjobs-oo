package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    public Job() {

        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


//        @Override
//    public boolean equals(Object toBeCompared) {
//
//        if (toBeCompared == this) {
//            return true;
//        }
//
//        if (toBeCompared == null) {
//            return false;
//        }
//
//        if (toBeCompared.getClass() != getClass()) {
//            return false;
//        }
//        Job theJob = (Job) toBeCompared;
//        return theJob.getId() == getId();


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
//    }

    @Override
    public String toString() {
//        return ""+ '\n'+ "ID: "+ this.getId()+'\n'+"Name: "+this.getName()+'\n'+"Employer: "+this.getEmployer()+'\n'+"Location: "+this.getLocation()+'\n'+"Position Type: "+this.getPositionType()+'\n'+"Core Competency: "+this.getCoreCompetency()+"\n";
        System.out.println("\n");

        if (this.getName() == "")
            return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: Data not available" + '\n' + "Employer: " + this.getEmployer() + '\n' + "Location: " + this.getLocation() + '\n' + "Position Type: " + this.getPositionType() + '\n' + "Core Competency: " + this.getCoreCompetency() + "\n";

        if (this.getEmployer().toString() == "")
            return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: " + this.getName() + '\n' + "Employer: " + "Data not available" + '\n' + "Location: " + this.getLocation() + '\n' + "Position Type: " + this.getPositionType() + '\n' + "Core Competency: " + this.getCoreCompetency() + "\n";

        if (this.getLocation().toString() == "")
            return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: " + this.getName() + '\n' + "Employer: " + this.getEmployer() + '\n' + "Location: " + "Data not available" + '\n' + "Position Type: " + this.getPositionType() + '\n' + "Core Competency: " + this.getCoreCompetency() + "\n";

        if (this.getPositionType().toString() == "")
            return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: " + this.getName() + '\n' + "Employer: " + this.getEmployer() + '\n' + "Location: " + this.getLocation() + '\n' + "Position Type: " + "Data not available" + '\n' + "Core Competency: " + this.getCoreCompetency() + "\n";

        if (this.getCoreCompetency().toString() == "")
            return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: " + this.getName() + '\n' + "Employer: " + this.getEmployer() + '\n' + "Location: " + this.getLocation() + '\n' + "Position Type: " + this.getPositionType() + '\n' + "Core Competency: " + "Data not available" + "\n";
//        return "OOPS! This job does not seem to exist. \n";
        return "" + '\n' + "ID: " + this.getId() + '\n' + "Name: " + this.getName() + '\n' + "Employer: " + this.getEmployer() + '\n' + "Location: " + this.getLocation() + '\n' + "Position Type: " + this.getPositionType() + '\n' + "Core Competency: " + this.getCoreCompetency() + "\n";



        }




    public int getId() {
        return id;
    }

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
}



