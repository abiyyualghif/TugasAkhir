/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MY PC
 */
public class koneksi {

    public Statement state;
    public Connection connect;
    public String namaDatabase = "jdbc:mysql://localhost/db_tugas";

    public void koneksiDatabase() {
        try {
            connect = DriverManager.getConnection(namaDatabase, "pma", "");
            state = connect.createStatement();

        } catch (SQLException e) {
            System.err.println("" + e);
        }
    }

}
