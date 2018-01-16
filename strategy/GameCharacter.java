package strategy;

public class GameCharacter {
    //접근 점
    Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack () {
        // 나는 공격만 하면 됨, 선택은 웨폰에서 해주겠지 ?
        if (weapon == null) System.out.println("맨손 공격");
        else weapon.attack();
    }
}
