package design.pattern.creational.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        DatabaseConfiguration databaseConfigurationPrototype = new DatabaseConfiguration();
        databaseConfigurationPrototype.setProperty("database.url","jdbc:mysql://localhost:3306/mydb");
        System.out.println(databaseConfigurationPrototype.getProperty("database.url"));
        DatabaseConfiguration newConfiguration = databaseConfigurationPrototype.clone();
        newConfiguration.setProperty("database.url", "jdbc:mysql://dev-db.example.com:3306/mydb");
        System.out.println(newConfiguration.getProperty("database.url"));
    }
}
