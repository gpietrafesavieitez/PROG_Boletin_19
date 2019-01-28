package boletin_19_3;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel P. <gpietrafesavieitez@danielcastelao.org>
 */

public class Boletin_19_3 {
    
    private static final int ARRAYSIZE = 10;
    
    private static String[] listaNombresAlumnos = new String[]{
            "Pedro",
            "Maria",
            "Pablo",
            "Ana",
            "Brais",
            "Elena",
            "Carolina",
            "Carla",
            "Esteban",
            "Carolina"};
    
    private static double[] listaNotasAlumnos = new double[]{
            5,
            7.32,
            2.99,
            2,
            0,
            1,
            4.99,
            2.50,
            3,
            4};
    
    public static String buscarNotaAlumno(String nomeAlumno){
        for(int i = 0; i < ARRAYSIZE; i ++){ //  Cursor que recorrer el array listaNombresAlumnos en busca del nombre a buscar
            if(listaNombresAlumnos[i].equals(nomeAlumno)){         //  Si el nombre existe guarda la posicion para usarla en el otro array listaNotasAlumnos y devuelve la nota
                return "Alumno encontrado:\n- Nombre: "+ nomeAlumno + "\n- Nota: " + listaNotasAlumnos[i] + " ptos.";
            } 
        }
        return "Alumno no encontrado.";
    }
    
    public static String mostrarListaAprobados(){
        String[] listaAlumnosAprobados = new String[ARRAYSIZE];
        int contadorDeAprobados = 0;
        for(int i = 0; i < ARRAYSIZE; i ++){ // Con un cursor recorro el array listaNotasAlumnos en busca de los aprobados (> o = 5) los cuales se guardaran en otro array de aprobados
            if(listaNotasAlumnos[i] >= 5){
                contadorDeAprobados++;
                listaAlumnosAprobados[i] = listaNombresAlumnos[i];
            }
        } 
        // Hago uso del objeto StringBuilder para facilitarme trabajo a la hora de construir la cadena de texto de salida para cuando la recoja el JOptionPane
        // Por el momento no he encontrado otra forma salvo que la salida sea mediante consola
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ARRAYSIZE; i ++){
            if(listaAlumnosAprobados[i] != null){ // Filtro solo las posiciones del array donde hay contenido
                sb.append("\n-  " + listaAlumnosAprobados[i]); // Este método simplemente va concatenando texto en cada iteración del for 
            }
        }
        return "Alumnos aprobados: " + contadorDeAprobados + sb.toString();
    }
    
    public static String mostrarListaOrdenada(){
        // Ordeno string
        Arrays.sort(listaNotasAlumnos);
        // Construyo cadena
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ARRAYSIZE; i ++){
            sb.append("\n" + (i+1) + "º - " + listaNotasAlumnos[i] + " ptos.");
        }
        // Devuelvo cadena
        return "Notas en orden creciente:" + sb.toString();
    }

    public static void main(String[] args) {
        try{
            JOptionPane.showMessageDialog(null,buscarNotaAlumno(JOptionPane.showInputDialog(null,"Introduzca nombre del alumno: ","Buscador de notas",3)),"Buscador",1);
            JOptionPane.showMessageDialog(null,mostrarListaAprobados(),"Lista de aprobados",1);
            JOptionPane.showMessageDialog(null,mostrarListaOrdenada(),"Lista ordenada",1);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"El formato introducido no es el correcto.","Formato incorrecto",2);
        }
    }
}