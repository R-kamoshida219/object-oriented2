package sample;

public class Car {
private int speed;   //速度を表す属性
private String name; //車名を表す属性
private boolean flg;


public int getSpeed(){ //ゲッター（値の参照）
return this.speed;
}

public void setSpeed(int speed){ //セッター（値を書き込む）
this.speed = speed;
}


public String getName() {
    return this.name;
}

public void setName(String name) {
    this.name = name;
}

public boolean isFlg() {
    return flg;
}

public void setFlg(boolean flg) {
    this.flg = flg;
}

//引数なしコンストラクタ
public Car(){

}

//引数ありコンストラクタ
public Car(int speed,String name){
    this.speed = speed;
    this.name  = name;
}

//アクセルを踏む操作
public void StepOnAccle(){
    speed = speed + 10;
    System.out.println("スピードが" + speed + "km/hに増えました");
}

//ブレーキを踏む操作
public void StepOnBrake(){
    speed = speed - 10;
    System.out.println("スピードが" + speed + "km/hに減りました");
}
}
