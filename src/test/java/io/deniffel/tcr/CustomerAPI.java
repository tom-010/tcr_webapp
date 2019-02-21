package io.deniffel.tcr;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CustomerAPI {

    List<Object> customers = new LinkedList<>();

    public void create(Object o) {
        throw new IllegalArgumentException();
    }

    public List<Object> all() {
        return customers;
    }
}
