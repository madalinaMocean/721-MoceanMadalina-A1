package com.company.Model;
import java.util.Objects;

public class Client implements Comparable<Client>{
    private int Id;
    private String CompanyName;
    private CompanySize Size;
    private int NoEmployees;
    private int IncomeFromCustomer;
    private String Location;

    public Client(int id, String companyName, CompanySize size, int noEmployees, int incomeFromCustomer, String location) {
        super();
        Id = id;
        CompanyName = companyName;
        Size = size;
        NoEmployees = noEmployees;
        IncomeFromCustomer = incomeFromCustomer;
        Location = location;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public CompanySize getSize() {
        return Size;
    }

    public void setSize(CompanySize size) {
        Size = size;
    }

    public int getNoEmployees() {
        return NoEmployees;
    }

    public void setNoEmployees(int noEmployees) {
        NoEmployees = noEmployees;
    }

    public int getIncomeFromCustomer() {
        return IncomeFromCustomer;
    }

    public void setIncomeFromCustomer(int incomeFromCustomer) {
        IncomeFromCustomer = incomeFromCustomer;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString(){
        return "Client{" +
                "Id=' " + Id + '\'' +
                "CompanyName=' "+ getCompanyName() + '\'' +
                ", Size=' " + getSize() + '\'' +
                ", NoEmployees=' " + getNoEmployees() + '\'' +
                ", IncomeFromCustomer=' " + getIncomeFromCustomer() + '\'' +
                ", Location=' " + getLocation() + '\'' + '}';
    }


}
