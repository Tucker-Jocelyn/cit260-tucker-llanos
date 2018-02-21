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
public enum LandmarkType {
    
    Nauvoo ("Nauvoo"),
    ChimmneyRock ("Chimney Rock"),
    IndependenceRock ("Independence Rock"),
    MartinsCove ("Martin's Cove"),
    SaltLakeValley ("Salt Lake Valley");
    
    //class instance variables
    private String landmarkName;

    LandmarkType(String landmarkName) {
        this.landmarkName = landmarkName;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    @Override
    public String toString() {
        return "LandmarkType{" + "landmarkName=" + landmarkName + '}';
    }
   
    
}
