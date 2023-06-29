package homework02;

/*
    Дана строка sql-запроса "select * from students where ".
    Сформируйте часть WHERE этого запроса, используя StringBuilder.
    Данные для фильтрации приведены ниже в виде json-строки.
    Если значение null, то параметр не должен попадать в запрос.
    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class SQLQueryBuilder {

    public static void main() {
        // ковычки в ковычках можно использовать через обратный сшел \"
        String filterData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String whereStr = buildWhereQuery(filterData);
        System.out.println(whereStr);
    }

    static String buildWhereQuery(String filterData) {
        StringBuilder whereStr = new StringBuilder();

        // Удаление фигурных скобок из JSON-строки
        String cleanFilterData = filterData.replace("{", "").replace("}", "");

        // разбиваем на строки  ключ-значение
        String[] listValues = cleanFilterData.split(", ");

        boolean flag = true;

        for (String item : listValues) {
            // разбиваем кажду строку
            String[] keyValue = item.split(":");
            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"", "");

            // если в значениии НЕ будет нул, то будем добалять в запрос еще данные
            if (!value.equals("null")) {
                if (!flag) {
                    whereStr.append(" AND ");
                }

                whereStr.append(key).append(" = '").append(value).append("'");

                flag = false;
            }
        }

        return whereStr.toString();
    }
}
