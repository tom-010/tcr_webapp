package io.deniffel.tcr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerValidationTest {

    @Test
    public void emptyCustomer_notValid() {
        assertFalse(new Customer().isValid());
    }
}
