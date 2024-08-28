package datiFattura;

import pagamenti.Pagamento;
import persone.Intestatario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fattura {
    private Intestatario intestatario;
    private String numero;
    private Date data;
    private List<VoceFattura> voci;
    private double totale;
    private Pagamento pagamento;

    public Fattura(Intestatario intestatario, String numero, Date data, VoceFattura totale,Pagamento pagamento) {
        this.intestatario = intestatario;
        this.numero = numero;
        this.data = data;
        this.voci = new ArrayList<>();
        this.totale = getTotale();
        this.pagamento = pagamento;
    }

    public void aggiungiVoce(VoceFattura voce) {
        voci.add(voce);
        totale += voce.getTotale();
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public double getTotale() {
        return totale;
    }

    public String getNumero() {
        return numero;
    }


    @Override
    public String toString() {
        return "datiFattura.Fattura{" +
                "intestatario=" + intestatario +
                ", numero='" + numero + '\'' +
                ", data=" + data +
                ", voci=" + voci +
                ", totale=" + totale +
                '}';
    }

    public void stampaFattura() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("datiFattura.Fattura n. " + numero);
        System.out.println("Data: " + sdf.format(data));
        System.out.println("Cliente: " + intestatario);
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Voci:");
        for (VoceFattura voce : voci) {
            System.out.println(voce);
        }
        System.out.println("Totale: " + totale);

    }

}

