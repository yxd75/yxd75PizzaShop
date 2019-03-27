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
enum PaymentType {cash, credit}
public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType pType;

    //Constructor Method
    public Transaction(int _transactionId, Order _order, PaymentType _pType) {
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    //Setters and Getters
    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }

    public Order getOrder() {
        return order;
    }


    public void setOrder(Order _order) {
        this.order = _order;
    }

    public PaymentType getPaymentType() {
        return pType;
    }


    public void setPaymentType(PaymentType _pType) {
        this.pType = _pType;
    }

    public static void listTransactions(ArrayList<Transaction> tList) {
        for (Transaction trans : tList) {
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Order:" + trans.getOrder().getorderId());
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }
}