import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.speech.freetts.*;

public class GeminiChatWithVoice {

    private static final String API_KEY = "AIzaSyAbICWedBMsn2_FKeELZcBw7rFHzeDHx6g";
    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + API_KEY;
    private static final String VOICE_NAME = "kevin16";  // default FreeTTS voice

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask a question (type 'exit' to quit):");

        while (true) {
            System.out.print("You: ");
            String question = scanner.nextLine();
            if (question.equalsIgnoreCase("exit")) break;

            String response = askGemini(question);
            System.out.println("Gemini: " + response);

            // Speak the response
            speak(response);
        }

        scanner.close();
    }

    private static String askGemini(String question) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            JSONObject content = new JSONObject();
            content.put("parts", new JSONArray().put(new JSONObject().put("text", question)));

            JSONObject requestBody = new JSONObject();
            requestBody.put("contents", new JSONArray().put(content));

            OutputStream os = conn.getOutputStream();
            os.write(requestBody.toString().getBytes(StandardCharsets.UTF_8));
            os.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder responseStr = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                responseStr.append(inputLine);
            }
            in.close();

            JSONObject responseJson = new JSONObject(responseStr.toString());
            JSONArray candidates = responseJson.getJSONArray("candidates");
            JSONObject firstCandidate = candidates.getJSONObject(0);
            JSONObject firstPart = firstCandidate.getJSONObject("content").getJSONArray("parts").getJSONObject(0);
            return firstPart.getString("text");

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    private static void speak(String text) {
        VoiceManager vm = VoiceManager.getInstance();
        Voice voice = vm.getVoice(VOICE_NAME);
        if (voice != null) {
            voice.allocate();
            voice.speak(text);
            voice.deallocate();
        } else {
            System.out.println("Voice not found!");
        }
    }
}
