package com.giko.covid19.service;

import com.giko.covid19.model.Location;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class Covid19DataService {

    private static String DATA_URL= "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";

    private List<Location> locationData = new ArrayList<>();

    public List<Location> getLocations() {
        return locationData;
    }

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchData() throws IOException, InterruptedException {
        List<Location> newData = new ArrayList<>();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(DATA_URL)).build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


    }
}
