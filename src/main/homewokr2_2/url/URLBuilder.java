package main.homewokr2_2.url;

public class URLBuilder {

    public static String buildURL(String baseURL, String params) {

        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");

//        for (String pair : pairs) {
//            System.out.println(pair);
//        }

        boolean firstParam = true; // flag to determent whether we add "?" or "&"

        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if(keyValue.length == 2) {
                String key = keyValue[0];
//                System.out.println(key);
                String value = keyValue[1];
//                System.out.println(value);

                if(!value.equals("null")) { // ignore null values
                    if(firstParam) {
                        url.append(key).append("=").append(value);
                        firstParam = false; // the next parameter will be added the "&"
                    } else {
                        url.append("&").append(key).append("=").append(value);
                    }
                }
            }
        }
        return url.toString();
    }
}
