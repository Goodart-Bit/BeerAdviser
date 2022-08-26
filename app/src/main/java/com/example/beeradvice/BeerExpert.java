package com.example.beeradvice;

import android.icu.text.RelativeDateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerExpert {
    private Map<String,String[]> recommendations = new HashMap<>();

    public BeerExpert(){
        recommendations.put("light",new String[]{ "Jail Pale Ale","Corona Light","Gout Stout" });
        recommendations.put("amber",new String[]{"Rogue","Abita","Red Moose"});
        recommendations.put("brown",new String[]{"Newcastle Brown Ale","Cigar City Brewing"});
        recommendations.put("dark",new String[]{"Dunkel","Extra Stout"});
    }

    public String getBrands(String beer_color){
        String[] desired_beers = recommendations.get(beer_color);
        String beers = "";
        for (int counter = 0; counter < desired_beers.length; counter++){
            beers += desired_beers[counter];
            if(counter < desired_beers.length - 1){
                beers += "\n";
            }
        }
        return beers;
    }
}
