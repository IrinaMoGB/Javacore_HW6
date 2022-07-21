import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import okhttp3.WebSocket;
import okhttp3.Call.Factory;
import java.util.Scanner;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeatherForecast {
    public static void main(String[] args) throws IOException{
        String lat = "56.5111";
        String lon = "53.1244";
        String limit = "5";

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url ("https://api.weather.yandex.ru/v2/forecast?" + lat + "&" + lon +  "&" + limit)
                .get()
                .addHeader("X-Yandex-API-Key", "18e10100-2e66-43a9-af2f-767de6fb98d9")
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();
        System.out.println(body);

    }


//   "https://api.weather.yandex.ru/v2/forecast?lat=56.5111&lon=53.1244&extra=true&lang=ru_RU\",false,$context");
//        Request.get https://api.weather.yandex.ru/v2/forecast?lat=56.5111&lon=53.1244&extra=true
//        Request request = new Request.Builder()
//                .url("http://api.weather.yandex.ru/v2/forecast")
//        GET https://api.weather.yandex.ru/v2/forecast?lat=56.5111&lon=53.1244&extra=true
//        HTTP/1.0\r\nX-Yandex-API-Key:18e10100-2e66-43a9-af2f-767de6fb98d9
//        X-Yandex-API-Key: 18e10100-2e66-43a9-af2f-767de6fb98d9
}
