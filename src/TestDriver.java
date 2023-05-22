import com.flipkart.dao.DBInfo;

import java.sql.Connection;

public class TestDriver {
    public static void main(String[] args) {
//        DBInfo db = new DBInfo();
        Connection conn = DBInfo.getConnection();

        if(conn != null){
            System.out.println("Successful");
        }
        else{
            System.out.println("failure");
        }
    }
}
