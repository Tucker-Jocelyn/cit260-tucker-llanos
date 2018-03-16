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
public enum Places {

    NAUVOO("Nauvoo"),
    MISSISSIPPI_RIVER("Mississippi River"),
    CHARITON_RIVER("Chariton River"),
    GARDEN_GROVE("Garden Grove"),
    MOUNT_PISGAH("Mount Pisgah"),
    NISHNABOTNA_RIVER("Nishnabotna River"),
    KANESVILLE("Kanesville"),
    WINTER_QUARTERS("Winter Quarters"),
    PLATTE_RIVER("Platte River"),
    FORT_KEARNEY("Fort Kearney"),
    CHIMNEY_ROCK("Chimney Rock"),
    FORT_LARAMIE("Fort Laramie"),
    UPPER_PLATTE_RIVER("Upper Platte River"),
    SWEETWATER_RIVER("Sweetwater River"),
    INDEPENDENCE_ROCK("Independence Rock"),
    MARTINS_COVE("Martin's Cove"),
    GREEN_RIVER("Green River"),
    FORT_BRIDGER("Fort Bridger"),
    BEAR_RIVER("Bear River"),
    SALT_LAKE_VALLEY("Salt Lake Valley");

    //class instance variables
    public final String name;

    Places(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Places{" + "name=" + name + '}';
    }

}
