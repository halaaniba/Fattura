package persone;

import java.util.ArrayList;
import java.util.List;

public class Intestatario {

    private String nome;
    private String indirizzo;

    // Costruttore
    public Intestatario(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    // Metodi getter
    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
// metodo per determinare in automatico che tipo di persona è

    public String determinaTipoPersona(Intestatario intestatario) {
        List<Intestatario> intestatarioList = new ArrayList<>();
        for (Intestatario intestatario1 : intestatarioList) {
            determinaTipoPersona(intestatario1);
        }
        if (intestatario instanceof PersonaFisica) {
            PersonaFisica personaFisica = (PersonaFisica) intestatario;
            return "PersonaFisica";
        } else if (intestatario instanceof Azienda) {
            Azienda azienda = (Azienda) intestatario;
            return "Azienda";
        }
        return "Tipo di persona sconosciuto.";
    }

    // Metodo per visualizzare le informazioni

    public void mostraInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Indirizzo: " + indirizzo);
    }
}


