package models.services;

import java.util.Random;

public class GeneretTicket {

    public int generatTicket(){
        Random random = new Random();
        int ticket = random.nextInt(100000);
        return ticket;
    }
    
}
