package io.deniffel.tcr;

public class Customer {

    private String name;

    public boolean isValid() {
        return name != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
