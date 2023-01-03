package CH07;

interface I {
    public abstract void play();
}

class AA {
    void autoPlay(I i) {
        i.play();
    }
}

class BB implements I {
    public void play() {
        System.out.println("play in BB class");
    }
}

class CC implements I {
    public void play() {
        System.out.println("play in CC class");
    }
}

class InterfaceTest2 {
    public static void main(String[] args) {
        AA a = new AA();
        a.autoPlay(new BB());   // void autoPlay(I i) 호출
        a.autoPlay(new CC());   // void autoPlay(I i) 호출
    }
}
