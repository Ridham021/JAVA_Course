public class Main {
    public static void main(String[] args) {
/*
        Item coke = new Item("drink","coke",1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("Topping","avocado",1.99);
        avocado.printItem();*/

        /*Burger burger = new Burger("regular",4);
        burger.addToppings("BACON","CHEESE","MAYO");
        burger.printItem();
        */

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("Turkey","7-up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("delux","7-up","chilli");
        deluxMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();
    }

}