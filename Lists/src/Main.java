import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name , String type , int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString()
    {
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Object groceryArray[] = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple","produce",6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray ));

        ArrayList<GroceryItem> objectlist = new ArrayList<>();

        objectlist.add(new GroceryItem("Chocolate"));
        objectlist.add(0,new GroceryItem("apple","PRODUCE",6));
        objectlist.add(2,new GroceryItem("Curd"));

        System.out.println(objectlist);
        System.out.println(String.valueOf(objectlist.getClass()));
        objectlist.toString();
        System.out.println(objectlist.get(0));
    }
}