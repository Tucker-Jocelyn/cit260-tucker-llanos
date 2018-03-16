/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jocelyn Tucker
 */
public class GeneralStoreScene extends Scene implements Serializable {

    //class instance variables
    private TownScene townScene;
    private FortScene fortScene;
    private Inventory inventory;

    public GeneralStoreScene() {
    }

    public TownScene getTownScene() {
        return townScene;
    }

    public void setTownScene(TownScene townScene) {
        this.townScene = townScene;
    }

    public FortScene getFortScene() {
        return fortScene;
    }

    public void setFortScene(FortScene fortScene) {
        this.fortScene = fortScene;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.townScene);
        hash = 71 * hash + Objects.hashCode(this.fortScene);
        hash = 71 * hash + Objects.hashCode(this.inventory);
        return hash;
    }

    @Override
    public String toString() {
        return "GeneralStoreScene{" + "townScene=" + townScene + ", fortScene=" + fortScene + ", inventory=" + inventory + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GeneralStoreScene other = (GeneralStoreScene) obj;
        if (!Objects.equals(this.townScene, other.townScene)) {
            return false;
        }
        if (!Objects.equals(this.fortScene, other.fortScene)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

}
