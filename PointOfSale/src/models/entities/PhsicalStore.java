package models.entities;

public class PhsicalStore extends Store {

    int cpf;

    


    public PhsicalStore() {
        super();
    }
    
    public PhsicalStore(int pointofsafe, String namesafe, String address, String contact, String email, double daily,
            double month, double year, int cpf) {
        super(pointofsafe, namesafe, address, contact, email, daily, month, year);
        this.cpf = cpf;
    }

    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
   
}
