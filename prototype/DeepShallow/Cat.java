package prototype.DeepShallow;

public class Cat {
    private String name;
    private Age age;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat) clone();
        cat.setAge(new Age(this.age.getYear(), this.age.getValue()));
        return cat;
    }
}
