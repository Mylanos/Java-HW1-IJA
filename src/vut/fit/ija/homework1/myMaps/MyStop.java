package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Coordinate;
import vut.fit.ija.homework1.maps.Stop;
import vut.fit.ija.homework1.maps.Street;

public class MyStop implements Stop {
    private String stopID;
    private Coordinate coordinateStop;
    private Street street;

    public MyStop(String stopID, Coordinate coordinateStop) {
        this.stopID = stopID;
        this.coordinateStop = coordinateStop;
    }

    public MyStop(String stopID) {
        this.stopID = stopID;
    }

    @Override
    public String getId() {
        return stopID;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinateStop;
    }

    @Override
    public void setStreet(Street street) {
        this.street = street;
    }

    @Override
    public Street getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        return ((Stop) obj).getId() == this.getId();
    }
}
