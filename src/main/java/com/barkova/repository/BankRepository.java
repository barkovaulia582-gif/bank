package com.barkova.repository;

import com.barkova.model.Bank;

import java.io.*;

/**
 * 4.BankRepository
 * Банк, сохраненный в базе данных
 * Методы:
 * Конструктор с именем файла базы данных
 * Конструктор с Банком для сохранения в базу данных
 * Геттер для получения загруженного банка из базы данных
 * Метод сохранения банка в базу данных
 * Метод удаления банка из базы данных
 * Метод обновления банка в базе данных
 */


public class BankRepository {

    public BankRepository(String fileName) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    String[] split = line.split(";");
                    Bank bank = new Bank(Integer.parseInt(split[0]), split[1], (split[2]), Double.parseDouble(split[3]));


                } catch (RuntimeException ignored) {
                }
            }
        }
    }
}

public void save(String fileName) throws IOException {
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
        bufferedWriter.write("lastName;name;course;points\n");
        for (Bank bank : this.) {
            bufferedWriter.write(bank.toCSV());
            bufferedWriter.newLine();
        }
    }
}
