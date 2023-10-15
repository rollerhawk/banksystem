package com.banksystem;

import java.util.ArrayList;

public class BankManager {
    
    private ArrayList<Bank> banken;

    private long bankleitZahlZaehler;

    public BankManager() {
        this.banken = new ArrayList<>();
        bankleitZahlZaehler = 0;
    }

    //METHODS

    public ArrayList<Bank> GetBanken(){
        return this.banken;
    }

    public void AddNewBank(Bank neueBank){
        banken.add(neueBank);
    }

    public Bank CreateBank(String bankName, String adresse){
        long bankleitzahl = GetNextBankleitzahl();
        return new Bank(bankName, adresse, bankleitzahl);
    }

    public long GetNextBankleitzahl(){
        bankleitZahlZaehler++;
        return bankleitZahlZaehler;
    }
}
