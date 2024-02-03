package models.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import models.entities.Sale;
import models.exception.PointOfSale;

public class LauchSale {

    public static void lauchSalae(Sale sale) {
        LocalDateTime now = LocalDateTime.now();
        int ticket = GeneretTicket.generatTicket();
        int installments = sale.getInstallments();
        try {
            double valuefinal = CalculationSale.calculationFinalValue(sale);
            if (sale.getClient().getLimit() < valuefinal) {
                throw new PointOfSale("Cliente não possui limit suficiente!");
            }
            sale.getClient().removeLimit(valuefinal);
            for (int i = 1; i<installments+1; i++){
                //vai lançar as parcelas no banco de dados
            }    
        
        }catch (PointOfSale e ) {
            
        }
        
    }
    
}
