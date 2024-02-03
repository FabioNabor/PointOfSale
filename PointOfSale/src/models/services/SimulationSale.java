package models.services;

import models.entities.Sale;
import models.exception.PointOfSale;
import models.utils.utils;

public class SimulationSale {



    public String simulationSale(Sale sale) {
        StringBuilder simulation = new StringBuilder();
        try {
            double finalvalue = CalculationSale.calculationFinalValue(sale);
            double installments = CalculationSale.calculationFinalValue(sale)/sale.getInstallments();
            simulation.append("------Simulation Safe------\n");
            simulation.append("Purchase Value: "+sale.getValue()+"\n");
            simulation.append("Installments: "+sale.getInstallments()+"\n");
            simulation.append("------Final Simulation------"+"\n");
            simulation.append("Purchase Value Final: "+utils.formatMoney(finalvalue)+"\n");
            simulation.append("Value Installment: R$"+utils.formatMoney(installments)+"\n");
        }catch (PointOfSale e ) {
            simulation.append(e.getMessage());
        }
        return simulation.toString();
        
    }


    
}
