package lab2_2;

import static org.junit.Assert.assertEquals;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class Test {

    @org.junit.Test
    public void clientDataIDtest() {
        Id id1 = new Id("1234");
        ClientData client1 = new ClientData(id1, "Ivan");
        System.out.println(client1.getAggregateId() + client1.getName() + id1.hashCode());
        assertEquals(client1.getAggregateId() + client1.getName() + id1.hashCode(), "1234Ivan1509442");
    }
}
