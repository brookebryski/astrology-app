package javapractice.astrologyapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class ZodiacHandlerTest {
    private IZodiacGetter zodiacGetter;
    private IZodiacValidator zodiacValidator;
    private IZodiacHandler zodiacHandler;

    @BeforeEach
    public void startup() {
        this.zodiacGetter = mock(ZodiacGetter.class);
        this.zodiacValidator = mock(ZodiacValidator.class);

        this.zodiacHandler = new ZodiacHandler(zodiacGetter,zodiacValidator);
    }

    @Test
    public void givenAppStartsCallGetInputOnce() {
        when(zodiacGetter.getInput()).thenReturn("leo");
        when(zodiacValidator.isZodiac("leo")).thenReturn(true);
        zodiacHandler.getZodiac();
        verify(zodiacGetter, times(1)).getInput();
    }

    @Test
    public void givenLeoCallIsZodiacOnce() {
        when(zodiacGetter.getInput()).thenReturn("leo");
        when(zodiacValidator.isZodiac("leo")).thenReturn(true);
        zodiacHandler.getZodiac();
        verify(zodiacValidator, times(1)).isZodiac("leo");
    }

}