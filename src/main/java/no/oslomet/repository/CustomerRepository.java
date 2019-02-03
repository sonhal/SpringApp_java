package no.oslomet.repository;

import no.oslomet.model.Customer;

import java.util.List;

public interface  CustomerRepository {
    List<Customer> findAll();
}
