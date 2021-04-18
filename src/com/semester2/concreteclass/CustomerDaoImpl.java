package com.semester2.concreteclass;

import com.semester2.enumerations.Country;
import com.semester2.interfaces.CustomerDao;
import com.semester2.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    //List is working as a datasource e.g. Microsoft Dynamics 365 Business Central
    List<Customer> customers;

    public CustomerDaoImpl() {
        customers = new ArrayList<Customer>();
        //String customerNo, String name, String street, int houseNo, String houseAddition, String postalCode, String city, Country country, String phoneNo, String email
        Customer c1 = new Customer("K000001", "Fontys", "Achtseweg Zuid 153", 153, "5651 GW", "Eindhoven", Country.NL, "+31 08850 80000", "professionals@fontys.nl");
        customers.add(c1);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomer(String customerNo) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }
}
