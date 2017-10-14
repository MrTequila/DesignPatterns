package com.mrTequila.Structural.Facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        //get MySql DB connection
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection connection) {
        // get data from table and generate PDF
    }

    public void generateMySqlHTMLReport(String tableName, Connection connection) {
        // get data from table and generate HTML report
    }
}
