package io.deniffel.tcr;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CustomerAPI {

    List<Customer> customers = new LinkedList<>();

    public void create(Customer o) {
        throw new IllegalArgumentException();
    }

    public List<Customer> all() {
        return customers;
    }
}
