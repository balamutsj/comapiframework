import com.google.gson.Gson;

import java.util.Random;

public class ApiUtils {
    public static Object getPropertyFromResponseBody(Class objectClass, String responseBody) {
        Gson gson = new Gson();
        return gson.fromJson(responseBody, objectClass);
    }

    public static String generateRandomAhemEmail(int count) {
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString() + "@ahem.email";
    }

}