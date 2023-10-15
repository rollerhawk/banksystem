package com.banksystem;

import com.banksystem.Kunde.Geschlecht;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bank rfhBank = new Bank("RFHBANK", "Koeln", 1568);

        Kunde nikita = new Kunde("Nikita","Puke", Geschlecht.Maennlich, "Geilenkirchen", 1);
        Kunde felix = new Kunde("Felix","Felix", Geschlecht.Maennlich, "Koeln", 2);

        Konto nikitasKonto = new Konto(rfhBank, 1, 1000, nikita);
        Konto felixKonto = new Konto(rfhBank, 2, 1000, felix);


        //Ueberweisung vom Felix an Nikita
        double ueberweisungsBetrag = 500.00;

        felixKonto.saldoErhoehen(ueberweisungsBetrag * -1);
        nikitasKonto.saldoErhoehen(ueberweisungsBetrag);        
    }
}
