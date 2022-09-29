package JOB6;

/**
 *
 * @M.FIKRY
 */

import javax.swing.JOptionPane;

public class Tugas2b {
    public static void main(String[]args){
        String angka = "";
        angka = JOptionPane.showInputDialog("Silakan masukkan angka ");
        int b = Integer.valueOf(angka).intValue();
   
        String hasil="";
        switch(b){
            case 1:
                hasil+= "Valid Number"; 
                break;
            case 2:
                hasil+= "Valid Number"; 
                break;
            case 3:
                hasil+= "Valid Number"; 
                break;
            case 4: 
                hasil+= "Valid Number"; 
                break;
            case 5: 
                hasil+= "Valid Number"; 
                break;
            case 6: 
                hasil+= "Valid Number"; 
                break;
            case 7: 
                hasil+= "Valid Number"; 
                break;
            case 8: 
                hasil+= "Valid Number"; 
                break;
            case 9: 
                hasil+= "Valid Number"; 
                break;
            case 10: 
                hasil+= "Valid Number"; 
                break;
            default: 
                hasil+= "Invalid Number"; 
                break;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
