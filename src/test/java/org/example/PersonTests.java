package org.example;

import nl.jqno.equalsverifier.EqualsVerifier; // Import EqualsVerifier library for testing equals and hashCode methods
import org.junit.jupiter.api.Test;

public class PersonTests {
    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Person.class).usingGetClass().verify();
        // UsingGetClass() ensures that the equals method uses getClass() for type checking, but no instanceof
        // if (!(o instanceof Person))
    }
}
