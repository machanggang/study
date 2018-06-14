package org.maquer.java.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.maquer.java.jdbc.statement.StatementT;

public class ConnectionTXY extends ConnectionT{

    protected Map<String, String> getJdbcProperties() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(PARAM_NAME_JDBC_DRIVER, "com.mysql.jdbc.Driver");
        map.put(PARAM_NAME_JDBC_URL, "jdbc:mysql://118.25.26.118:3306/test");
        map.put(PARAM_NAME_JDBC_USERNAME, "root");
        map.put(PARAM_NAME_JDBC_PASSWORD, "root");
        return map;
    }
    /**
     * @param args
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionT t = new ConnectionTXY();
        Connection conn = t.getConnection();
        StatementT.testConn(conn);
        ConnectionT.release(conn);

    }

}
