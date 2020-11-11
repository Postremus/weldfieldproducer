package org.example.weldfieldproducer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class SomeFieldProducer {
    @RequestScoped
    @Produces
    private SomeInterface impl = new SomeImpl();
}
