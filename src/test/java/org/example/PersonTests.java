package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class PersonTests {
    @Test
    void equalsContract() {
        EqualsVerifier.forClass(Person.class).usingGetClass().verify();
    }
}
