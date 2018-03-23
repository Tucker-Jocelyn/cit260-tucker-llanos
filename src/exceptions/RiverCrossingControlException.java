/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jocelyn Tucker
 */
public class RiverCrossingControlException extends Exception {

    public RiverCrossingControlException() {
    }

    public RiverCrossingControlException(String string) {
        super(string);
    }

    public RiverCrossingControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RiverCrossingControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RiverCrossingControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
