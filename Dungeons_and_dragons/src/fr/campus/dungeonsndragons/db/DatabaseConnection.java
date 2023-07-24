package fr.campus.dungeonsndragons.db;
import fr.campus.dungeonsndragons.players.Hero;

import java.sql.*;

public class DatabaseConnection {

    private final String DB_URL = "jdbc:mysql://localhost:3306/D_and_D";
    private final String USER = "ezra";
    private final String PASS = "password";
    private Hero hero;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public void main(String[] args) {
//        try {
//            Connection connection = getConnection();
//
//            Statement statement = connection.createStatement();
//
//            //SAMPLE QUERY
//            String query = "SELECT * FROM Hero";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String type = resultSet.getString("type");
//                int lifepoints = resultSet.getInt("lifepoints");
//                int attackpower = resultSet.getInt("attackpower");
//
//                System.out.println("ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Type: " + type);
//                System.out.println("Lifepoints: " + lifepoints);
//                System.out.println("Attack Power: " + attackpower);
//                System.out.println("------------------------");
//            }
//
//            //Close resources
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void getHeroes() {
        try {
            Connection connection = getConnection();

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Hero";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int lifepoints = resultSet.getInt("lifepoints");
                int attackpower = resultSet.getInt("attackpower");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Type: " + type);
                System.out.println("Lifepoints: " + lifepoints);
                System.out.println("Attack Power: " + attackpower);
                System.out.println("------------------------");
            }

            //Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void insertHero(Hero newhero) {
        try {
            Connection connection = getConnection();

            String insertQuery = "INSERT INTO Hero (name, type, lifepoints, attackpower) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, newhero.getName());
            preparedStatement.setString(2, newhero.getType());
            preparedStatement.setInt(3, newhero.getLifePoints());
            preparedStatement.setInt(4, newhero.getAttackPower());

            //TODO:
            //this en parametre
            //mettre les get

            int rowsAffected = preparedStatement.executeUpdate();

            //To delete after verifying it works:
            if (rowsAffected > 0) {
                System.out.println("New Hero added successfully to the database!");
            } else {
                System.out.println("Failed to add a new Hero.");
            }

            //Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void changeLifePoints(String name, int newLifePoints) {
        try {
            Connection connection = getConnection();

            String updateQuery = "UPDATE Hero SET lifepoints = ? WHERE name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setInt(1, newLifePoints);
            preparedStatement.setString(2, name);

            int rowsAffected = preparedStatement.executeUpdate();

            // to delete if no errors:
            if (rowsAffected > 0) {
                System.out.println("Life points updated successfully for Hero: " + name);
            } else {
                System.out.println("No Hero found with the name: " + name);
            }

            //Close resources
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
