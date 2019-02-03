package no.oslomet.service;

import no.oslomet.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
