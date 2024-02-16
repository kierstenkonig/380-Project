package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private Supply[] personalBelongings;
    private String ENTRY_DATE;
    private String gender;
    private static int counter = 0;

    //illegal argument exception
    public DisasterVictim(String firstName, String ENTRY_DATE){
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        //illegal argument exception
        if (!ENTRY_DATE.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of birth must be in the format YYYY-MM-DD");
        }
        this.ASSIGNED_SOCIAL_ID = counter++;

    }

    //getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        if (lastName != null) {
            return lastName;
        } else {
            return "";
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }

    public String getGender() {
        return gender;
    }

    public static int getCounter() {
        return counter;
    }

    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        counter++;
    }

//illegal argument exception
    public void setDateOfBirth(String dateOfBirth) {
        if (!dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) { 
        throw new IllegalArgumentException("Invalid date format. Expected format is YYYY-MM-DD.");
    }
                 // Split the date string into year, month, and day
                 String[] parts = dateOfBirth.split("-");
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

        this.dateOfBirth = dateOfBirth;
    }


    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setAssignedSocialID(int ASSIGNED_SOCIAL_ID) {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public void setEntryDate(String ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply personalBelongings) {
        if (this.personalBelongings == null) {
            this.personalBelongings = new Supply[1];
        } else {
            this.personalBelongings = Arrays.copyOf(this.personalBelongings, this.personalBelongings.length + 1);
        }
        this.personalBelongings[this.personalBelongings.length - 1] = personalBelongings;
    }

    public void removePersonalBelonging(Supply personalBelongings) {
        List<Supply> list = new ArrayList<>(Arrays.asList(this.personalBelongings));
        list.remove(personalBelongings);
        this.personalBelongings = list.toArray(new Supply[0]);
    }

    public void addFamilyConnection(FamilyRelation familyConnections) {
        if (this.familyConnections == null) {
            this.familyConnections = new FamilyRelation[1];
        } else {
            this.familyConnections = Arrays.copyOf(this.familyConnections, this.familyConnections.length + 1);
        }
        this.familyConnections[this.familyConnections.length - 1] = familyConnections;
    }

    public void removeFamilyConnection(FamilyRelation familyConnections) {
        List<FamilyRelation> list = new ArrayList<>(Arrays.asList(this.familyConnections));
        list.remove(familyConnections);
        this.familyConnections = list.toArray(new FamilyRelation[0]);
    }

    public void addMedicalRecord(MedicalRecord medicalRecords) {
        if (this.medicalRecords == null) {
            this.medicalRecords = new MedicalRecord[1];
        } else {
            this.medicalRecords = Arrays.copyOf(this.medicalRecords, this.medicalRecords.length + 1);
        }
        this.medicalRecords[this.medicalRecords.length - 1] = medicalRecords;
    }


}