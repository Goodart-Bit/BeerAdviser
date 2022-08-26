package com.example.beeradvice;

import android.icu.text.RelativeDateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerExpert {
    private Map<String,ArrayList<String>> recommendations = new HashMap<>();

    public BeerExpert(){
        recommendations.put("light",new ArrayList<String>(Arrays.asList("Jail Pale Ale","Corona Light","Gout Stout")));
        recommendations.put("amber",new ArrayList<String>(Arrays.asList("Rogue","Abita","Red Moose")));
        recommendations.put("brown",new ArrayList<String>(Arrays.asList("Newcastle Brown Ale","Cigar City Brewing")));
        recommendations.put("dark",new ArrayList<String>(Arrays.asList("Dunkel","Extra Stout")));
    }

    public String getBrands(String beer_color){
        ArrayList<String> desired_beers = recommendations.get(beer_color);
        String beers = "";
        for (int counter = 0; counter < desired_beers.size(); counter++){
            beers += desired_beers.get(counter);
            if(counter < desired_beers.size() - 1){
                beers += "\n";
            }
        }
        return beers;
    }
}
