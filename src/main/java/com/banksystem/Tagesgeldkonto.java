package com.banksystem;

public class Tagesgeldkonto extends Konto {

  double tagesDispoLimit;
  //Konstruktor für Tagesgeldkonto

    public Tagesgeldkonto(Bank aBank, long aKontonummer, double aSaldo, Kunde aKunde, double tagesDispoLimit) {
        super(aBank, aKontonummer, aSaldo, aKunde);
        this.tagesDispoLimit = tagesDispoLimit;
    }

}