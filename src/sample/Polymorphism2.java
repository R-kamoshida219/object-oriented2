package sample;

public class Polymorphism2 {
public static void main(String[] args) {
    
    Car car = null; //Car型の変数宣言のみ行っておく

    //上で宣言したcarにTaxiオブジェクトの参照を代入
    car = new Taxi();
    
    //Taxiオブジェクトのメソッドが呼ばれる
    car.StepOnAccele();

    //上で宣言したcarにBusオブジェクトの参照を代入
    car = new Bus();

    //Busオブジェクトのメソッドが呼ばれる
    car.StepOnAccele();
}
}
