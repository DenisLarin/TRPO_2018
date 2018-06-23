package laba;

import java.sql.*;
import java.util.ResourceBundle;

public class Dao {
    private String serverUnswer;
    private String JDBSDRIVER;
    private String connectionINFO;
    private String sqlUser;
    private String sqlPassword;

    public Dao() {
        /*jdbc.driver=com.mysql.jdbc.Driver
        jdbc.url=jdbc:mysql://localhost:8889/java_lb3?useUnicode=true&characterEncoding=UTF8
        jdbc.user=root
        jdbc.password=root*/
        ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
        JDBSDRIVER = resourceBundle.getString("jdbc.driver");
        try {
            Class.forName(JDBSDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        connectionINFO = resourceBundle.getString("jdbc.url");
        sqlUser = resourceBundle.getString("jdbc.user");
        sqlPassword = resourceBundle.getString("jdbc.password");
        serverUnswer = "";
    }

    public void adduser(User user) {
        try (Connection connection = DriverManager.getConnection(connectionINFO, sqlUser, sqlPassword);) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT into users (name,surname,phone) values (?,?,?)");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.executeUpdate();
            System.out.println("user is added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showAllUsers() {
        try (Connection connection = DriverManager.getConnection(connectionINFO, sqlUser, sqlPassword);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * from users");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String phone = resultSet.getString("phone");
                serverUnswer = serverUnswer + "<tr><td>";
                serverUnswer += id + "</td><td>" + name + "</td><td>" + surname + "</td><td>" + phone + "</td></tr>";

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(User user) {
        try (Connection connection = DriverManager.getConnection(connectionINFO, sqlUser, sqlPassword);) {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE from users where phone=?");
            preparedStatement.setString(1, user.getPhone());
            preparedStatement.executeUpdate();
            System.out.println("users deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editUser(User user, User editedUser) {
        try (Connection connection = DriverManager.getConnection(connectionINFO, sqlUser, sqlPassword);) {
            String id = user.getId();
            String name = user.getName();
            String surname = user.getSurname();
            String phone = user.getPhone();
            String phoneUS = editedUser.getPhone();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `users` SET `name`=?,`surname`=?,`phone`=? WHERE phone = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, phoneUS);
            preparedStatement.executeUpdate();
            System.out.println("user updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUser(User user) {
        User retUser = null;
        try (Connection connection = DriverManager.getConnection(connectionINFO, sqlUser, sqlPassword);) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * from users where phone=?");
            preparedStatement.setString(1, user.getPhone());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                retUser = new User();
                System.out.println("new User");
                retUser.setId(resultSet.getString("id"));
                retUser.setName(resultSet.getString("name"));
                retUser.setSurname(resultSet.getString("surname"));
                retUser.setPhone(resultSet.getString("phone"));
                System.out.println("new User: " + user.toString());
            } else {
                return retUser;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retUser;
    }

    public String getServerUnswer() {
        return serverUnswer;
    }
}
