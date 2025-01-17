package sample;

public class Taxi extends Car{  //extends　クラス名　：継承

int price;

//支払う操作
void payment(){
    System.out.println("料金を" + price + "円支払いました");
    price =0 ; //支払ったので０にする
}

@Override
 public void StepOnAccele(){
 super.StepOnAccele();
 price = price + 90;
 System.out.println("料金が" + price + "円に増えました");
}
 //super.とすると、Carクラスの共通部分を呼び出す事ができる。
 //speed = speed + 10;
 //System.out.println("スピードが" + speed + "km/hに増えました");
 

    


}
