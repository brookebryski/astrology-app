package javapractice.astrologyapp;

import java.util.Locale;

public class ZodiacValidator implements IZodiacValidator {
    public boolean isZodiac(String zodiac) {
        String cleanZodiac = zodiac.toLowerCase();
        if(cleanZodiac.equals("aquarius")) {
            return true;
        } else if (cleanZodiac.equals( "pisces")) {
            return true;
        } else if (cleanZodiac.equals("aries")) {
            return true;
        } else if (cleanZodiac.equals("taurus")) {
            return true;
        } else if (cleanZodiac.equals("gemini")) {
            return true;
        } else if (cleanZodiac.equals("cancer")) {
            return true;
        } else if (cleanZodiac.equals("leo")) {
            return true;
        } else if (cleanZodiac.equals("virgo")) {
            return true;
        } else if (cleanZodiac.equals("libra")) {
            return true;
        } else if (cleanZodiac.equals("scorpio")) {
            return true;
        } else if (cleanZodiac.equals("sagittarius")) {
            return true;
        } else if (cleanZodiac.equals("capricorn")) {
            return true;
        } else {
            return false;
        }
    }
}