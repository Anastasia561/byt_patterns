package patterns.factory;

public class DatabaseFactory {
    public static IDatabase createDatabase(DatabaseType type) {
        if (type == DatabaseType.ORACLE) {
            return new OracleDatabase();
        } else if (type == DatabaseType.SQL_SERVER) {
            return new SqlServerDatabase();
        } else {
            throw new IllegalArgumentException("Unknown database type: " + type);
        }
    }
}
