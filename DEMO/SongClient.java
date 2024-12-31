import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SongClient {
    public static void main(String[] args) {
        String url = "https://itunes.apple.com/search?term=arijit+singh&limit=25";
        String data = """
                {"wrapperType":"track", "kind":"song", "artistId":484568188, "collectionId":1193069171, "trackId":1193069234, "artistName":"Arijit Singh & Samira Koppikar", "collectionName":"Best of Arijit Singh", "trackName":"Aaj Phir (From \"Hate Story 2\")", "collectionCensoredName":"Best of Arijit Singh", "trackCensoredName":"Aaj Phir (From \"Hate Story 2\")"
                """;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).GET().build();
        try {
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
