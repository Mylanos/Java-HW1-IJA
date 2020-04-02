package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Coordinate;
import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Street;

import java.util.ArrayList;
import java.util.List;

public class MyStreet implements Street {
    private String streetID;
    private List<Coordinate> coordinates;
    private List<Stop> stops;


    public MyStreet(String streetID, Coordinate coordinateStart, Coordinate coordinateEnd) {
        this.streetID = streetID;
        this.coordinates = new ArrayList<>();
        this.coordinates.add(coordinateStart);
        this.coordinates.add(coordinateEnd);
        this.stops = new ArrayList<>();
    }

    @Override
    public String getId() {
        return streetID;
    }

    @Override
    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    @Override
    public List<Stop> getStops() {
        return stops;
    }

    @Override
    public void addStop(Stop stop) {
        stops.add(stop);
        stop.setStreet(this);
    }
}