package n1Exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class N1ex5 {
    
    
     public static void main(String[] args) {
        
         
        //Creem objectes de tipo client per serialitzar

        ArrayList<Client> llistaClients = new ArrayList<>();

         
        Client client1 = new Client("4565409Y", "Pepe", 40);
        Client client2 = new Client("4566409L", "Marc", 30);
        Client client3 = new Client("6753409B", "Pepi", 20);
        
        llistaClients.add(client1);
        llistaClients.add(client2);
        llistaClients.add(client3);
        
        
        try {
            
            ////SERIALITZAR
            File rutaDesti = new File(args[0]);
            serialitzar(rutaDesti, llistaClients);
            
            
            ////DESERIALITZAR
            File rutaOrigen = new File(args[0]);
            Client[] clientRecuperat = deserialitzar(rutaOrigen);
            
            ////Llistar fitxer deserialitzar
            llistarFitxerRecuperat(clientRecuperat);
             
        }catch (FileNotFoundException e) {
             
             System.out.println("No existeix la ruta especificada");
             
        }catch(IOException e2){
             
             System.out.println("Error d'entrada/sortida");
             
        }catch(Exception e3){
             
            System.out.println(e3);
        }
         
    }
     
     
     /////METODES
     
     static void serialitzar(File rutaDesti, ArrayList<Client> llistaClients) throws FileNotFoundException, IOException{
         
         
          //Clases per exportar els objectes ( objecte i ruta de desti)
            ObjectOutputStream serialitzarFitxer = new ObjectOutputStream(new FileOutputStream(rutaDesti));
            serialitzarFitxer.writeObject(llistaClients);
            serialitzarFitxer.close();
         
     }
     
     
     static Client[] deserialitzar(File rutaOrigen) throws FileNotFoundException, IOException, ClassNotFoundException{
         
            //Clases per importar i poder llegir (deserialitzar)
            ObjectInputStream deserialitzarFitxer = new ObjectInputStream(new FileInputStream(rutaOrigen));

            //Com estem importan un objecte el tenim que guardar a una variable d'aquest mateix tipus i fer el cast del objecte
            Client[] clientRecuperat = (Client[]) deserialitzarFitxer.readObject();
            deserialitzarFitxer.close();
         
         return clientRecuperat;
     }
     
     
    static void llistarFitxerRecuperat(Client[] clientRecuperat){
         
         for (Client client : clientRecuperat) {
             
             System.out.println(client);
         }
         
         
     }
     
}

