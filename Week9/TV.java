public class TV {

    int channel;
    int volume;
    boolean on;

    TV() {
        channel = 1;
        volume = 18;
        on = false;
    }

    void turnon() {
        on = true;
        System.out.println("Now the TV is on");

    }

    void turnoff() {
        on = false;
        System.out.println("Now the TV is off");

    }

    void setChannel(int newChannel) {
        if (newChannel > 0 && newChannel < 121) {
            channel = newChannel;
            System.out.println("Now the channel is " + newChannel);
        }
    }

    void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 35) {
            volume = newVolume;
            System.out.println("Now the volume is " + newVolume);
        }
    }

    void channelUp() {
        if (channel > 0 && channel < 120) {
            channel++;
            System.out.println("Now  the channel is " + channel);
        }
    }

    void channelDown() {
        if (channel >= 1 && channel < 121) {
            channel--;
            System.out.println("Now  the channel is " + channel);
        }
    }

    public void volumeUp() {
        if (volume >= 0 && volume < 120) {
            volume++;
            System.out.println("Now  the volume is " + volume);
        }
    }

    public void volumeDown() {
        if (volume > 0 && volume < 121) {
            volume--;
            System.out.println("Now  the volume is " + volume);
        }
    }
}
