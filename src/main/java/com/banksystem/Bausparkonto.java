package com.banksystem;

public class Bausparkonto extends Zinskonto
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bausparkonto Attributes
  private long tilgungsdauer;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Bausparkonto(Bank aBank, long aKontonummer, double aSaldo, Kunde aKunde, double aZinssatz, Intervall aZinsintervall, double aVorgemerkteZinsen, long aTilgungsdauer)
  {
    super(aBank, aKontonummer, aSaldo, aKunde, aZinssatz, aZinsintervall, aVorgemerkteZinsen);
    tilgungsdauer = aTilgungsdauer;
  }

}

