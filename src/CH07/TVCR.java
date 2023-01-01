package CH07;

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() {}
    void stop() {}
}

class TVCR extends Tv {
    VCR vcr = new VCR();        // VCR 클래스를 포함시켜서 사용한다.
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
}
