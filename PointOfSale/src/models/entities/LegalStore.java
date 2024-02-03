package models.entities;

public class LegalStore extends Store {

    long cnpj;

    public LegalStore() {
        super();
    }

    public LegalStore(int pointofsafe, String namesafe, String address, String contact, String email,
            double daily, double month, double year, long cnpj) {
        super(pointofsafe, namesafe, address, contact, email, daily, month, year);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    
}
