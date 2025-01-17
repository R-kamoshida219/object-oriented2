package sample;

public class InstantiateTaxi2 {
public static void main(String[] args) {

    //TaxiクラスからTaxiオブジェクトをインスタンス化
    Taxi Taxi = new Taxi();
    Taxi.setSpeed(10);
    Taxi.price = 1000;
    Taxi.StepOnAccele(); //料金を1000円支払う
    Taxi.payment();     //支払う

}
}
