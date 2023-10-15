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
        Bank bankUK = bankManager.CreateBank("Bank-UK", "Bankstrasse 1, 41882 B");
        Bank bankAU = bankManager.CreateBank("Bank-AU", "Bankstrasse 1, 41552 AC");

        //Add new banks
        bankManager.AddNewBank(bankRFH);
        bankManager.AddNewBank(bankUK);
        bankManager.AddNewBank(bankAU);

        Kunde kundeNikita = new Kunde("Nikita", "Puke", Geschlecht.Maennlich, "GK", 1);
        Kunde kundeFelix = new Kunde("Felix", "Felix", Geschlecht.Maennlich, "AC", 2);   
    }
}
