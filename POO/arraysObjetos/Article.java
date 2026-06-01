package arraysObjetos;
//Empresa de tecnologia quiere saber su producto mas costoso
public class Article {
    String name;
    int price;
    Article(String name, int price){
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args){
        Article cpu = new Article("CPU", 10000);
        Article mouse = new Article("mouse", 2000);
        Article monitor = new Article("Monitor", 5000);
        Article keyboard = new Article("Keyboard", 2500);
        Article products[] = {cpu,mouse,monitor,keyboard};
        String higherName = "";
        int higherPrice = 0;
        for (int i = 0; i < products.length; i++){
            if (products[i].price > higherPrice){
                higherName = products[i].name;
                higherPrice = products[i].price;
            }
        }
        System.out.println("The artcle higher is: " + higherName + " its price is: " + higherPrice);
    }
}
