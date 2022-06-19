Executarem tots els exercicis des de la línea de comandos, és a dir, pasarem com a parametre del main (String[] args)
les rutes de directoris sobre les que volem treballar.
En comptes d'executar desde la consola del IDE, executarem el programa desde el cmd mostrant allà els resultats.

Per passar-li arguments al main ho farem desde propietats del projecte--> run configuration--> arguments--> "ruta"
guardarem aquesta ruta en una variable de tipo File, especificant que rep lo que conté el main--> File ruta = new File(args[0]) per exemple,
i treballarem partint d'aquí.


Ara ja podem executar desde el cmd:

- obrim el cmd (inicio o tecla windows+R i escribim cmd)

- cd (change directory) per accedir a la carpeta on es troba la clase del projecte que volem executar 

- indicarem que volem executar un programa java (amb la paraula java com a primer comando)
 
- seguit de un espai, el nom de la clase amb .java (App.java)

- seguit de un altre espai i la ruta del directori on es troba la clase del projecte

Exemple:  java App.java "Ruta"


-Exercici 1: 

llistar directori

java N1ex1.java "ruta del directori que volem llistar"


-Exercici 2: 

llistar directori recursivament

java N1ex2.java "ruta del directori que volem llistar"


-Exercici 3: 

llistar directori recursivament i escriure el contingut a un fitxer .txt

java N1ex3.java "ruta del directori que volem llistar"



-Exercici 4: 

preguntar al usuari quin directori vol mostrar

java N1ex4.java --> preguntará al usuari la ruta del directori

ruta: especificar la ruta


-Exercici 5:

serialitzar un objecte java en un fitxer .ser i desarialitzar


java N1ex5.java "ruta on volem guardar el fitxer .ser"


---NIVELL 2

-Exercici 1:

Crear un fitxer properties

creem un file al IDE que contindrà valors tipus key = value.

java N2ex1.java "ruta on es troba el fitxer .properties"


















