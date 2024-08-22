package com.weatherapp.freeweather.free.app.mobile.androidapp.weatherandroid;

import java.util.HashMap;
import java.util.Map;

public class WeatherTranslation {
    private static final Map<String, String> weatherTranslations = new HashMap<>();

    static {
        // Initialize weather descriptions translations
        weatherTranslations.put("clear sky", "Ясно");
        weatherTranslations.put("few clouds", "Малооблачно");
        weatherTranslations.put("scattered clouds", "Переменная облачность");
        weatherTranslations.put("broken clouds", "Облачность");
        weatherTranslations.put("shower rain", "Ливень");
        weatherTranslations.put("rain", "Дождь");
        weatherTranslations.put("thunderstorm", "Гроза");
        weatherTranslations.put("snow", "Снег");
        weatherTranslations.put("mist", "Туман");
        weatherTranslations.put("overcast clouds", "Пасмурно");
    }

    public static String getRussianTranslation(String description) {
        return weatherTranslations.getOrDefault(description, description);
    }
}

