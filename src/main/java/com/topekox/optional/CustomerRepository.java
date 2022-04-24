package com.topekox.optional;

public interface CustomerRepository {

    public Customer findById(String id);

    public Customer createNew();

}
