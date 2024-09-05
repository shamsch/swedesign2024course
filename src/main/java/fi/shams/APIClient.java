package fi.shams;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class APIClient {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos/1";
    private final OkHttpClient client = new OkHttpClient();

    public Todo fetchTodo(){
        String jsonResponse = getRequestFromAPI();
        Gson gson = new Gson();
        return gson.fromJson(jsonResponse, Todo.class);
    }

    private String getRequestFromAPI(){
        Request request = new Request.Builder()
                .url(APIClient.API_URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if(response.body() == null){
                throw new Exception("Response body is null");
            }
            return response.body().string();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }
}
