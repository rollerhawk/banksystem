package com.banksystem;
import java.time.LocalDateTime;
public class SEPALastschrifft extends Ueberweisung
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum Intervall { Monatlich, Quartal, Halbjaehrlich, Jaehrlich }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SEPALastschrifft Attributes
  private long id;
  private LocalDateTime erstausfuehrung;
  private Intervall intervall;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SEPALastschrifft(double aBetrag, Konto aSchuldner, Konto aGlaeubiger, Konto aKonto, long aId, LocalDateTime aErstausfuehrung, Intervall aIntervall)
  {
    super(aBetrag, aSchuldner, aGlaeubiger, aKonto);
    id = aId;
    erstausfuehrung = aErstausfuehrung;
    intervall = aIntervall;
  }
}


