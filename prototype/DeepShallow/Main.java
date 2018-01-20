package prototype.DeepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2017, 1));
        Cat yo = navi.copy();
        yo.setName("yo");
        yo.getAge().setYear(2016);
        yo.getAge().setValue(2);


        yo.setAge(new Age(2016, 2));
        System.out.println(navi.getAge().getYear());
        System.out.println(yo.getAge().getYear());
    }

    /*
    * 객체에 대한 clonable은 깊은 복사를 할 수 없음
    * copy에서 명시적으로 깊은 복사를 해줘야 한다.
    * */
}
