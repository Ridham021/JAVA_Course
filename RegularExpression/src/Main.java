import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String s = "Abceeexyz";
        System.out.println(s.replaceAll(".", "Y"));
        System.out.println(s.replaceAll("^Abcee", "X"));

        System.out.println(s.matches("^hello")); //false
        System.out.println(s.matches("^Abceeexyz")); //true - check for whole string
        System.out.println(s.replaceAll("xyz$", "The End")); //check at the end

        System.out.println(s.replaceAll("[Aez]", " REPLACE ")); //replace chaarcter which is in [].
        System.out.println(s.replaceAll("[Aey][ez]", " REPLACE ")); //replace if character in [][] both bracket comes after one another.

        String s2 = "Ridham and ridham and Rajsdgf345645669012" ;
        System.out.println(s2.replaceAll("[Rr]idham","ridham")); //will replace [Rr]idham with ridham in whole string
        System.out.println(s2.replaceAll("[^a ]","X")); //will replace all letters except a.
        System.out.println(s2.replaceAll("[a-f3-8]","X")); //replace letters specified in range in [].
        System.out.println(s2.replaceAll("(?i)[a-h3-8]","X")); // case sensitivity will be ignored.

        System.out.println(s2.replaceAll("[0-9]","X")); // replace digits
        System.out.println(s2.replaceAll("\\d","X")); //replace digits

        System.out.println(s2.replaceAll("\\D","X")); //replace non-digits

        String hasWhitespace = "This has whitespace .";
        System.out.println(hasWhitespace);

        System.out.println(hasWhitespace.replaceAll("\\s","")); //remove whitespace
        System.out.println(hasWhitespace.replaceAll("\\W","")); //remove whitespace
        System.out.println(hasWhitespace.replaceAll("\\w","")); //replace other than whitespace.

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");



        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPatten = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);

        while(h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        // "abc" "a" and "b" and "c"
        // [[Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        // t(?=v)
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));


        String str = "XYYYZZZAAABCDEFFFGG";
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length-1;i++){

            if(arr[i] != arr[i+1] || i+1==arr.length-1){
                sb.append(arr[i]);
            }
        }

        System.out.println(sb);








    }
}