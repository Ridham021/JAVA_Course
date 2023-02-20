import java.util.HashMap;
import java.util.Map;

public class Maps {


    public static void main(String[] args) {
        Map<String , String> languages = new HashMap<>();
        languages.put("Java","a compiled high level, object-oriented, platform inddependent language");
        languages.put("Python","an interpreted, object-oriented , high level");
        languages.put("Algol","Algorithmic language");
        languages.put("BASIC","Beginners All purposes Symbolic Instruction code");

        System.out.println(languages.get("Java"));

        System.out.println("=============================================");

        for(String key : languages.keySet()){
            System.out.println(key + " : "+languages.get(key));
        }


        System.out.println("=============================================");
    }
}
