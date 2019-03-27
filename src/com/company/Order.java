package com.company;
/*
Project: Lab 9
Purpose Details: Pizza Shop Ordering Application
Course: IST 242
Author: Yongkang Deng
Date Developed: 3/26/2019
Last Date Changed: 3/26/2019
Revision: 5
*/
import java.util.ArrayList;
public class Order {

    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;
    private static ArrayList<Order> orderList = new ArrayList<>();

    //Constructor Method
    public Order(int _orderId) {
        this.orderId = _orderId;
    }

    //Setters and Getters
    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

    public static void addOrders(Order order, Customer customer, ArrayList<Menu> mList){
        order.setorderId(order.getorderId());
        order.setCust(customer);
        order.setMenuItem(mList);
        order.setCust(customer);
        orderList.add(order);
        System.out.println("\nOrder added with order ID : " + order.getorderId());
        System.out.println("\nWith Menu : ");
        for(Menu menu : mList){
            System.out.println(menu.getmenuItem());
        }
        System.out.println("\nCustomer Name : " + order.getCust().getCustomerName()
                + ", Customer ID : " + order.getCust().getCustomerId());
    }

    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
}