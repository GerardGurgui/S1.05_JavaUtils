package n1Exercici2;


import java.io.File;
import java.sql.Date;

public class N1ex2 {
    
    
    public static void main(String[] args)  {
        
        
        
        File directori = new File(args[0]);
        
        if (directori.exists()) {
            
            llistarRecursivament(directori);
            
        } else {
            
            System.out.println("Ruta incorrecte");
        }
        
    }
    
    
    
    static void llistarRecursivament(File directori){
        
        System.out.println("----- " +directori.getName()+ "-------");
        
        File[] arxius = directori.listFiles();
        
        for (File llistaArxius: arxius) {

            System.out.println(llistaArxius.getName());

            if (llistaArxius.isDirectory()) {

                
                System.out.print("-D: " + new Date(llistaArxius.lastModified())+ " ");
                //SI ÉS UN DIRECTORI, ES TORNA A CRIDAR EL MATEIX METODE PER SEGUIR LLISTAN DINS AQUEST DIRECTORI
                llistarRecursivament(llistaArxius); 

            } else {
                
                System.out.print("  F: " + new Date(llistaArxius.lastModified())+ " ");
                
            }
        }

    }
    
}
    
    
    