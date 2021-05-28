package pattern.state;

public interface OnOffState {
    public void doWork();
    public void toggle(Television ctx);
}
