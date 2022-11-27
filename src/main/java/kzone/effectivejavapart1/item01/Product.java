package kzone.effectivejavapart1.item01;

public class Product {
    public static void main(String[] args) {
        /**
         * 정적 팩토리 메소드는 생성자가 못하는 컨트롤을 할 수 있다.
         */
        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();

        System.out.println(settings1);
        System.out.println(settings2);
    }
}
