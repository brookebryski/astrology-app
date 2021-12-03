package javapractice.astrologyapp;

public class FlowControl implements IFlowControl {
    private IZodiacHandler _zodiacHandler;

    public FlowControl(IZodiacHandler zodiacHandler) {
        this._zodiacHandler = zodiacHandler;
    }

    @Override
    public boolean run() {
    String zodiac = _zodiacHandler.getZodiac();
    }
}
