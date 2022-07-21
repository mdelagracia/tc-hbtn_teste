import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Date;

import static org.junit.Assert.*;

public class PersonTest {

    static Person person;
    public PersonTest() {
        setup();
    }

    @BeforeAll
    public static void setup() {
        person = new Person();
    }

    @ParameterizedTest
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String user) {
        //Arrange

        //Act
        boolean result = person.checkUser(user);

        //Assert
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String user) {
        //Arrange

        //Act
        boolean result = person.checkUser(user);

        //Assert
        assertFalse(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String password) {
        //Arrange

        //Act
        boolean result = person.checkPassword(password);

        //Assert
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String password) {
        //Arrange

        //Act
        boolean result = person.checkPassword(password);

        //Assert
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    public void does_not_have_eight_chars(String password) {
        //Arrange

        //Act
        boolean result = person.checkPassword(password);

        //Assert
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2","Hbtn@123"})
    public void check_password_valid(String password) {
        //Arrange

        //Act
        boolean result = person.checkPassword(password);

        //Assert
        assertTrue(result);
    }
}