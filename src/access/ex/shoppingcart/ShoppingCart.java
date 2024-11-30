package access.ex.shoppingcart;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
            items[itemCount] = item;
            itemCount++;
    }


    // 배열 전체 순환하면 안됨. 10개를 무조건 다 채웠으면 몰라도 덜 채웠으면 안채운 인덱스에서 nullPointException 터진다.
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" +items[i].getPrice() * items[i].getQuantity());
        }
        System.out.println("전체 가격 합:" + calculatedTotalPrice());
    }

    private int calculatedTotalPrice() {
        int totalPirce = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPirce += item.getTotalPrice();
        }
        return totalPirce;
    }
}
