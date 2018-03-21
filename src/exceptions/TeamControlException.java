/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author KIm Tanton
 */
public class TeamControlException extends Exception{

    public TeamControlException() {
    }

    public TeamControlException(String message) {
        super(message);
    }

    public TeamControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamControlException(Throwable cause) {
        super(cause);
    }

    public TeamControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
