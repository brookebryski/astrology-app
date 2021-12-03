package javapractice.astrologyapp;

public class ZodiacHandler implements IZodiacHandler {
    private IZodiacGetter _zodiacGetter;
    private IZodiacValidator _zodiacValidator;
    private String _zodiac;

    public ZodiacHandler(IZodiacGetter zodiacGetter, IZodiacValidator zodiacValidator) {
        this._zodiacGetter = zodiacGetter;
        this._zodiacValidator = zodiacValidator;
    }

    public String getZodiac() {
     String input = _zodiacGetter.getInput();
     while (!isValid(input)) {
         System.out.println("Please enter a valid zodiac sign.");
         input = _zodiacGetter.getInput();
     }
     return _zodiac;
}

private boolean isValid(String _zodiac) {
    if (_zodiacValidator.isZodiac(_zodiac)) {
        return true;
    }
    return false;
    }

    public String getTraits(String _zodiac) {
        if (_zodiac.equals("aquarius")) {
            return "Progressive, original, independent, humanitarian";
        } else if (_zodiac.equals("pisces")) {
            return "Compassionate, artistic, intuitive, gentle, wise, musical";
        } else if (_zodiac.equals("aries")) {
            return "Courageous, determined, confident, enthusiastic, optimistic, honest, passionate";
        } else if (_zodiac.equals("taurus")) {
            return "Reliable, patient, practical, devoted, responsible, stable";
        } else if (_zodiac.equals("gemini")) {
            return "Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas";
        } else if (_zodiac.equals("cancer")) {
            return "Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive";
        } else if (_zodiac.equals("leo")) {
            return "Creative, passionate, generous, warm-hearted, cheerful, humorous";
        } else if (_zodiac.equals("virgo")) {
            return "Loyal, analytical, kind, hardworking, practical";
        } else if (_zodiac.equals("libra")) {
            return "Cooperative,diplomatic, gracious, fair-minded, social";
        } else if (_zodiac.equals("scorpio")) {
            return "Resourceful, powerful, brave, passionate, a true friend";
        } else if (_zodiac.equals("sagittarius")) {
            return "Generous, idealistic, great sense of humor";
        } else {
            return "Responsible, disciplined, self-control, good managers";
        }
    }
}

