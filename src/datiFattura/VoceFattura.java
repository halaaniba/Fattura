package datiFattura;

public class VoceFattura {
    private String articolo;
    private String descrizione;
    private int quantita;
    private double prezzoUnitario;

    public VoceFattura(String articolo, String descrizione, int quantita, double prezzoUnitario) {
        this.articolo = articolo;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }

    @Override
    public String toString() {
        return "datiFattura.VoceFattura{" +
                "articolo='" + articolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", quantita=" + quantita +
                ", prezzoUnitario=" + prezzoUnitario +
                '}';
    }

    public double getTotale() {
        return quantita * prezzoUnitario;

    }


}
