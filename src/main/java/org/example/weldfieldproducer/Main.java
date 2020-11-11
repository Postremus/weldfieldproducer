package org.example.weldfieldproducer;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        weld.addBeanClasses(SomeFieldProducer.class);
        weld.disableDiscovery();
        WeldContainer container = weld.initialize();

        System.out.println(container.select(SomeInterface.class).getHandler().getBean().getScope()); // RequestScoped
    }
}
