package org.example.weldfieldproducer;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.inject.WeldInstance;

public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        weld.addBeanClasses(SomeProducer.class);
        weld.disableDiscovery();
        WeldContainer container = weld.initialize();

        WeldInstance.Handler<SomeInterface> handler = container.select(SomeInterface.class).getHandler();
        System.out.println(handler.getBean().getScope());
        System.out.println(handler.get().hashCode());

        handler = container.select(SomeInterface.class).getHandler();
        System.out.println(handler.getBean().getScope());
        System.out.println(handler.get().hashCode());
    }
}
