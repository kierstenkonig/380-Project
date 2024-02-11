package edu.ucalgary.oop;

public class Location {
    private String name;
    private String address;

    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }

    //getters

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    
}
