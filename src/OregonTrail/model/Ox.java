package OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author Jocelyn Tucker
 */
public class Ox implements Serializable {

    //class instance variables
    private double pullWeight;
    private int oxHealth;
    private boolean oxRest;
    private int amount;

    public Ox() {
        this.pullWeight = 550;
        this.oxHealth = 100;
        this.amount = 0;
    }

    public double getPullWeight() {
        return pullWeight;
    }

    public void setPullWeight(double pullWeight) {
        this.pullWeight = pullWeight;
    }

    public int getOxHealth() {
        return oxHealth;
    }

    public void setOxHealth(int oxHealth) {
        this.oxHealth = oxHealth;
    }

    public boolean isOxRest() {
        return oxRest;
    }

    public void setOxRest(boolean oxRest) {
        this.oxRest = oxRest;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.pullWeight) ^ (Double.doubleToLongBits(this.pullWeight) >>> 32));
        hash = 59 * hash + this.oxHealth;
        hash = 59 * hash + (this.oxRest ? 1 : 0);
        hash = 59 * hash + this.amount;
        return hash;
    }

    @Override
    public String toString() {
        return "Ox{" + "pullWeight=" + pullWeight + ", oxHealth=" + oxHealth + ", oxRest=" + oxRest + ", amount=" + amount + '}';
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
        final Ox other = (Ox) obj;
        if (Double.doubleToLongBits(this.pullWeight) != Double.doubleToLongBits(other.pullWeight)) {
            return false;
        }
        if (this.oxHealth != other.oxHealth) {
            return false;
        }
        if (this.oxRest != other.oxRest) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

}
