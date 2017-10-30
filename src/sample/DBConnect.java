package sample;

import java.sql.*;

public class DBConnect {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","*password*");
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }

    }

    public boolean getData() {
        try {
            String query = "select * from user_info";
            rs = st.executeQuery(query);
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                if (Controller.username.equals(username) && Controller.password.equals(password)) {
                    return true;
                }
            }
        } catch(Exception ex) {
            System.out.println("Error " + ex);
        }
        return false;
    }
}
