import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;



    Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public int getAge() throws ParseException {



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birthdate = birthDate;

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(birthdate, formatter);
        LocalDate today = LocalDate.now();
        int birthyear = localDate.getYear();
        int todayYear = today.getYear();
       // System.out.println("birhtyear = "+birthyear+", todayYear = "+todayYear);

        return todayYear-birthyear;
    }

    public double collectPay()
    {

          return 0;
    }

    public void terminate(String endDate)
    {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}






