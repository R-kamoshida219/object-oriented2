//演習７のためのクラス
package sample;

public class Medal {
private String name; //製品名（金メダルなど）
private int price;   //製品の価格　※材料のコスト + (従業員の給料の合計 / 製品数) * 1.2


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
}
