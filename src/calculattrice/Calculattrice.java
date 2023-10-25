/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculattrice;

import Services.Operation;

/**
 *
 * @author ordinateur
 */
public class Calculattrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\tCalculatrice");

        try {
            Operation.multiplication(2, null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Operation.multiplication(2, 2));
    }
    
}
