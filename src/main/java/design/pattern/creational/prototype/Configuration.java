package design.pattern.creational.prototype;

public interface Configuration {
    String getProperty (String key);

    void setProperty (String key, String value);
}

class DatabaseConfiguration implements Configuration, Cloneable {
    private String connectionURL;

    public DatabaseConfiguration() {
    }

    @Override
    public String getProperty(String key) {
        if (key.equals("database.url")) {
            return connectionURL;
        }
        return null;
    }

    @Override
    public void setProperty(String key, String value) {
        if (key.equals("database.url")) {
            connectionURL = value;
        }
    }

    @Override
    public DatabaseConfiguration clone() {
        DatabaseConfiguration clonedConfig = new DatabaseConfiguration();
        // Copy the connectionURL to the cloned object
        clonedConfig.setProperty("database.url", this.connectionURL);
        return clonedConfig;
    }
}
