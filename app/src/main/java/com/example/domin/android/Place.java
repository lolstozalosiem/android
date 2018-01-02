package com.example.domin.android;

/**
 * Created by student on 2017-12-18.
 */

// 4. Utwórz klasę dla modelu Place. Klasa powinna zawierać pola: placeName,
// temperature, information,

public class Place {

        String placeName;
        Integer temperature;
        String information;

   public Place(String placeName,String information)
   {
        this.placeName = placeName;
        this.information = information;
   }

  // 5. Wygeneruj gettery i settery dla klasy Place
     public

        String getPlaceName()
        {
            return placeName;
        }

        Integer gettemperature()
        {
            return temperature;
        }

        String getInformation()
        {
            return information;
        }
}
