package org.maquer.java.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.maquer.java.jdbc.connection.ConnectionT;

public class StatementT {
    public static void testConn(Connection connection) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select 1 from dual");
//        rs.setFetchSize(10000);
        int count = 0;
        while (rs.next()) {
            count++;
        }
        System.out.println(count);

        st.close();
        rs.close();
    }

    /**
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionT t = new ConnectionT();
        Connection connection = t.getConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from DIC_DESC_INDUSTRY");
//        rs.setFetchSize(10000);
        int count = 0;
        while (rs.next()) {
            count++;
        }
        System.out.println(count);

        st.close();
        rs.close();
        ConnectionT.release(connection);

    }

}
