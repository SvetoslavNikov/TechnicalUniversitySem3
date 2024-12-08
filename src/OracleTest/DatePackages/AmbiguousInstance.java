package OracleTest.DatePackages;

import java.util.*;
import java.sql.*;

class AmbiguousInstance {

    class BirthdayManager {
        /* WRONG
        private Date rob = new Date(); //does not compile - ambiguous Date persist in sql and util package!
         */
        private java.util.Date Rob = new java.util.Date();
        private java.util.Date Sharon = new java.util.Date();

        public static void main(String[] args) throws InterruptedException {
            long currentDate = System.currentTimeMillis();//current Time to milliseconds

            java.util.Date util = new java.util.Date(currentDate);
            //Works with java.util.Calendar, SimpleDateFormat, or java.time.

            System.out.println("current date and time: " + util);

            java.sql.Date sql = new java.sql.Date(currentDate);
            //subclass of java.util.Date stores only the date not the time
            //Designed for database integration, often used with JDBC
            System.out.println("Current date: " + sql);
        }
    }

}
