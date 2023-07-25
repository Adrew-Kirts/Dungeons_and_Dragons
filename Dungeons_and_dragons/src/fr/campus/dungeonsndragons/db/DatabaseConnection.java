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
                System.out.println("HP: " + lifepoints);
                System.out.println("ATK: " + attackpower);
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

    public void getLastHero() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM Hero ORDER BY id DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int lifepoints = resultSet.getInt("lifepoints");
                int attackpower = resultSet.getInt("attackpower");

//                System.out.println("ID: " + id);
                System.out.println("---------------------");
                System.out.println("Name: " + name);
                System.out.println("Type: " + type);
                System.out.println("HP: " + lifepoints);
                System.out.println("ATK: " + attackpower);
                System.out.println("---------------------");
            } else {
                System.out.println("No heroes found in the database.");
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


    public void setSelectedHero(int id) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            // Find the hero with the specified ID
            String getHeroByIdQuery = "SELECT * FROM Hero WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(getHeroByIdQuery);
            //Set the ID
            preparedStatement.setInt(1, Integer.parseInt(String.valueOf(id)));
            ResultSet heroResult = preparedStatement.executeQuery();

            if (heroResult.next()) {
                // Get the hero details from the result set
                int lifePoints = heroResult.getInt("lifepoints");
                int attackPower = heroResult.getInt("attackpower");
                String type = heroResult.getString("type");
                String name = heroResult.getString("name");

                // Set the values to the hero object
                hero.setLifePoints(lifePoints);
                hero.setAttackPower(attackPower);
                hero.setType(type);
                hero.setName(name);

                System.out.println("Hero with ID " + id + " selected and properties set successfully.");
            } else {
                System.out.println("No hero found with the ID: " + id);
            }

            heroResult.close();
            preparedStatement.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setCurrentHeroHP(Hero newhero) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            //Find the ID of the last/current hero created
            String getLastHeroIdQuery = "SELECT id FROM Hero ORDER BY id DESC LIMIT 1";
            ResultSet lastHeroIdResult = statement.executeQuery(getLastHeroIdQuery);

            if (lastHeroIdResult.next()) {
                int lastHeroId = lastHeroIdResult.getInt("id");

                //Set HP for current hero
                String updateQuery = "UPDATE Hero SET lifepoints = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

                preparedStatement.setInt(1, newhero.getLifePoints());
                preparedStatement.setInt(2, lastHeroId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Life points updated successfully for the last created Hero with ID: " + lastHeroId);
                } else {
                    System.out.println("No Hero found with the ID: " + lastHeroId);
                }

                preparedStatement.close();
            } else {
                System.out.println("No heroes found in the database.");
            }

            lastHeroIdResult.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
