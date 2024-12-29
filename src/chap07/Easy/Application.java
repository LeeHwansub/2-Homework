package chap07.Easy;

public class Application {

    public static void main(String[] args) {

        Product[] product = new Product[3];

        product[0] = new Product("상품1",1000);
        product[1] = new Product("상품2",2000);
        product[2] = new Product("상품3",3000);

        int sum =0;
        for (Product productPrice : product){
            sum += productPrice.price;


        }
        System.out.println("총 가격 :" + sum);
    }
}
