package com.banksystem;

import java.util.ArrayList;

public class Konto
{
  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Konto Attributes
  private Bank bank;
  private long kontonummer;
  private double saldo;
  private double dispolimit;
  private ArrayList<Ueberweisung> ueberweisungshistorie;

  //Konto Associations
  private Kunde kunde;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Konto(Bank aBank, long aKontonummer, double aSaldo, Kunde aKunde, double aDispolimit)
  {
    bank = aBank;
    kontonummer = aKontonummer;
    saldo = aSaldo;
    dispolimit = aDispolimit;
    ueberweisungshistorie = new ArrayList<Ueberweisung>();
  }


  //METHODEN

  //public / private  typ  METHODENNAMEN (parameter int, boolean) {

  //}

  //Getter methode für Variable this.bank
  public Bank GetBank(){
    return this.bank;
  }

  //Setter methode für Variable this.bank
  public void SetBank(Bank neueBank){
    this.bank = neueBank;
  }

  //Getter methode für Variable this.kontonummer
  public long GetKontonummer(){
    return this.kontonummer;
  }

  //Setter methode für Variable this.kontonummer
  public void SetKontonummer(long neueKontonummer){
    this.kontonummer = neueKontonummer;
  }


  //KontoStandAbfragen
  //Getter methode für Variable this.saldo
  public double GetSaldo(){
    return this.saldo;
  }


  //TransaktionHistorieAnzeigen
  public ArrayList<Ueberweisung> GetUeberweisungshistorie(){
    return this.ueberweisungshistorie;
  }

  //Pruefen ob Saldo ausreichend

  private boolean CheckSaldoEnough(double betrag){
    boolean result = false;    
    if (this.saldo - betrag >= 0){
      result = true;
    }
    return result;
  }

  private boolean CheckDispoEnough(double betrag){
    return betrag <= this.dispolimit;
  }


  private void SaldoAendernUmBetrag(double betrag){
    this.saldo = this.saldo + betrag;
  }

  public boolean CheckSaldoAendernUmBetrag(double betrag) {
    boolean result = false;
    if(betrag < 0) {
      //Ueberweisung weil negativer Betrag
      boolean saldoAusreichend = CheckSaldoEnough(betrag);
      boolean dispoNichtUebeschritten = CheckDispoEnough(betrag);
      if (saldoAusreichend && dispoNichtUebeschritten){
        result = true;
        SaldoAendernUmBetrag(betrag);
      }
    } else {
      //Geld empfangen weil positiver Betrag
      result = true;
      SaldoAendernUmBetrag(betrag);
    }
    return result;
  }


}

