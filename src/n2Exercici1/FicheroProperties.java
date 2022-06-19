package n2Exercici1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class FicheroProperties {
    
    
    public static void main(String[] args) {
        
        
        Properties properties = new Properties();
        InputStream entrada = null;
        
        try {
            
            entrada = new FileInputStream(args[0]);
            properties.load(entrada);
            
            System.out.println(properties.getProperty("ruta"));
            System.out.println(properties.getProperty("nomDirectori"));
            System.out.println(properties.getProperty("nomFitxer"));
            
            properties.store(new FileWriter("ficheroProperties.properties"), "Fichero properties");
            
        } catch(FileNotFoundException e) {
            
            System.out.println("No existeix la ruta especificada");
            
        }catch(IOException e2){
            
            System.out.println("Error d'entrada/sortida");
            
        }catch(Exception e3){
            
            System.out.println(e3);
        }
        
    }
    
}