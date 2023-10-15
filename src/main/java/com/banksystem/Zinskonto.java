package com.banksystem;

public class Zinskonto extends Konto
{
  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Zinskonto Attributes
  private double zinssatz;
  private Intervall zinsintervall;
  private double vorgemerkteZinsen;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Zinskonto(Bank aBank, long aKontonummer, double aSaldo, Kunde aKunde, double aZinssatz, Intervall aZinsintervall, double aVorgemerkteZinsen)
  {
    super(aBank, aKontonummer, aSaldo, aKunde, 0,0);
    zinssatz = aZinssatz;
    zinsintervall = aZinsintervall;
    vorgemerkteZinsen = aVorgemerkteZinsen;
  }
}

