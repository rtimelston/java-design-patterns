package pattern.state;

public class Television {
    private OnOffState onOffState;
    private MuteState muteState;

    public Television() {
        onOffState = Off.instance();
        muteState = Unmuted.instance();
    }

    public void toggleOnOff() {
        this.onOffState.toggle(this);
        this.onOffState.doWork();
    }

    public void toggleMute() {
        if(onOffState instanceof Off) return;
        this.muteState.toggle(this);
        this.muteState.doWork();
    }

    public void setOnOffState(OnOffState onOffState) {
        this.onOffState = onOffState;
    }

    public void setMuteState(MuteState muteState) {
        this.muteState = muteState;
    }
}
