package persone;

public class PersonaFisica extends Intestatario {
    private String codiceFiscale;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public PersonaFisica(String nome, String indirizzo, String codiceFiscale) {
        super(nome, indirizzo);
        this.codiceFiscale = codiceFiscale;;


    }
    }

