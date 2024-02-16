package edu.ucalgary.oop;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmenDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmenDetails;
        this.dateOfTreatment = dateOfTreatment;
        
        if (dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.dateOfTreatment = dateOfTreatment;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }

    //getters

    public Location getLocation(){
        return location;
    }

    public String getTreatmentDetails(){
        return treatmentDetails;
    }


    public String getDateOfTreatment(){
        return dateOfTreatment;
    }

    //setters

    public void setLocation(Location location){
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails){
        this.treatmentDetails = treatmentDetails;
    }
    
    public void setDateOfTreatment(String dateOfTreatment){
        if (dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.dateOfTreatment = dateOfTreatment;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    
}
