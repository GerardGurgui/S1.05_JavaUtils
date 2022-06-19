package n1Exercici3;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class N1ex3 {
    
    
    public static void main(String[] args) {
        
        
        StringBuffer stringBuffer = new StringBuffer();
        
             
        try {
            
            
            File directori = new File(args[0]);
            File nouArxiu = new File(args[0]+"\\resultat.txt");
            FileWriter fileWriter = new FileWriter(nouArxiu);
            
            llistarRecursivamentWrite(directori, stringBuffer);
            
            fileWriter.append(stringBuffer);
            fileWriter.close();      
                
                
        } catch (FileNotFoundException e) {
            
            System.out.println("No existeix la ruta especificada");
            
        }catch(IOException e2){
            
            System.out.println("Error de entrada/sortida");
            
        }catch(Exception e3){
            
            System.out.println(e3);
        }
        
    }
    
    
    
    static void llistarRecursivamentWrite(File directori, StringBuffer stringBuffer) {
        
        System.out.println("-------D: " +directori.getName()+ "----------");

        File[] arxius = directori.listFiles();
        stringBuffer.append("---D: ").append(directori).append("\n");
        
        
        for (File llistaArxius : arxius) {
            
            if (llistaArxius.isDirectory()) {
                
                llistarRecursivamentWrite(llistaArxius,stringBuffer);
                stringBuffer.append("D: ").append(llistaArxius.getName()).append("\n");
                
            } else {
                
                stringBuffer.append("   F: ").append(" - ").append(llistaArxius.getName()).append("\n");
                
            }
            
        }

    } 
    
}
