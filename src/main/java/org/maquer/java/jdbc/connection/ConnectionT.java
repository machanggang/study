package org.maquer.java.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ConnectionT {

    public static final String PARAM_NAME_JDBC_DRIVER = "jdbc.driver";

    public static final String PARAM_NAME_JDBC_URL = "jdbc.url";

    public static final String PARAM_NAME_JDBC_USERNAME = "jdbc.username";

    public static final String PARAM_NAME_JDBC_PASSWORD = "jdbc.password";

    protected Map<String, String> getJdbcProperties() {
        Map<String, String> map = new HashMap<String, String>();
        map.put(PARAM_NAME_JDBC_DRIVER, "oracle.jdbc.driver.OracleDriver");
        map.put(PARAM_NAME_JDBC_URL, "jdbc:oracle:thin:@10.1.8.134:1521:orcl");
        map.put(PARAM_NAME_JDBC_USERNAME, "etps");
        map.put(PARAM_NAME_JDBC_PASSWORD, "xdrcft56");
        return map;
    }

    public final Connection getConnection() throws SQLException, ClassNotFoundException {
        Map<String, String> prop = this.getJdbcProperties();

        String driver = prop.get(PARAM_NAME_JDBC_DRIVER);
        Class.forName(driver);

        String url = prop.get(PARAM_NAME_JDBC_URL);
        String username = prop.get(PARAM_NAME_JDBC_USERNAME);
        String password = prop.get(PARAM_NAME_JDBC_PASSWORD);
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.setAutoCommit(false);

        return connection;
    }

    public static void release(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
            conn = null;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionT t = new ConnectionT();
        Connection connection = t.getConnection();
        ConnectionT.release(connection);
    }

}
