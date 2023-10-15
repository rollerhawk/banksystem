

package com.banksystem;

import java.util.ArrayList;
public class Bank
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Bank Attributes
  private String name;
  private String adresse;
  private long bankleitzahl;
  private ArrayList<Konto> konten;
  private ArrayList<Kunde> kunden;

  //Bank Associations
  private ArrayList<Kunde> kundes;

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
    kundes = new ArrayList<Kunde>();
  }
}


