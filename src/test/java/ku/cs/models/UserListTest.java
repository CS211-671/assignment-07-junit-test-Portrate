package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList u = new UserList();
        u.addUser("Student1", "password1");
        u.addUser("Student2", "password2");
        u.addUser("Student3", "password3");
        // TODO: find one of them

        // TODO: assert that UserList found User
        assertEquals("Student3", u.findUserByUsername("Student3").getUsername());
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList u = new UserList();
        u.addUser("Student1", "password1");
        u.addUser("Student2", "password2");
        u.addUser("Student3", "password3");
        // TODO: change password of one user
        u.changePassword("Student3", "password3", "new_password");
        // TODO: assert that user can change password
        boolean a = u.findUserByUsername("Student3").validatePassword("new_password");
        assertTrue(a);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}