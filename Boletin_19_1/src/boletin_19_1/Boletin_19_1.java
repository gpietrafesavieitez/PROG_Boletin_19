/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19_1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author gpietrafesavieitez
 */
public class Boletin_19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[6], reves[] = new int[numeros.length];
        Random rand = new Random();
        for(int i = 0; i < numeros.length; i ++){
            numeros[i] = rand.nextInt(51);
        }
        System.out.println(Arrays.toString(numeros));
        for(int i = 0; i < numeros.length; i ++){
            reves[i] = numeros[5-i];
        }
        System.out.println(Arrays.toString(reves));
    }
}
