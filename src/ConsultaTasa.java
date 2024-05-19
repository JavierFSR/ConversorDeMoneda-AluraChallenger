import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasa {
    public Tasas buscaTasa(String nombreTasa) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3ceae027e5d177224446a155/latest/"+nombreTasa);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), Tasas.class);
    }
}
