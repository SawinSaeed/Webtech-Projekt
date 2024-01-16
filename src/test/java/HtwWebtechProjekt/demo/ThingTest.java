package HtwWebtechProjekt.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {

    @Test
    public void testThing() {
        Thing thing = new Thing();
        thing.setName("Test");
        thing.setPrice(100);
        assertEquals("Test", thing.getName());
        assertEquals(100, thing.getPrice());

        Thing thing2 = new Thing("Test", 100);
        assertEquals(thing, thing2);
    }
}