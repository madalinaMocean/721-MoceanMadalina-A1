package com.company.Service;


import com.company.Model.Client;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientService {

    //noEmployess desc order
    public List<Client> sortListeTiereByName(List<Client> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(Client::getNoEmployees))
                .collect(Collectors.toList());
    }
}
