package model;

import java.util.ArrayList;

public class RestaurantOrders {

    private final String customerName;
    //private final String specialInstructions;
    private Integer price;
    private Double ticketNumber;
    private Double comboID;
    private Boolean status;

    public RestaurantOrders(String customerName, double ticketNumber) {
    this.customerName = customerName;
    this.ticketNumber = ticketNumber;
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void takeOrder(String customerName, double comboID) {
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void addSpecialInstructions(double ticketNumber, String specialInstructions) {
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void setPrice(double ticketNumber) {
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void orderStatus(double ticketNumber) {
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void printCustomerReceipt(double ticketNumber) {
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void printKitchenTicket(double ticketNumber) {
    }

    @Override
    public String toString() {
        return "Customer: " + customerName +
                ", Ticket Number= " + ticketNumber;
    }

}