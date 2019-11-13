/*Realiza un programa que cuente el numero de veces que aparece cada ´
una de las letras de un texto introducido por el teclado y a continuacion´
visualice el resultado.*/
package tema4ejercicio6;
import javax.swing.JOptionPane;

public class Tema4ejercicio6 {
    
   
    public static String main(String[] args) {
        String texto ="";
        try{
            texto = JOptionPane.showInputDialog("introduce una frase"); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
             return texto;
        }
      public static String comparacion(String mensaje){
        int cont = 0;    
        for(int x = 0; x < texto.length(); x++){
            
        }
        
    

