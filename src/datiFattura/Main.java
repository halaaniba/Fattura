package datiFattura;

import pagamenti.Assegno;
import pagamenti.GestionePagamenti;
import pagamenti.Pagamento;
import persone.Azienda;
import persone.Intestatario;
import persone.PersonaFisica;
import persone.BancaDati;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Intestatario intes1 = new PersonaFisica("marco polo", "persona fisica","HVUYF44");
        Intestatario intes2 = new Azienda("marco polo", "azienda","12332423432");
        Intestatario intes3 = new Intestatario("marco polo", "azienda");

        intes1.determinaTipoPersona(intes1);
        Pagamento pagamento1 = new Assegno(247.8, new Date(), "KDFI75885");
        Pagamento pagamento2 = new Assegno(2963, new Date(), "KDFI75885");
        Pagamento pagamento3 = new Assegno(54, new Date(), "KDFI75885");
        VoceFattura voce1 = new VoceFattura("dsjbfsbf", "sfsohf", 2, 123.9);
        VoceFattura voce2 = new VoceFattura("dsjbfsbf", "sfsohf", 2, 982.90);
        VoceFattura voce3 = new VoceFattura("dsjbfsbf", "sfsohf", 2, 282.90);
        Fattura fatt1 = new Fattura(intes1, "122336", new Date(), voce1, pagamento1);
        Fattura fatt2 = new Fattura(intes1, "122334", new Date(), voce2, pagamento2);
        Fattura fatt3 = new Fattura(intes1, "122337", new Date(), voce3, pagamento3);
        fatt1.aggiungiVoce(voce1);
        fatt2.aggiungiVoce(voce2);
        fatt3.aggiungiVoce(voce3);
        fatt1.stampaFattura();
        fatt2.stampaFattura();
        fatt3.stampaFattura();
        GestionePagamenti gestionePagamenti = new GestionePagamenti();
        gestionePagamenti.aggiungiFattura(fatt1);
        gestionePagamenti.aggiungiFattura(fatt2);
        gestionePagamenti.aggiungiFattura(fatt3);
        gestionePagamenti.verificaPagamenti();
        BancaDati b = new BancaDati();
        b.aggiungiCliente(intes1);
        b.aggiungiCliente(intes2);
        b.aggiungiCliente(intes3);
        System.out.println(" Controllo Intestatario"+b.cercaDati(intes1));
        System.out.println(" Controllo Intestatario"+b.cercaDati(intes2));

        System.out.println(" Controllo Intestatario"+b.cercaDati(intes3));

        //  Ciao c = new Ciao(2.4,3);
        //   System.out.println(c.a()); se si vuole usare solo i get e i set senza metodi fare una classe record
    }
}