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

    NAUVOO("Nauvoo", "N|"),
    MISSISSIPPI_RIVER("Mississippi River", "|MR|"),
    CHARITON_RIVER("Chariton River", "|CR|"),
    GARDEN_GROVE("Garden Grove", "|GG|"),
    MOUNT_PISGAH("Mount Pisgah", "|MP|"),
    NISHNABOTNA_RIVER("Nishnabotna River", "|NR|"),
    KANESVILLE("Kanesville", "K|"),
    WINTER_QUARTERS("Winter Quarters", "|WQ|"),
    PLATTE_RIVER("Platte River", "|PR|"),
    FORT_KEARNEY("Fort Kearney", "|FK|"),
    CHIMNEY_ROCK("Chimney Rock", "|CHR|"),
    FORT_LARAMIE("Fort Laramie", "|FL|"),
    UPPER_PLATTE_RIVER("Upper Platte River", "|UPR|"),
    SWEETWATER_RIVER("Sweetwater River", "SR|"),
    INDEPENDENCE_ROCK("Independence Rock", "|IR|"),
    MARTINS_COVE("Martin's Cove", "|MC|"),
    GREEN_RIVER("Green River", "|GR|"),
    FORT_BRIDGER("Fort Bridger", "|FB|"),
    BEAR_RIVER("Bear River", "|BR|"),
    SALT_LAKE_VALLEY("Salt Lake Valley", "|SLV|");

    //class instance variables
    public final String name;
    public final String mapSymbol;

    Places(String name, String mapSymbol) {
        this.name = name;
        this.mapSymbol = mapSymbol;
    }

    @Override
    public String toString() {
        return "Places{" + "name=" + name + '}';
    }

}
