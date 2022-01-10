package com.company;

import com.company.Model.Client;
import com.company.Model.ClientRepository;
import com.company.Service.ClientService;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // write your code here
        ClientRepository clientRepository = new ClientRepository();
        ClientService clientService = new ClientService();

        try {
            List<Client> listClient = clientRepository.readFromFile("C:\\Users\\bau\\Documents\\GitHub\\PraktischePrufung\\src\\com\\company\\tiere.txt", "#");

            List<Client> sortedClientsNoEmployees= clientService.sortListClientByNoEmployeesDesc(listClient);
            List<Client> sortedClientsIncome=clientService.sortListClientByIncomeDesc(listClient);

            System.out.println(sortedClientsNoEmployees);
            System.out.println(sortedClientsIncome);

            clientRepository.writeToFile("C:\\Users\\madal\\IdeaProjects\\PracticMAP\\src\\com\\company\\clientsorted.txt", sortedClientsNoEmployees, ",");
            clientRepository.writeToFile("C:\\Users\\madal\\IdeaProjects\\PracticMAP\\src\\com\\company\\statistics.txt", sortedClientsIncome, ",");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
