package edu.ucalgary.oop;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation){
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    //getters
    public Inquirer getInquirer(){
        return inquirer;
    }

    public DisasterVictim getMissingPerson(){
        return missingPerson;
    }

    public String getDateOfInquiry(){
        return dateOfInquiry;
    }

    public String getInfoProvided(){
        return infoProvided;
    }

    public Location getLastKnownLocation(){
        return lastKnownLocation;
    }

    public String getLogDetails(){
        String missingPersonDetails = missingPerson.getFirstName();
        if (!missingPerson.getLastName().isEmpty()) {
            missingPersonDetails += " " + missingPerson.getLastName();
        }

        return "Inquirer: " + inquirer.getFirstName() + "" + 
        ", Missing Person: " + missingPersonDetails + 
        ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " + infoProvided + 
        ", Last Known Location: " + lastKnownLocation.getName();
    }

    //setters

    public void setInquirer(Inquirer inquirer){
        this.inquirer = inquirer;
    }

    public void setMissingPerson(DisasterVictim missingPerson){
        this.missingPerson = missingPerson;
    }

    public void setDateOfInquiry(String dateOfInquiry){
        if (dateOfInquiry.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.dateOfInquiry = dateOfInquiry;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }

    public void setInfoProvided(String infoProvided){
        this.infoProvided = infoProvided;
    }

    public void setLastKnownLocation(Location lastKnownLocation){
        this.lastKnownLocation = lastKnownLocation;
    }

}