public class SmartTelevision implements RemoteControl,Searchble{

    private int Volume;
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.Volume=RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.Volume=RemoteControl.MIN_VOLUME;
        }else{
            this.Volume=volume;
        }
        System.out.println("현재 TV 볼륨 :"+volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url +"를 검색합니다.");
    }
}
