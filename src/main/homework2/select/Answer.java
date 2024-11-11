package main.homework2.select;

public class Answer {
    public static StringBuilder select(String QUERY, String PARAMS) {

        String prepare = PARAMS
                .replace("{","")
                .replace("}","")
                .replace("\"","");

        String[] pairs = prepare.split(",");

        StringBuilder result = new StringBuilder();
        result.append(" WHERE ");

        boolean hasCondition = false;

        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length != 2) continue;

            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (value.equals("null")) continue;

            if (hasCondition) {
                result.append(" AND ");
            } else {
                hasCondition = true;
            }

            result.append(key).append(" = '").append(value).append("'");
        }

        if (!hasCondition) result.append("1=1");

        return result;
    }
}
