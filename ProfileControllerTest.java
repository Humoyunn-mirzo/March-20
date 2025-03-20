import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Main;
import org.example.ProfileController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = Main.class) // Replace with your main class
@ActiveProfiles("test") // Use the test profile
public class ProfileControllerTest {

    @Autowired
    private ProfileController profileController;

    @Test
    void testProfileMessage() {
        String expectedMessage = "Welcome to the Test Environment!";
        assertEquals(expectedMessage, profileController.getMessage());
    }
}

