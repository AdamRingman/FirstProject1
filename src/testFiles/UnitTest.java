package testFiles;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    @Test
    public void testGetUsername() {
        //Arrange
        User myUser = new User("DragonSlayer37", "Secret583!", "normal");


        //Act
        String actual = myUser.getUsername();
        String expected = "DragonSlayer37";


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPassword() {
        //Arrange
        User myUser = new User("Dragon37", "Secret583!", "normal");


        //Act
        String actual = myUser.getPassword();
        String expected = "Secret583!";


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeUsername() {
        User myUser = new User("Dragon37", "Secret583!", "normal");

        myUser.changeUsername("Pea");

        String actual = myUser.getUsername();
        String expected = "Dragon37";

        assertEquals(expected, actual);
    }

    @Test
    public void testChangePassword() {
        User myUser = new User("Dragon37", "Secrets!", "normal");

        myUser.changePassword("Secrets#");

        String actual = myUser.getPassword();
        String expected = "Secrets#";

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeTypeOfUser() {
        User myUser = new User("Dragon37", "Secret583!", "normal");

        myUser.changeTypeOfUser("admin");

        String actual = myUser.getTypeOfUser();
        String expected = "admin";

        assertEquals(expected, actual);
    }
}
