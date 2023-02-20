import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println(array[2]);

        //Enhanced for loop , for each

        for(int element : array){
            System.out.println(element);
        }

        int n=2;

        System.out.println(Arrays.toString(array));

        Object objectInstance = array;
        if(objectInstance instanceof int[])
        {
            System.out.println("object is Array");
        }

        //Array of Object
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("Hello");
        objectArray[2] = array;

        System.out.println(objectArray[1]);
    }
}