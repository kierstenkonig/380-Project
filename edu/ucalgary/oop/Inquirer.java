package edu.ucalgary.oop;

public class Inquirer {

    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.INFO = INFO;
        this.SERVICES_PHONE = SERVICES_PHONE;
    }
    //getters
    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getInfo() {
        return INFO;
    }

    public String getServicesPhoneNum() {
        return SERVICES_PHONE;
    }

    //setters
    public void setFirstName(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public void setLastName(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public void setInfo(String INFO) {
        this.INFO = INFO;
    }

    public void setServicesPhone(String SERVICES_PHONE) {
        this.SERVICES_PHONE = SERVICES_PHONE;
    }
    
}

