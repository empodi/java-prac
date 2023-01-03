package CH07;

interface Repairable {}

class UnitStar {
    int hitPoint;
    final int MAX_HP;
    UnitStar(int hp) {
        MAX_HP = hp;
    }
    // ...
}

class GroundUnit extends UnitStar {
    GroundUnit (int hp) {
        super(hp);
    }
}

class AirUnit extends  UnitStar {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnit implements Repairable {
    DropShip() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Repairable r) {
        if (r instanceof UnitStar) {
            UnitStar u = (UnitStar) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}

class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropship = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
        // scv.repair(marine); // 에러. repair(Repairable) in SCV cannot be applied to (Marine)
    }
}
