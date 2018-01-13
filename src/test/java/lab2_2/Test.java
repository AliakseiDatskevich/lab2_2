package lab2_2;

import static org.junit.Assert.assertEquals;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class Test {

    @org.junit.Test
    public void chechHashAndgeneratedID() {
        Id id1;
        System.out.println(id1 = Id.generate());
        ClientData client1 = new ClientData(id1, "Vitya");
        assertEquals(client1.getAggregateId() + client1.getName() + id1.hashCode(), "1234Ivan1509442");

        // System.out.println(client1.getAggregateId() + client1.getName() + id1.hashCode());
        // assertEquals(client1.getAggregateId() + client1.getName() + id1.hashCode(), "1234Ivan1509442");
    }
}
