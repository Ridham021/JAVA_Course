public class StringUtilities {
    private static StringBuilder sBuilder = new StringBuilder();
    private int charsAdd = 0;
    public static void main(String[] args) {

    }

    public void addChar(StringBuilder sb , char c ){

            sb.append(c);
            charsAdd++;


       // System.out.println(sBuilder);


        }
    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix_"+upper;
    }

    public String addSuffix(String str){
        return str+"_Suffix";
    }
}
