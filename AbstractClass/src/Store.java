import java.util.ArrayList;

record OrderItem(int qty , ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {

        storeProducts.add(new ArtObject("oil painting",1350,"great painting by picaso"));
        storeProducts.add(new ArtObject("Sculpture",20000,"Bronze work by JKF , produced in 1950"));
        storeProducts.add(new ArtObject("Desk",500,"Mahogany Desk"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 1");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,2,2);
        addItemToOrder(order2,1,2);
        printOrder(order2);


    }

    public static void listProducts(){
        for(var item:storeProducts){
            System.out.println("_".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex ,int qty ){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
            System.out.printf("Sales Total = %6.2f %n",salesTotal);
        }
    }
