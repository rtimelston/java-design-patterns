package pattern.state;

public interface MuteState {
    public void doWork();
    public void toggle(Television ctx);
}
