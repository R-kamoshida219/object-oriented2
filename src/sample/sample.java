//継承
package sample;

public class sample {
public static void main(String[] args) {
    Car hoge = new Taxi();    //TaxiはCarクラスを継承しているのでインスタンス生成可能（ポリモーフィズム）
    Object fuga = new Taxi(); //Objectクラスは全てのクラスのスーパークラスのため
    hoge.StepOnAccele(); //stepONアクセルは、オーバーライドされているのでTaxiクラスから呼ばれるOK!
    //hoge.payment();     //コンパイルエラー

    Electrical ele1 = new TV2(); //TV2がElectricalのインターフェイスを実装しているから
}
}
