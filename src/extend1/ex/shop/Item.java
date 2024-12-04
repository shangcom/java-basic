package extend1.ex.shop;

public class Item {

     private String name;
     private int price;

     public Item(String name, int price) {
          this.name = name;
          this.price = price;
     }

     public void print() {
          System.out.println("이름: " + name + ", 가격: " + price);
     }

     public int getPrice() {
      return price;
     }
}