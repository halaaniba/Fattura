package pagamenti;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CartaDiCredito extends Pagamento {
    private String numeroCarta;
    private String circuito;

    public CartaDiCredito(double importo, Date dataPagamento, String numeroCarta, String circuito) {
        super(importo, dataPagamento);
        this.numeroCarta = numeroCarta;
        this.circuito = circuito;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public String getCircuito() {
        return circuito;
    }


    @Override
    public String toString() {
        return "pagamenti.CartaDiCredito{" +
                "importo=" + importo +
                ", dataPagamento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataPagamento) +
                ", numeroCarta='" + numeroCarta + '\'' +
                ", circuito='" + circuito + '\'' +
                '}';
    }
}
