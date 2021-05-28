package pattern.state;

public class On implements OnOffState {

    private static On instance = new On();

    public static On instance() {
        return instance;
    }

    @Override
    public void doWork() {
        System.out.println("Television on");
    }

    @Override
    public void toggle(Television ctx) {
        ctx.setOnOffState(Off.instance());
    }
}
