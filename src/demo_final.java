import java.sql.*;

public class demo_final {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "685241753";
        Connection con = DriverManager.getConnection( url,user ,pass );


        // user input//
        int sid =6;
        String sname =" sakshi";
        int marks = 88;
        String sql = "insert into student values(?,?,?)" ;
//        String sql = "update student set sname ='priyanka' where sid=6" ;
//        String sql = "delete from student where sid=6" ;
//        String sql = "select * from student" ;


        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();



        con.close();


    }
}
