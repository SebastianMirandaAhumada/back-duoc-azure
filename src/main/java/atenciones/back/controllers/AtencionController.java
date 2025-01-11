package atenciones.back.controllers;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@RestController
@CrossOrigin
public class AtencionController {
    
    @GetMapping("/mensaje")
    public String listaUsuarios(){
        System.out.println("backend llamando");
        return"{\"mensaje\":\"Integracion backend\"}";
    }

    @Autowired
    private DataSource dataSource;
    
    @GetMapping("/testConnection")
    public String testConnection() {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT 'Connection Successful' AS message FROM dual")) {

            if (resultSet.next()) {
                return resultSet.getString("message");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Connection Failed: " + e.getMessage();
        }
        return "No result";
    }
}
