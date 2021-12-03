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
}

