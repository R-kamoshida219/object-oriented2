package sample;

public class PC  implements Electrical{
    private boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

 @Override
  public void power(){
    if(powerOn = false){
        powerOn =true;
        System.out.println("PCの電源が切れました");
    }else{
        System.out.println("設定ファイルを読み込んでいます");
        powerOn = false;
        System.out.println("PCの電源が入りました");
    }
  }

    
}
