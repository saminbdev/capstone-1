package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction{
    // Fields
        private LocalDate itemDate;
        private LocalTime itemTime;
        private String itemDescription;
        private String itemVendor;
        private double itemAmount;


//Constructor
public Transaction(LocalDate itemDate,LocalTime itemTime,String itemDescription,String itemVendor,double itemAmount) {
    this.itemDate = itemDate;
    this.itemTime = itemTime;
    this.itemDescription = itemDescription;
    this.itemVendor = itemVendor;
    this.itemAmount = itemAmount;
}

//Getters and Setters
public LocalDate getItemDate() {
    return itemDate;
}

    public void setItemDate(LocalDate itemDate) {
        this.itemDate = itemDate;
    }

    public LocalTime getItemTime() {
        return itemTime;
    }

    public void setItemTime(LocalTime itemTime) {
        this.itemTime = itemTime;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemVendor() {
        return itemVendor;
    }

    public void setItemVendor(String itemVendor) {
        this.itemVendor = itemVendor;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

}

