package sample;
public class InstantiateTaxi {
public static void main(String[] args) {
    
    Taxi taxi = new Taxi();

    taxi.setSpeed(0) ;
    taxi.setName( "タクシー仕様のプリウス");


taxi.StepOnAccle();
taxi.StepOnAccle();
taxi.StepOnBrake();

System.out.println("現在の速度は" + taxi.getSpeed() + "km/hです");
}
}

//【要注意】/////////////////////////////////////////////////////////////////////////
//同じライブラリ内でクラスを作成していないと、クラス名のところでエラーが発生する（赤波線）//
//ミスったので、今後注意！！                                                        //
///////////////////////////////////////////////////////////////////////////////////