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

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void takeOrder(String customerName, double comboID) {
    }

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void addSpecialInstructions(double ticketNumber, String specialInstructions) {
    }

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void setPrice(double ticketNumber) {
    }

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void orderStatus(double ticketNumber) {
    }

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void printCustomerReceipt(double ticketNumber) {
    }

    //REQUIRES ...
    //MODIFIES this/or delete
    //EFFECTS ...
    public void printKitchenTicket(double ticketNumber) {
    }

    @Override
    public String toString() {
        return "Customer: " + customerName +
                ", Ticket Number= " + ticketNumber;
    }

}