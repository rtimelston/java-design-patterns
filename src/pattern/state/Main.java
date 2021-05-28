package pattern.state;

public class Main {
    public static void main(String...args) {
        Television tv = new Television();
        tv.toggleOnOff();
        tv.toggleMute();
        tv.toggleOnOff();
        tv.toggleOnOff();
        tv.toggleOnOff();
        tv.toggleMute();
    }
}
