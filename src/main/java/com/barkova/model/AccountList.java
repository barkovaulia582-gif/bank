package com.barkova.model;

import java.util.ArrayList;
import java.util.Objects;

public class AccountList {
    ArrayList<Account> accounts = new ArrayList<>();

    /**
     * добавление пользователя в список вккаунтов
     */
    public void add(Account account) {
        this.accounts.add(account);
    }

    /**
     * удаление аккаунта  из списка
     */
    public void remove(Account account) {
        this.accounts.remove(account);
    }

    /**
     * получение первого/последнего аккаунта
     */
    public Account getFirst() {
        return accounts.get(0);
    }

    /**
     * получение последнего аккаунта
     */
    public Account getLast() {
        return accounts.get(accounts.size() - 1);
    }

    /**
     * получение аккаунта по индеку
     */
    public Account getByIndex(int index) {
        Account res = null;
        for (int i = 0; i < accounts.size(); i++) {
            if (i == index) {
                res = accounts.get(i);
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountList that = (AccountList) o;
        return Objects.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accounts);
    }

    /**
     * проверка на сущ аккаунта в списке
     */

    public  boolean exist(Account account){
        if (accounts.contains(account)) {
            return true;
        }
        return false;
    }


    /**
     * получение количества аккаунтов
     *
     */
    public int count(){
        return accounts.size();
    }

    @Override
    public String toString() {
        return "AccountList{" +
                "accounts=" + accounts +
                '}';
    }
}
