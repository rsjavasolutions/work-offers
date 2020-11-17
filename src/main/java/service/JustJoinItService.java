package service;

import com.google.gson.Gson;
import model.Offer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class JustJoinItService {

    public List<Offer> getAllOffers() {
        InputStreamReader reader = null;
        try {
            URL url = new URL("https://justjoin.it/api/offers");
            reader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Arrays.asList(new Gson().fromJson(reader, Offer[].class));
    }
}
