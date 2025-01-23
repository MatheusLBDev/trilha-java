package Model;

public class SmartTv {
    private boolean tvOn;
    private int channel;
    private int volume;

    public SmartTv(){
        this.tvOn = false;
        this.channel = 1;
        this.volume = 0;
    }

    public void onTv(boolean status){
        this.tvOn = status;
    }

    public void setChannel (int channel){
        if(tvOn) {
            this.channel = channel;
        }
    }

    public void upVolume( ) {
        if(tvOn && volume < 100)
            this.volume ++;
    }

    public void downVolume( ) {
        if(tvOn && volume > 0)
            this.volume --;
    }

    public boolean isTvOn() {
        return tvOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}
