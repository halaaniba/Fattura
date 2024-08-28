package pagamenti;

import datiFattura.Fattura;

import java.util.ArrayList;
import java.util.List;

public class GestionePagamenti {
    private List<Fattura> fatture;

    public GestionePagamenti() {
        this.fatture = new ArrayList<>();
    }

    public void aggiungiFattura(Fattura fattura) {
        fatture.add(fattura);
    }

    public double totali() {
        double somma = 0;
        for (Fattura fattura : fatture) {
            somma += fattura.getTotale();
        }
        return somma;
    }

    public void verificaPagamenti() {
        for (Fattura fattura : fatture) {
            double totale = fattura.getTotale();
            double pagamento = fattura.getPagamento().getImporto();

            if (pagamento > totale) {
                System.out.println("Pagamento per la fattura " + fattura.getNumero() + " è superiore al totale della fattura");
            } else if (fattura.getPagamento().verificaPagamento(totale)) {
                System.out.println("Pagamento per la fattura " + fattura.getNumero() + " è stato saldato");
            } else {
                System.out.println("Pagamento per la fattura " + fattura.getNumero() + " non è stato saldato");
            }
        }
    }


}



