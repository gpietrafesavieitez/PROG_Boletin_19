package boletin_19_4;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel P. <gpietrafesavieitez@danielcastelao.org>
 */

public class Boletin_19_4 {
    
    public static char calcularLetraNif(int numeroNif){
        char[] listaLetrasNif = new char[]{
            'T',
            'R',
            'I',
            'A',
            'G',
            'M',
            'Y',
            'F',
            'P',
            'D',
            'X',
            'B',
            'N',
            'J',
            'Z',
            'S',
            'Q',
            'V',
            'H',
            'L',
            'C',
            'K',
            'E'};
        return listaLetrasNif[numeroNif % 23]; 
    }
    
    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null,"Letra correspondiente: '" + calcularLetraNif(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el número de su DNI: ","Calculadora DNI",3))) + "'","Calculadora DNI",1);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El formato introducido no es el correcto.","Formato incorrecto",2);
        }
    } 
}
