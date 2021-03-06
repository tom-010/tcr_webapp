package io.deniffel.tcr;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CustomerAPI {

    List<Customer> customers = new LinkedList<>();

    public void create(Customer c) {
        if(c == null)
            throw new IllegalArgumentException();
        customers.add(c);
    }

    public List<Customer> all() {
        return customers;
    }
}
