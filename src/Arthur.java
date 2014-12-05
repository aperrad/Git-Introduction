
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arthur
 */
public class Arthur {
   static int i = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello world");
        Lapin lap = new Lapin("Bob", 4);
        Lapin lap2= new Lapin("Bob2", 4);
        while(i <= 10){
            lap.crier();
            lap2.crier();
            i++;
        }
        System.out.println("Bonjour Arthur !");
    }

}
