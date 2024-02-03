package models.services;

import java.time.LocalDateTime;

import models.entities.Client;
import models.entities.Sale;
import models.exception.PointOfSale;
import models.utils.utils;

public class LauchSale {

    public static void lauchSalae(Sale sale, Client client) {
        LocalDateTime now = LocalDateTime.now();
        int ticket = new GeneretTicket().generatTicket();
        int installments = sale.getInstallments();
        try {
            double valuefinal = CalculationSale.calculationFinalValue(sale);
            if (client.getLimit() < valuefinal) {
                throw new PointOfSale(
                "Customer does not have enough limit!!"
                );
            }
            double valueinstallments = sale.getValue()/installments;
            double valuefinalinstallments = valuefinal/installments;
            client.removeLimit(valuefinal);
            for (int i = 1; i<installments+1; i++){
                LocalDateTime installmentdate = now.plusMonths(i);
                
            }    
        
        }catch (PointOfSale e ) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
