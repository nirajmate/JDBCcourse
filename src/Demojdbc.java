import java.sql.*;

public class Demojdbc {
    public static void main(String[] args) throws Exception {

        /*
        Import package
        load and register
        create connection
        create statement
        Execute statement
        close connection
        */

//        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "685241753";
        Connection con = DriverManager.getConnection( url,user ,pass );
        System.out.println("connection established////////////////////////");

//        String sql = "insert into student values(6,'priya',88)" ;
//        String sql = "update student set sname ='priyanka' where sid=6" ;
//        String sql = "delete from student where sid=6" ;
        String sql = "select * from student" ;


        Statement st = con.createStatement();

        /*          CRUD OPERATION
         CREATE - READ - UPDATE - DELETE */

        ///////////   READING DATA    /////////////////////////////////////////////////////////
        ResultSet rs = st.executeQuery(sql);
//        rs.next();               // FOR READING SPECIFIC DATA FROM DATASET
//        System.out.println(rs.getString("sname"));
        while(rs.next()){              // FOR READING ALL DATA FROM DATASET

            System.out.print(rs.getInt(1)+" || ");
            System.out.print(rs.getString(2)+" || ");
            System.out.println(rs.getInt(3));}

        /*   CREATING/UPDATING/DELETING OPERATION ON THE DATA /////////////////////////////////
        (JUST CHANGE THE QUERY)*/

//        Boolean statue = st.execute(sql);
//        System.out.println(statue);

        con.close();
        System.out.println("Conection Closed/////////////////////////");

    }
}
