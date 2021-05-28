package pattern.state;

public class Off implements OnOffState {

    private static Off instance = new Off();

    public static Off instance() {
        return instance;
    }

    @Override
    public void doWork() {
        System.out.println("Television off");
    }

    @Override
    public void toggle(Television ctx) {
        ctx.setOnOffState(On.instance());
    }
}
