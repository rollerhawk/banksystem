

package com.banksystem;

import java.util.ArrayList;

import com.banksystem.Kunde.Geschlecht;
public class Bank
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bank Attributes
  private String name;
  private String adresse;
  private long bankleitzahl;
  private long kontonummerZaehler;
  private KundeManager kundeManager;
  private ArrayList<Konto> konten;
  private ArrayList<Kunde> kunden;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bank(String aName, String aAdresse, long aBankleitzahl)
  {
    name = aName;
    adresse = aAdresse;
    bankleitzahl = aBankleitzahl;
    konten = new ArrayList<Konto>();
    kunden = new ArrayList<Kunde>();
    kundeManager = new KundeManager();
    kontonummerZaehler = 1000000000;
  }


  public void AddNewKunde(Kunde kunde){
    kunden.add(kunde);
  }

  public void AddNewKonto(Konto konto){
    konten.add(konto);
  }

  public Kunde CreateKundeForBank(String kundenVorname, String kundenNachname, String kundenAddresse, Geschlecht geschlecht){    
    Kunde neuerKunde = this.kundeManager.CreateKunde(kundenVorname, kundenNachname, kundenAddresse, geschlecht);
    AddNewKunde(neuerKunde);
    return neuerKunde;
  }

  public long GetNextKontonummer(){
    kontonummerZaehler++;
    return kontonummerZaehler;
  }

  public Konto CreateKontoForKunde(Kunde kunde, double dispolimit, double ueberweisungsLimit){
    long kontonummer = GetNextKontonummer();
    Konto neuesKonto = new Konto(this, kontonummer, 0, kunde, dispolimit, ueberweisungsLimit);
    AddNewKonto(neuesKonto);
    return neuesKonto;
  }

  public void GeldEinzahlen(Konto konto, double betrag){
    System.out.println(String.format("Geld Einzahlung für Kontonummer: %s Betrag: %s", konto.GetKontonummer(), betrag));
    konto.CheckSaldoAendernUmBetrag(betrag);
  }

  public boolean GeldUeberweisen(Konto schuldner, Konto glaeubiger, double betrag){
    System.out.println(String.format("Ueberweisung von Kontonummer: %s auf Kontonummer: %s Betrag: %s", schuldner.GetKontonummer(), glaeubiger.GetKontonummer(), betrag));
    boolean result = false;
    if(schuldner.CheckSaldoAendernUmBetrag(betrag * -1)){
      result = glaeubiger.CheckSaldoAendernUmBetrag(betrag);
    }    

    if(result){
      System.out.println("DURCHGEFÜHRT");
    } else {
      System.out.println("ABGEBROCHEN");
    }

    System.out.println(String.format("Kontonummer: %s Kontostand: %s", schuldner.GetKontonummer(), schuldner.GetSaldo()));
        System.out.println(String.format("Kontonummer: %s Kontostand: %s", glaeubiger.GetKontonummer(), glaeubiger.GetSaldo()));
    return result;
  }

}


