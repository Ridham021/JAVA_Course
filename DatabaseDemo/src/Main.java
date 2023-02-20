import javax.print.DocFlavor;
import java.sql.*;

public class Main {

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static void main(String[] args) {
        try {
//            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:/home/ridham/IdeaProjects/DatabaseDemo/src/test.db");
///home/ridham/IdeaProjects/DatabaseDemo/src
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/ridham/SqliteDatabases/test.db");

            Statement statement = c.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement,"Tim", 6545678, "tim@email.com");
            insertContact(statement,"Joe", 45632, "joe@anywhere.com");
            insertContact(statement,"Jane", 4829484, "jane@somewhere.com");
            insertContact(statement,"Fido", 9038, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " +TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Joe'");
//            st.execute("SELECT * FROM contacts");
//            ResultSet rs = st.getResultSet();

            ResultSet rs = statement.executeQuery("SELECT * FROM contacts");
            while(rs.next()){
                System.out.println(rs.getString("name")+" "+
                                   rs.getInt("phone")+" "+
                                   rs.getString("email"));
            }
            rs.close();
            statement.close();
            c.close();

        }
        catch (SQLException e){
            System.out.println(e);
            System.out.println("Something went wrong");
        }
//
    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}