/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

/**
 *
 * @author Jocelyn Tucker
 */
public enum LocationType {
    TOWN(0),
    FORT(1),
    LANDMARK(2),
    RIVER(3),
    TRAIL(4);

    public int index;

    LocationType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "LocationType{" + "index=" + index + '}';
    }

}
