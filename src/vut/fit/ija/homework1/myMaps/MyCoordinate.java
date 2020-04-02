package vut.fit.ija.homework1.myMaps;

import vut.fit.ija.homework1.maps.Coordinate;

public class MyCoordinate implements Coordinate {
    private int x;
    private int y;

    private MyCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinate create(int x, int y) {
        if (x < 0 || y < 0) {
            return null;
        }
        return new MyCoordinate(x, y);
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        return ((Coordinate) obj).getX() == this.getX() && ((Coordinate) obj).getY() == this.getY();
    }
}
