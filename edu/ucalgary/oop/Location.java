package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;
    private DisasterVictim occupants;
    private Supply supplies;

    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void addOccupant(DisasterVictim occupants){
        this.occupants = occupants;
    }

    public void addSupply(Supply supplies){
        this.supplies = supplies;
    }

    public void removeOccupant(){
        this.occupants = null;
    }

    public void removeSupply(){
        this.supplies = null;
    }

    //getters

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public DisasterVictim getOccupants(){
        return occupants;
    }

    public Supply getSupplies(){
        return supplies;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setOccupants(DisasterVictim occupants){
        this.occupants = occupants;
    }

    public void setSupplies(Supply supplies){
        this.supplies = supplies;
    }
    
}
