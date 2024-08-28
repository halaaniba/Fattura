package pagamenti;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bonifico extends Pagamento {
    private String iban;

    public Bonifico(double importo, Date dataPagamento, String iban) {
        super(importo, dataPagamento);
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }


    @Override
    public String toString() {
        return "pagamenti.Bonifico{" +
                "importo=" + importo +
                ", dataPagamento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataPagamento) +
                ", iban='" + iban + '\'' +
                '}';
    }
}

