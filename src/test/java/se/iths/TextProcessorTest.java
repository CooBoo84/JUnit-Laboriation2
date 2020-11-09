package se.iths;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import static org.junit.jupiter.api.Assertions.*;

@Disabled
class TextProcessorTest {

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Testing @BeforeEach");
    }

    @Test
    @DisplayName("Using @DisplayName on testLowerCase")
    public void testLowerCase() {
        assertEquals("apelsin", TextProcessor.lowerCase("APELSIN"));
    }

    @Test
    public void testUpperCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertNotNull("APELSIN" == textProcessor.upperCase("Äpple"));
    }

    @RepeatedTest(5)
    public void testReverse() {
        assertEquals("nislepa", TextProcessor.reverseWord("apelsin"));
    }
}