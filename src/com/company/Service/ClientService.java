package com.company.Service;


import com.company.Model.Client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientService {

    //noEmployess desc order
    public List<Client> sortListClientByNoEmployeesDesc(List<Client> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Client::getNoEmployees))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Client> sortListClientByIncomeDesc(List<Client> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Client::getIncomeFromCustomer))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
