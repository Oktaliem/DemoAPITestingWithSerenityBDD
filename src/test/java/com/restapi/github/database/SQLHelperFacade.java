package com.restapi.github.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Okta Liem
 */

public class SQLHelperFacade {
    public static Connection getConnection(SQLType type) throws SQLException, ClassNotFoundException {
        switch (type) {
            case ORACLE:
                return OracleSQLHelper.getOracleDatabaseConnection();
        }
        return null;
    }

    public static void closeConnection(SQLType type) throws Exception {
        switch (type) {
            case ORACLE:
                OracleSQLHelper.closeConnection();
        }
    }

}
