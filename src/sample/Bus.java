package sample;

public class Bus extends Car{

  private  int price;

@Override
public void StepOnAccle(){
super.StepOnAccle();
speed += 10;

price += 30;
System.out.println("料金は" + price + "円です");
}
}

//Carクラスの継承