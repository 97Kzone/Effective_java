package kzone.effectivejavapart1.item01;

public class Order {
    private boolean prime;
    private boolean urgent;

    private Product product;

    /**
     * 생성자의 시그니처가 중복되는 경우 정적 팩토리 메서드를 고려하라
     */
    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}
