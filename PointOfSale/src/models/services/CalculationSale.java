package models.services;

import models.entities.Sale;
import models.exception.PointOfSale;

public class CalculationSale {

    public static double calculationFinalValue(Sale sale) throws PointOfSale{
        double year = 0;
        if (sale.getInstallments() == 0 || sale.getValue() == 0) {
            throw new PointOfSale(
                "Number of Installments or Value must be greater than zero!"
            ); 
        }
        if (sale.getInstallments() == 1){
            return sale.getValue();
        }
        if (sale.getInstallments() > 12){
            year = Math.floor(sale.getInstallments()/12)*sale.getStore().getYear(); 
        }
        double ratefinal = (((sale.getInstallments()*sale.getStore().getMonth())/100)*sale.getValue())+sale.getValue()+year;

        return ratefinal;
        
    }
    
}
