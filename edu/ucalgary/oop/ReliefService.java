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
                         // Split the date string into year, month, and day
         String[] parts = dateOfInquiry.split("-");
         int year = Integer.parseInt(parts[0]);
         int month = Integer.parseInt(parts[1]);
         int day = Integer.parseInt(parts[2]);
 
         // Check if the year is a leap year
         boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 
         // Validate the month
         if (month < 1 || month > 12) {
             throw new IllegalArgumentException("Invalid month");
         }
 
         // Validate the day
         if (day < 1 || day > 31) {
             throw new IllegalArgumentException("Invalid day");
         }
 
         // Handle February
         if (month == 2) {
             if (isLeapYear && day > 29) {
                 throw new IllegalArgumentException("Invalid day for February in a leap year");
             } else if (!isLeapYear && day > 28) {
                 throw new IllegalArgumentException("Invalid day for February in a non-leap year");
             }
         }
         
         // Handle months with 30 days
         if (month == 4 || month == 6 || month == 9 || month == 11) {
             if (day > 30) {
                 throw new IllegalArgumentException("Invalid day for the specified month");
             }
         }
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