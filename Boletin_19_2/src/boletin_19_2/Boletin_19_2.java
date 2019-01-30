/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19_2;

/**
 *
 * @author Gabriel P. <gpietrafesavieitez@danielcastelao.org>
 */
public class Boletin_19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notas[] = new int[]{5,7,9,6,3,1,8,2,5,9};
        int c_aprobados, c_suspensos, c_alta, c_media = 0;
        c_aprobados = c_suspensos = c_alta = 0; //  Seteo contadores a 0 
        for(int i = 0; i < notas.length; i ++){ //  Cursor recorre array
            if(notas[i] >= 5){ //   Si la nota es un aprobado
                c_aprobados ++;
            }else{ //   Si la nota no es un aprobado
                c_suspensos ++;
            }
            if(notas[i] > c_alta){ //   Si la nota actual es > que la ultima mas alta
                c_alta = notas[i]; //   La recojo como la mas alta hasta que no haya una superior
            }
            c_media += notas[i];
        }
        //  Output
        System.out.println("-\tNº de Aprobados: " + c_aprobados);
        System.out.println("-\tNº de Suspensos: " + c_suspensos);
        System.out.println("-\tNota media de la clase: " + c_media/notas.length);
        System.out.println("-\tNota más alta: " + c_alta);
    }
}
