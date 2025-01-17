package sample;

public class TV {

   private int channel;

   public void changeChannel(int channel){
     if(channel <= 0 || 13 <= channel){
        System.out.println("チャンネルは1～12までの間で設定してください");
        return;
 

     //throw new Exception("チャンネルは1～12までの間で設定してください");
     }

    this.channel = channel;
    System.out.println(this.channel + "チャンネルに切り替わりました");
}
}
