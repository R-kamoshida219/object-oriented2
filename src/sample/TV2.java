package sample;

public class TV2 implements Electrical { //クラス名にエラーがでるのは抽象メソッドをオーバーライドしてないから

//電源のON/OFFを表す 電源ON:true 電源OFF：false
private boolean powerOn;
//チャンネル
private int channel;

//インターフェイスで定義されている抽象メソッドを実装
//実装しなければコンパイルエラー
    @Override
    public void power(){
        if(powerOn){
            System.out.println("テレビの電源が切れました");
            powerOn = false;
        }else{
            System.out.println("テレビの電源が入りました");
            powerOn = true;
        }
    }

    //チャンネルを切り替える操作（今までどおり普通のメソッドも定義できる）
    public void changeChannel(){
        if(!powerOn){
            System.out.println("テレビの電源をいれてください");
            return;
        }
  
    this.channel = channel;
    System.out.println(this.channel +"チャンネルに切り替わりました");
}
}
