import models.entities.Client;
import models.entities.PhsicalStore;
import models.entities.Sale;
import models.entities.Store;
import models.services.LauchSale;
import models.services.SimulationSale;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client("fabio nabor", 12369547, 20000);
        Store loja1 = new PhsicalStore(1963, "Lojão Atacada",
         "Batista 123", "35 9988662236", null, 1.49, 3.49, 17.90, 166249476);
        SimulationSale s = new SimulationSale();
        System.out.println(s.simulationSale(new Sale(loja1, 2080.90, 18)));
        LauchSale.lauchSalae(new Sale(loja1, 2080.90, 18), client);

    }
}
