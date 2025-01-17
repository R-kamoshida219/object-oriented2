package sample;

//何で出力されない？→Manegerクラスのインスタンスを生成できていなかったから（manegers[i] = new Manager();）
public class Main {

public static void main(String[] args) {
    
  Manager[] manegers = new Manager[3];

    manegers[0] = new Manager();
    manegers[0].setName("Taro Yamada");
    manegers[0].setId(101);
    manegers[0].setSalary(80000);
    manegers[0].setDepartment("Sales");

    manegers[1] = new Manager();
    manegers[1].setName("Hanako Suzuki");
    manegers[1].setId(102);
    manegers[1].setSalary(90000.0);
    manegers[1].setDepartment("Marketing");

    manegers[2] = new Manager();
    manegers[2].setName("Ichiro Tanaka");
    manegers[2].setId(103);
    manegers[2].setSalary(85000.0);
    manegers[2].setDepartment("HR");


    for(int i = 0;i < manegers.length; i++){
    System.out.println("Name:" + manegers[i].getName());
    System.out.println("ID:" + manegers[i].getId());
    System.out.println("Salary:" + manegers[i].getSalary());
    System.out.println("Department:" +manegers[i].getDepartment());
    }
}
}
