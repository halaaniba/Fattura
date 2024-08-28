package persone;

import java.util.ArrayList;
import java.util.List;

public class BancaDati {
    List<Intestatario> contoclienti;

    public BancaDati() {
        this.contoclienti = new ArrayList<>();
    }

    public boolean aggiungiCliente(Intestatario intestatario) {
        if (contoclienti.contains(intestatario)) {
            return false;
        } else {
            contoclienti.add(intestatario);
        }

        return true;
    }

    public String cercaDati(Intestatario intestatario) {

        for (Intestatario i : contoclienti)
        {
            if (i instanceof Azienda && (intestatario instanceof Azienda)){
                Azienda tmp= (Azienda) i;
                Azienda tmp1= (Azienda) intestatario;
                if(tmp.getPartitaIVA().equals(tmp1.getPartitaIVA())){
                    return "cliente trovato"+tmp1.getPartitaIVA();
                    }
            }
            else if(i instanceof PersonaFisica && (intestatario instanceof PersonaFisica)){
                PersonaFisica t= (PersonaFisica) i;
                PersonaFisica t1= (PersonaFisica) intestatario;
                    if(t.getCodiceFiscale().equals(t1.getCodiceFiscale())){
                        return "cliente trovato"+ t1.getCodiceFiscale();

                }

        }

}
        return "cliente non trovato";


    } }