package sample;

public class Polymorphism3 {
public static void main(String[] args) {
    //TVオブジェクトをインスタンス化
    TV2 tv2 = new TV2();
    //PCオブジェクトをインスタンス化
    PC pc = new PC();
    //TVを利用する
    use(tv2);
    //PCを利用する
    use(pc);
}
    //製品を利用するメソッド
    public static void use(Electrical eleItem){
    eleItem.power();
    }
}
