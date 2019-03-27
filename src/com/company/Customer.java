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
import java.util.Scanner;

public class Customer {

    //  Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;

    //  Constructor Method
    public Customer(int _customerId) {
        this.customerId = _customerId; //Increments the ID count
    }

    //  Setters and Getters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }

    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }

    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.println("\nCustomer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
        }
    }
}