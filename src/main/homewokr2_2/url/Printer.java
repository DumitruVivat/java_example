package main.homewokr2_2.url;

public class Printer {
    public static void main(String[] args) {

        String baseURL = "";
        String params = "";

        if(args.length == 0) {
            baseURL = "https://example.com/search?";
            params = "query=java&sort=asc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }

        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }
}
