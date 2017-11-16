package util;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {

    private static Connection CONEXION = null;

    public static Connection getConnection() {
        if (CONEXION != null) {
            return CONEXION;
        } else {
            URI dbUri;
            try {
                dbUri = new URI(System.getenv("postgres://vhdwcbsfkbwnzs:0727da2ee9746f47a47bf612ec583d67bf967c51e58db74507832a1e9151e1c0@ec2-54-163-255-181.compute-1.amazonaws.com:5432/dauuhlivepiadl"));
                String username = dbUri.getUserInfo().split(":")[0];
                String password = dbUri.getUserInfo().split(":")[1];
                String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

                if (CONEXION == null) {
                    try {
                        CONEXION = DriverManager.getConnection(dbUrl, username, password);
                    } catch (SQLException e) {
                        System.out.println("Connection Failed! Check output console");
                    }

                }
            } catch (URISyntaxException ex) {
                Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
            }

            return CONEXION;

        }

    }
}
