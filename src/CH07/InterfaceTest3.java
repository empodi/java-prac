package CH07;

interface II {
    public abstract void methodB();
}

class InstanceManager {
    public static II getInstance() {
        return new BBB();
    }
}

class AAA {
    void methodA() {
        II i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

class BBB implements II {
    public void methodB() {
        System.out.println("methodB in BBB class");
    }
    public String toString() { return "class BBB"; }
}

class InterfaceTest3 {
    public static void main(String[] args) {
        AAA a = new AAA();
        a.methodA();
    }
}
