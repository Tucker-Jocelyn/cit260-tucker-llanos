/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Kim Llanos
 */
public class Random {
    public static int range(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max +1);
    }
}
