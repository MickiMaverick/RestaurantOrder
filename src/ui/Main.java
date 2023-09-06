package ui;

import model.RestaurantOrders;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a list of Order objects
        List orders = new ArrayList<>();

        // Add Order objects to the list
        orders.add(new RestaurantOrders("Adam", 1));
        orders.add(new RestaurantOrders("Bear", 2));
        orders.add(new RestaurantOrders("Caesar", 3));

        // Iterate through the list and print the Person objects' details
        for (Object RestaurantOrders : orders) {
            System.out.println(RestaurantOrders.toString());
        }
    }
}