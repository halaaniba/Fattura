package pagamenti;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assegno extends Pagamento {
    private String numeroAssegno;

    public Assegno(double importo, Date dataPagamento, String numeroAssegno) {
        super(importo, dataPagamento);
        this.numeroAssegno = numeroAssegno;
    }

    public String getNumeroAssegno() {
        return numeroAssegno;
    }


    @Override
    public String toString() {
        return "pagamenti.Assegno{" +
                "importo=" + importo +
                ", dataPagamento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataPagamento) +
                ", numeroAssegno='" + numeroAssegno + '\'' +
                '}';
    }
}

