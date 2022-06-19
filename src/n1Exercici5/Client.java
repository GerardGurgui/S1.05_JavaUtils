package n1Exercici5;

import java.io.Serializable;

/*Necesitem implementar la interfaz Serializable que s'encarrega de que els objectes d'aquesta classe 
puguin ser transformats en bytes*/

class Client implements Serializable{
    
   
    private String dni;
    private String nom;
    private int edad;
    
    
    public Client(String dni, String nom, int edad){
        
        this.dni = dni;
        this.nom = nom;
        this.edad = edad;
        
    }
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return "Client{" + "dni=" + dni + ", nom=" + nom + ", edad=" + edad + '}';
    }
    
}