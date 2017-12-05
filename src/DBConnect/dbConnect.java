package DBConnect;
import java.sql.*;
public class dbConnect {
        //public String url = "localhost";
        private String url = "172.16.20.180";
        private String ourl="orcl.ictc.kln.ac.lk";
        private String oport="1521";
        private String ouser="sarathch_ps14049";
        private String opw = "kg2225494";
        private String oSID= "STCS";
        private String port = "3306"; //8889
        private String database = "hacklnjava";
        private String user = "admin";
        private String password = "stcs";//root
        public String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        Connection conn = null;

        //Function to Connect to DB
        public void Connect2DB()
        {
            String DB_URL = "jdbc:mysql://"+url+":"+port+"/"+database;
            Statement dbstmt=null;
            try {
                conn = DriverManager.getConnection(DB_URL,user,password);//Connect
                //dbstmt = conn.createStatement();
                System.out.println("Connected");
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
            //return dbstmt;
        }

        public void Conn2DBO(){
            String DB_URL="jdbc:oralce:thin@"+ourl+":"+oport+":"+oSID;
            try{
                conn = DriverManager.getConnection(DB_URL,ouser,opw);
                System.out.println("connected orcl");
            }
            catch(SQLException se){
                se.printStackTrace();
            }
    }


    public Statement Conn2DB()
    {
        String DB_URL = "jdbc:mysql://"+url+":"+port+"/"+database;
        Statement dbstmt=null;
        try {
            conn = DriverManager.getConnection(DB_URL,user,password);//Connect
            dbstmt = conn.createStatement();
            System.out.println("Connected");
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        return dbstmt;
    }
    public  void closeDB(){
            try{
                conn.close();;
            }
            catch (SQLException se){
                se.printStackTrace();
            }
    }

}
