package com.banksystem;
import java.util.ArrayList;
public class Kunde
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum Geschlecht { Maennlich, Weiblich, Divers }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Kunde Attributes
  private String vorname;
  private String nachname;
  private Geschlecht geschlecht;
  private String adresse;
  private long kundennummer;
  private ArrayList<Konto> konten;

  //Kunde Associations
  private ArrayList<Bank> banks;
  private ArrayList<Konto> kontos;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Kunde(String aVorname, String aNachname, Geschlecht aGeschlecht, String aAdresse, long aKundennummer)
  {
    vorname = aVorname;
    nachname = aNachname;
    geschlecht = aGeschlecht;
    adresse = aAdresse;
    kundennummer = aKundennummer;
    konten = new ArrayList<Konto>();
    banks = new ArrayList<Bank>();
    kontos = new ArrayList<Konto>();
  }

}