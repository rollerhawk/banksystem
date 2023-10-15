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
  private ArrayList<Ueberweisung> ueberweisungshistorie;

  //Konto Associations
  private Kunde kunde;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Konto(Bank aBank, long aKontonummer, double aSaldo, Kunde aKunde)
  {
    bank = aBank;
    kontonummer = aKontonummer;
    saldo = aSaldo;
    ueberweisungshistorie = new ArrayList<Ueberweisung>();
  }


  public void saldoErhoehen (double amount) {
    System.out.println("Konto: " + this.kontonummer + " Saldo wurde vom: " + saldo + " auf " + (amount + saldo) + " erhoeht!");
    saldo += amount;
  }
}

