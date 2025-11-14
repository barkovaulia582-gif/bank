package com.barkova.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private int code;
    ArrayList<Account> accounts;
    /**
     * создание нового аккаунта
     */
    public Account create(){
        return new Account();
    }

    /**
     * добавление аккаунта
     */

    public void  add(Account account){
        this.accounts.add(account);
    }

    /**
     * удаление аккаунта из банка
     */
    public void  remove(Account account){
         for (Account account1:accounts){
             if (account1.equals(account)){
                 accounts.remove(account1);
             }
         }
     }
    /**
     * проверка на сущ аккаунта в банке
     */

    public  boolean exist(Account account){
        if (accounts.contains(account)) {
            return true;
        }
        return false;
    }

    /**
     * внутрибанковский перевод суммы
     */
    //?????????


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return code == bank.code && Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, accounts);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "code=" + code +
                ", accounts=" + accounts +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String toCSV() {
        String res =  this.code + ";";
        for (Account p:accounts){
            res+=";" + p;
        }

        return res;
    }
}
