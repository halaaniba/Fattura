package persone;

public class Azienda extends Intestatario {
    private String partitaIVA;
    public Azienda(String nome, String indirizzo,String partitaIVA) {
        super(nome, indirizzo);
        this.partitaIVA=partitaIVA;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }
}
