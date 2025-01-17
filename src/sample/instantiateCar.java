//Car.javaの実行クラス

package sample;

public class instantiateCar {
public static void main(String[] args) {
    Car estima = new Car();
    //estima.speed = 30;
    estima.setSpeed(30); 
    estima.setName("エスティマ");
   //estima.name = "30";

    System.out.println("スピードは" + estima.getSpeed()+"です");
    System.out.println("車名は" + estima.getName()+ "です");
}
}
