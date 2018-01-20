package adapter;

public class AdapterImpl implements Adapter{
    @Override
    public Float twiceOf(Float f) {
        //return (float)Math.twoTime(f.doubleValue());

        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        // Math 함수에 직접적으로 log를 찍는 것이 아니라 이곳 나의 구현 함수에 log를 찍음.

        System.out.println("절반 호출");
        return (float)Math.half(f.doubleValue());
    }
}
