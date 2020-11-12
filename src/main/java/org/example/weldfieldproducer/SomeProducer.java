package org.example.weldfieldproducer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class SomeProducer {
    @Dependent
    @Produces
    private SomeInterface impl = new SomeImpl();
/*
    @Dependent
    @Produces
    public SomeInterface produce() {
        return new SomeImpl();
    }*/
}
