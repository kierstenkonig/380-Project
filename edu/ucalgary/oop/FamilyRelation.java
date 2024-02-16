package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;

    public FamilyRelation(){}

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo){
        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }

    //getters
    public DisasterVictim getPersonOne(){
        return personOne;
    }

    public DisasterVictim getPersonTwo(){
        return personTwo;
    }

    public String getRelationshipTo(){
        return relationshipTo;
    }

    //setters

    public void setPersonOne(DisasterVictim personOne){
        this.personOne = personOne;
    }

    public void setPersonTwo(DisasterVictim personTwo){
        this.personTwo = personTwo;
    }

    public void setRelationshipTo(String relationshipTo){
        this.relationshipTo = relationshipTo;
    }

    
}