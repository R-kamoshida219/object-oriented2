package sample;

public class InstantiateTaxi3 {
public static void main(String[] args) {
    
    System.out.println("車を走らせます");
   Car car = new Car();
   car.StepOnAccele();

   System.out.println("タクシーを走らせます");
   Taxi Taxi = new Taxi();
   Taxi.StepOnAccele();
}
}

//Taxi.javaの実行用クラス////
