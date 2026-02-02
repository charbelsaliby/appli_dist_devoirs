import java.sql.*;
 
public class test {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres"; 
        String password = "********"; 
 
        Connection cx = null;
        Statement st = null;
        ResultSet rs = null;
 
        try {
            Class.forName("org.postgresql.Driver");
            cx = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to PostgreSQL database successfully!");
            st = cx.createStatement();
            rs = st.executeQuery("SELECT * FROM personnes");
            while (rs.next()) {
                String nom = rs.getString("nom");
                int age = rs.getInt("age");
                System.out.println(nom + " a " + age + " ans");
            }
 
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (st != null)
                    st.close();
                if (cx != null)
                    cx.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

 
