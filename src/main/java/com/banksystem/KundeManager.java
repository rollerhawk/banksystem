package com.banksystem;

import java.util.ArrayList;

import com.banksystem.Kunde.Geschlecht;

public class KundeManager {
    
    private ArrayList<Kunde> kunden;

    private long kundennummerZaehler;

    public KundeManager() {
        this.kunden = new ArrayList<>();
        kundennummerZaehler = 0;
    }

    //METHODS

    public ArrayList<Kunde> GetKunden(){
        return this.kunden;
    }

    public void AddNewKunde(Kunde neuerKunde){
        kunden.add(neuerKunde);
    }

    public Kunde CreateKunde(String kundenVorname, String kundenNachname, String kundenAddresse, Geschlecht geschlecht){
        long kundennummer = GetNextKundennummer();
        return new Kunde(kundenVorname, kundenNachname, geschlecht, kundenAddresse, kundennummer);
    }

    public long GetNextKundennummer(){
        kundennummerZaehler++;
        return kundennummerZaehler;
    }
}
