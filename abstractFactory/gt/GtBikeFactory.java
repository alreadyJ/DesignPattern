package abstractFactory.gt;

import abstractFactory.abst.BikeFactory;
import abstractFactory.abst.Body;
import abstractFactory.abst.Wheel;

public class GtBikeFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
