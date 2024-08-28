package pagamenti;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pagamento {
    protected double importo;
    protected Date dataPagamento;

    public Pagamento(double importo, Date dataPagamento) {
        this.importo = importo;
        this.dataPagamento = dataPagamento;
    }


    public double getImporto() {
        return importo;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
    public boolean verificaPagamento(double totaleFattura) {
        return this.importo == totaleFattura;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "pagamenti.Pagamento{" +
                "importo=" + importo +
                ", dataPagamento=" + sdf.format(dataPagamento) +
                '}';
    }
}
