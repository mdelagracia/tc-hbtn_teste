import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    public PersonTest() {
        setup();
    }

    public void setup() {
        String name = "Paul";
        String surname = "McCartney";
        Date birthDate = new Date(2020);
        boolean anotherCompanyOwner = true;
        boolean pensioner = true;
        boolean publicServer = true;
        person = new Person(name, surname, birthDate, anotherCompanyOwner, pensioner, publicServer);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);

        assertEquals(14400, person.calculateYearlySalary(), 0.0f);
    }

    @Test
    public void person_is_MEI() {
        Date birthDate = new Date(1942);
        boolean anotherCompanyOwner = false;
        boolean pensioner = false;
        boolean publicServer = false;
        person.setBirthDate(birthDate);
        person.setAnotherCompanyOwner(anotherCompanyOwner);
        person.setPensioner(pensioner);
        person.setPublicServer(publicServer);

        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }
}