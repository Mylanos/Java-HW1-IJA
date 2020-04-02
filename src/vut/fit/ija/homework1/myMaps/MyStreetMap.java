package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Street;
import vut.fit.ija.homework1.maps.StreetMap;

import java.util.ArrayList;
import java.util.List;

public class MyStreetMap implements StreetMap {
    private List<Street> streets;

    public MyStreetMap() {
        this.streets = new ArrayList<Street>();
    }

    @Override
    public void addStreet(Street street) {
        this.streets.add(street);
    }

    @Override
    public Street getStreet(String id) {
        for (int i = 0; i < streets.size(); i++) {
            Street streetItem = streets.get(i);
            if (streetItem.getId() == id) {
                return streetItem;
            }
        }
        return null;
    }
}