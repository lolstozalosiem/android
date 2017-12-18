package com.example.domin.android;

/**
 * Created by student on 2017-12-18.
 */

public class Place {

        String placeName;
        Integer temperature;
        String information;

   public Place(String placeName,String information)
   {
        this.placeName = placeName;
        this.information = information;
   }

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
