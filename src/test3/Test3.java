/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author SENCE VESPERTINO
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matrix = new int[3][3];
        
        //matrix[1][2] = 4;
        int cont = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = cont;
                cont += 2;
            }
        }    
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");                
            }
            System.out.println();            
        }
        
        System.out.println();
        
        
        
       
        int cont1 = 1;
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                matrix[k][l] = cont1;
                cont1 += 2;
            }
        } 
          
        
        for (int k = 0; k < matrix.length; k++) {
            for (int l = 0; l < matrix[k].length; l++) {
                System.out.print("[" + matrix[k][l] + "]");                
            }
            System.out.println();            
        }
        System.out.println();
        
        int cont2 = 2;
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (cont2%2 == 0){
                cont2++;
                }                
            }            
        }
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                System.out.print("[" + matrix[m][n] + "]");                
            }
            System.out.println();            
        }
        System.out.println();   
        
        int suma = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                
            }
            
        }
    }
}