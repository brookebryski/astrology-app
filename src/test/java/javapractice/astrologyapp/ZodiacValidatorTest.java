package javapractice.astrologyapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZodiacValidatorTest {
    @Test
    public void givenAquariusGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "aquarius"
        boolean zodiac = zv.isZodiac("aquarius");
        // Then: I get back "true"
        assertTrue(zodiac);
    }

    @Test
    public void givenLeoGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "leo"
        boolean zodiac = zv.isZodiac("leo");
        // Then: I get back "true"
        assertTrue(zodiac);
    }

    @Test
    public void givenCapitalCapricornGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "capricorn"
        boolean zodiac = zv.isZodiac("Capricorn");
        // Then: I get back "true"
        assertTrue(zodiac);
    }

    @Test
    public void givenBobGetFalse() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "bob"
        boolean zodiac = zv.isZodiac("bob");
        // Then: I get back "false"
        assertFalse(zodiac);
    }

}
