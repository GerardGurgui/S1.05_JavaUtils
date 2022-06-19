package n1Exercici1;


import java.io.File;


public class N1ex1 {

    public static void main(String[] args)  {
        
        
        /*
        amb el metode listFiles de la clase File llistarem tots els arxius d'aquell directori
        ordenats alfabeticament.
        Pasem la ruta del directori que volem llistar com a parametre del main
        */
        
        File directori = new File(args[0]);
        
        
        if (directori.exists()) {
            
                
            llistarDirectori(directori);
                  
        } else {
            
            System.out.println("Ruta incorrecte");
        }
      
        
    }
    
    
    static void llistarDirectori(File directori){
        
        File[] arxius = directori.listFiles();

        
        for (File llistarArxius : arxius) {
            
            System.out.println(llistarArxius.getName());
        }
        
        

    }

}