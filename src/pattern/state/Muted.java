package pattern.state;

public class Muted implements MuteState {

    private static Muted instance = new Muted();

    public static Muted instance() {
        return instance;
    }

    @Override
    public void doWork() {
        System.out.println("Television muted");
    }

    @Override
    public void toggle(Television ctx) {
        ctx.setMuteState(Unmuted.instance());
    }
}
