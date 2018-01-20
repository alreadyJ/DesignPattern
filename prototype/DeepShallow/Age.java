package prototype.DeepShallow;

public class Age {
    int year;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getYear() {
        return year;

    }

    public Age(int year, int value) {
        this.year = year;
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
