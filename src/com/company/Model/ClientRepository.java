package com.company.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository {

    public List<Client> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Client client;
        List<Client> listClients = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            client = new Client(Integer.parseInt(attributes[0]), attributes[1], CompanySize.valueOf(attributes[2]), Integer.parseInt(attributes[3]),Integer.parseInt(attributes[4]),attributes[5]);
            listClients.add(client);

            line = bufferedReader.readLine();
        }

        return listClients;
    }

    public void writeToFile(String fileName, List<Client> list, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Client client : list) {
            String line =
                    client.getId() + character +
                    client.getCompanyName() + character +
                    client.getSize() + character +
                    client.getNoEmployees()+
                    client.getIncomeFromCustomer()+
                    client.getLocation();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
