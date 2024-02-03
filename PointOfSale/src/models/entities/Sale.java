package models.entities;

import models.enums.StatusSale;

public class Sale {


    Store store;

    double value;

    int installments;

    StatusSale status;

    public Sale() {
        
    }

    public Sale(Store store, double value, int installments) {
        this.store = store;
        this.value = value;
        this.installments = installments;
    }


    public Store getStore() {
        return store;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

}
