package io.deniffel.tcr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerAPITests {

    @Test(expected = IllegalArgumentException.class)
    public void creatingCustomerWithNull_Throws() {
        new CustomerAPI().create(null);
    }

    @Test
    public void allCustomers_initialNoElements() {
        assertEquals(0, new CustomerAPI().all().size());
    }

    @Test
    public void allCustomers_correctListSize() {
        CustomerAPI api = new CustomerAPI();
        api.customers.add(createValidCustomer());
        api.customers.add(createValidCustomer());
        api.customers.add(createValidCustomer());

        assertEquals(3, api.all().size());
    }

    private Customer createValidCustomer() {
        return new Customer();
    }
}
 