package edu.ucalgary.oop;
import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    public Location(String name, String address){
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<DisasterVictim>();
        this.supplies = new ArrayList<Supply>();
    }

    public void addOccupant(DisasterVictim occupants){
        this.occupants.add(occupants);
    }

    public void addSupply(Supply supplies){
        this.supplies.add(supplies);
    }

    public void removeOccupant(DisasterVictim occupants){
        this.occupants.remove(occupants);
    }

    public void removeSupply(Supply supplies){
        this.supplies.remove(supplies);
    }

    //getters

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public ArrayList<DisasterVictim> getOccupants(){
        return occupants;
    }

    public ArrayList<Supply> getSupplies(){
        return supplies;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setOccupants(ArrayList<DisasterVictim> occupants){
        this.occupants = occupants;
    }

    public void setSupplies(ArrayList<Supply> supplies){
        this.supplies = supplies;
    }
    
}
