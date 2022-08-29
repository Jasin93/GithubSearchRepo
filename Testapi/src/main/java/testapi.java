import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class testapi {



        public static void main(String[] args)
    {
        RestTemplate restTemplate = new RestTemplate();
       // String url = "https://api.github.com/jasin93/repos";
        String url = "https://catfact.ninja/fact";

        ResponseEntity<String> response
                = restTemplate.getForEntity(url, String.class);

        System.out.println(response.getBody());
    }

        /*



    public static void main(String[] args) {

        try {

            URL url = new URL("https://api.github.com/jasin93/repos");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();


            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                System.out.println(informationString);


                JSONParser parse = new JSONParser();
                JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(informationString));

                System.out.println(dataObject.get(0));

                JSONObject countryData = (JSONObject) dataObject.get(0);

                System.out.println(countryData.get("wtf"));

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
         */

}