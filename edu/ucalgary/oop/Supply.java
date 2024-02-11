package edu.ucalgary.oop;

public class Supply {

    private String Type;
    private int Quantity;

    public Supply(String Type, int Quantity){
        this.Type = Type;
        this.Quantity = Quantity;
    }


    //getters

    public String getType(){
        return Type;
    }

    public int getQuantity(){
        return Quantity;
    }

    //setters

    public void setType(String Type){
        this.Type = Type;
    }

    public void setQuantity(int Quantity){
        this.Quantity = Quantity;
    }
    
}
