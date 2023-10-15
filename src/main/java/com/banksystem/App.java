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

        BankManager bankManager = new BankManager();

        Bank bankRFH = bankManager.CreateBank("Bank-RFH", "Bankstrasse 1, 52511 GK");
        //Bank bankUK = bankManager.CreateBank("Bank-UK", "Bankstrasse 1, 41882 B");
        //Bank bankAU = bankManager.CreateBank("Bank-AU", "Bankstrasse 1, 41552 AC");

        //Add new banks
        bankManager.AddNewBank(bankRFH);
        //bankManager.AddNewBank(bankUK);
        //bankManager.AddNewBank(bankAU);

        Kunde kundeNikita = bankRFH.CreateKundeForBank("Nikita", "Puke", "GK", Geschlecht.Maennlich);
        Kunde kundeFelix = bankRFH.CreateKundeForBank("Felix", "Felix", "AC", Geschlecht.Maennlich);   

        Konto kontoNikita = bankRFH.CreateKontoForKunde(kundeNikita, -399, 2000);
        Konto kontoFelix = bankRFH.CreateKontoForKunde(kundeFelix, -399, 2000);


        bankRFH.GeldEinzahlen(kontoFelix, 5000);
        bankRFH.GeldEinzahlen(kontoNikita, 5000);


        //Überweisungen durchführen
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 1000);  //Alles ok
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 3000); //Alles ok
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 2000); //Alles OK
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 2000); //Alles OK
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 399); //Saldo nicht OK
        bankRFH.GeldUeberweisen(kontoNikita, kontoFelix, 399); //Saldo nicht OK




    }
}
