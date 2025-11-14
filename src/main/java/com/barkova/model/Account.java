package com.barkova.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private int number;
    private String name;
    private BigDecimal balance;

    public Account() {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     *увеличение баланса
     */
     public  void balanceIncrease(BigDecimal balance2){
         BigDecimal bigIntegerSum = this.balance.add(balance2);
    }
    /**
     *уменьшение баланса
     */
    public  void balanceDisease(BigDecimal balance2){
        BigDecimal bigIntegerSub = this.balance.subtract(balance2);
    }
    /**
     * перевод суммы другому лицу
     */
    public void transfer(String name, int sum){
        this.balance=this.balance.subtract(BigDecimal.valueOf(sum));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number && Objects.equals(name, account.name) && Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
