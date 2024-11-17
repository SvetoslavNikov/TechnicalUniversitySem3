package javaLU.VarArgs;

import java.util.*;
import java.util.stream.Collectors;

public class SQLQueryBuilder {

    String tableName;
    int[] stock;

    public SQLQueryBuilder(String tableName, int... stock){
        this.tableName = tableName;
        this.stock = stock;
    }

    public static String buildQuery(String tableName, String... conditions) {
        String sql = "SELECT * FROM " + tableName;
        if (conditions.length > 0) {
            sql += " WHERE ";
            Iterator<String> condition = Arrays.stream(conditions).iterator();
            while (true) {
                sql += condition.next();
                if (condition.hasNext()) {
                    sql += " AND ";
                } else {
                    sql += ";";
                    break;
                }

            }
        } else {
            sql += ";";
        }
        return sql;
    }

    public static void main(String[] args) {
        String condition1 = "id = 1";
        String condition2 = "stock = 10";
        System.out.println(SQLQueryBuilder.buildQuery("Items", condition2,condition1));
        System.out.println(SQLQueryBuilder.buildQuery("Books"));

        SQLQueryBuilder newQuery = new SQLQueryBuilder("Items", 5,4,5,6,7,9);
        int[] arr = newQuery.stock;
        System.out.println(arr.length);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }
}

