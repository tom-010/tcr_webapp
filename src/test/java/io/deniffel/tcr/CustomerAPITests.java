package io.deniffel.tcr;

import org.junit.Test;

public class CustomerAPITests {

    @Test(expected = IllegalArgumentException.class)
    public void creatingCustomerWithNull_Throws() {
        new CustomerAPI().create(null);
    }
}
