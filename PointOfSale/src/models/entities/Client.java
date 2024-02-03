package models.entities;

import models.enums.SituationClient;

public class Client {

    String name;

    long card;

    double limit;

    SituationClient status;

    
    public Client(String name, long card, double limit) {
        this.name = name;
        this.card = card;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public SituationClient getStatus() {
        return status;
    }

    public void setStatus(SituationClient status) {
        this.status = status;
    }

    public void removeLimit(double value) {
        this.limit -= value;
    }

    public void backLimit(double value) {
        this.limit += value;
    }


    
}
