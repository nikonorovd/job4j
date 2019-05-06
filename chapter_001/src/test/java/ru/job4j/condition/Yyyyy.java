//package ru.job4j.condition;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.sql.SQLException;
//a
//import com.opencsv.CSVReader;
//
//
//    public class Yyyy {
//        private static final String DB_URL = "jdbc:sqlite:test.db";
//        private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS persons ("
//                + "id INTEGER PRIMARY KEY, "
//                + "name TEXT NOT NULL, "
//                + "age INTEGER NOT NULL)";
//        private static final String INSERT_PERSON_QUERY = "INSERT INTO persons (name, age) VALUES (?, ?)";
//
//
//        public static void main(String[] args) {
//            try (Connection connection = DriverManager.getConnection(DB_URL)) {
//                try (Statement stmt = connection.createStatement()) {
//                    stmt.execute(CREATE_TABLE_QUERY);
//                }
//                catch (SQLException exc) {
//                    exc.printStackTrace();
//                }
//
//                try (CSVReader reader = new CSVReader(new FileReader("test.csv"));
//                     PreparedStatement stmt = connection.prepareStatement(INSERT_PERSON_QUERY)) {
//                    String[] record;
//                    while ((record = reader.readNext()) != null) {
//                        stmt.setString(1, record[0]);
//                        stmt.setInt(2, Integer.valueOf(record[1]));
//                        stmt.executeUpdate();
//                    }
//                }
//                catch(IOException exc) {
//                    exc.printStackTrace();
//                }
//                catch (SQLException exc) {
//                    exc.printStackTrace();
//                }
//            }
//            catch (SQLException exc) {
//                exc.printStackTrace();
//            }
//        }
//    }
//}
