package ch07;

class MyTv {
    private boolean isPowerOn; // 클래스 외부에서 접근할 수 없도록 제어자를 붙임
    private int channel;       // 클래스 외부에서 접근할 수 없도록 제어자를 붙임
    private int volume;        // 클래스 외부에서 접근할 수 없도록 제어자를 붙임
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        
        this.volume = volume;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        
        this.channel = channel;
    }
    
    public int getChannel() {
        return channel;
    }
}

public class Exercise7_4 {

    public static void main(String[] args) {
        
        MyTv t = new MyTv();
        
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }

}
