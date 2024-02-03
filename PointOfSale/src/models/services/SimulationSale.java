package models.services;

import models.entities.Sale;
import models.exception.PointOfSale;

public class SimulationSale {



    public String simulationSale(Sale sale) {
        StringBuilder simulation = new StringBuilder();
        try {
            double finalvalue = CalculationSale.calculationFinalValue(sale);
            double installments = CalculationSale.calculationFinalValue(sale)/sale.getInstallments();
            simulation.append("------Simulation Safe------");
            simulation.append("Purchase Value: "+sale.getValue());
            simulation.append("Installments: "+sale.getInstallments());
            simulation.append("------Final Simulation------");
            simulation.append("Purchase Value Final: "+finalvalue);
            simulation.append("Value Installments: R$"+installments+"");
        }catch (PointOfSale e ) {
            simulation.append(e.getMessage());
        }
        return simulation.toString();
        
    }


    
}
