package com.banksystem;

public class Ueberweisung
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Ueberweisung Attributes
  private double betrag;
  private Konto schuldner;
  private Konto glaeubiger;

  //Ueberweisung Associations
  private Konto konto;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Ueberweisung(double aBetrag, Konto aSchuldner, Konto aGlaeubiger, Konto aKonto)
  {
    betrag = aBetrag;
    schuldner = aSchuldner;
    glaeubiger = aGlaeubiger;
  }

}

