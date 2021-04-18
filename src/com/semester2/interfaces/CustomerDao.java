package com.semester2.interfaces;

import com.semester2.models.Customer;

import java.util.List;

public interface CustomerDao {

    public List<Customer> getAllCustomers();

    public Customer getCustomer(String customerNo);

    public void updateCustomer(Customer customer);

    public void deleteCustomer(Customer customer);
}
