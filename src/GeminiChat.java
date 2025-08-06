import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class GeminiChat {

    private static final String API_KEY = "";  // Replace with your actual API key
    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + API_KEY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ask a question (type 'exit' to quit):");

        while (true) {
            System.out.print("You: ");
            String question = scanner.nextLine();
            if (question.equalsIgnoreCase("exit")) break;

            String response = askGemini(question);
            System.out.println("Gemini: " + response);
        }

        scanner.close();
    }

    private static String askGemini(String question) {
        try {
            // Create HTTP connection
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Build JSON request
            JSONObject content = new JSONObject();
            content.put("parts", new JSONArray().put(new JSONObject().put("text", question)));

            JSONObject requestBody = new JSONObject();
            requestBody.put("contents", new JSONArray().put(content));

            // Send request
            OutputStream os = conn.getOutputStream();
            os.write(requestBody.toString().getBytes(StandardCharsets.UTF_8));
            os.close();

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder responseStr = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                responseStr.append(inputLine);
            }
            in.close();

            // Parse JSON response
            JSONObject responseJson = new JSONObject(responseStr.toString());
            JSONArray candidates = responseJson.getJSONArray("candidates");
            JSONObject firstCandidate = candidates.getJSONObject(0);
            JSONObject firstPart = firstCandidate.getJSONObject("content").getJSONArray("parts").getJSONObject(0);
            return firstPart.getString("text");

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
