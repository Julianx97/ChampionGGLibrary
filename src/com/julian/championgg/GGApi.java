package com.julian.championgg;
/* Coded by Julian, 12/30/2015, 12:03 AM */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.julian.championgg.api.APIException;
import com.julian.championgg.api.Objects.ChampionData;
import com.julian.championgg.api.Objects.ChampionDataDetailed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class GGApi {
    public static void main(String[] args) throws APIException {
        GGApi api = new GGApi("YOUR_KEY_HERE");
        List<ChampionDataDetailed> data = api.getChampionData("annie");

        for (ChampionDataDetailed d : data){
            System.out.println(d.getRole());
            System.out.println(d.getMatchups().get(0).getKey());
            System.out.println(d.getMatchups().get(0).getWinRate());
        }
    }

    public GGApi(String apiKey) {
        this.apiKey = apiKey;
        this.gson = new GsonBuilder().disableHtmlEscaping().create();
        this.prettyGson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }

    private Gson gson;
    private Gson prettyGson;
    private String mainURL = "http://api.champion.gg/";
    private String apiKey = "aaa123";

    public List<ChampionData> getChampionData() throws APIException {
        String u = fixItBitch("champion");
        String str = getUrlSource(u);
        return gson.fromJson(str, new TypeToken<List<ChampionData>>(){}.getType());
    }

    private List<ChampionDataDetailed> getChampionData(String championName) throws APIException {
        String u = fixItBitch("champion/" + championName);
        String str = getUrlSource(u);
        return gson.fromJson(str, new TypeToken<List<ChampionDataDetailed>>(){}.getType());
    }

    private String fixItBitch(String toAdd){
        return mainURL + toAdd + "?api_key=" + apiKey;
    }

    private String getUrlSource(String link) throws APIException {
        HttpURLConnection httpConnection = null;
        try {
            URL url = new URL(link);

            httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.addRequestProperty("User-Agent", "Mozilla/4.0");
            URLConnection connection = url.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setInstanceFollowRedirects(false);

            connection.connect();


            if (connection instanceof HttpURLConnection) {
                int code = httpConnection.getResponseCode();
                if (code != 200) {
                    throw new APIException(code);
                } else {
                    BufferedReader in = new BufferedReader(new InputStreamReader(httpConnection.getInputStream(), "UTF-8"));
                    String inputLine;
                    StringBuilder a = new StringBuilder();
                    while ((inputLine = in.readLine()) != null)
                        a.append(inputLine);
                    in.close();
                    httpConnection.disconnect();
                    return a.toString();
                }
            } else {
                System.err.println("Error - Not an HTTP request");
            }

            httpConnection.disconnect();
        } catch (IOException ex){
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
            ex.printStackTrace();
        }
        return null;
    }
}
