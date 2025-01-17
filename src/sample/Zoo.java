//要確認

package sample;

public class Zoo {

    public static void main(String[] args) {
        
        Animal[] animals = new Animal[5];

        animals[0] = new Sheep();     //それぞれのオブジェクトをインスタンス化して、その参照変数を配列に格納する
        animals[1] = new Horse();     //それぞれの動物はAnimalインターフェイスを実装しているので、Animal型の配列にいれられる
        animals[2] = new Goat();
        animals[3] = new Monkey();
        animals[4] = new Bear();
        
         for(int i=0; i < animals.length; i++){
           animals[i].cry();
         }
        };
    }

