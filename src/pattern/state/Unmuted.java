package pattern.state;

public class Unmuted implements MuteState {

    private static Unmuted instance = new Unmuted();

    public static Unmuted instance() {
        return instance;
    }

    @Override
    public void doWork() {
        System.out.println("Television unmuted");
    }

    @Override
    public void toggle(Television ctx) {
        ctx.setMuteState(Muted.instance());
    }
}
