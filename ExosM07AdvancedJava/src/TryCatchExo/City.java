package TryCatchExo;

//• Exercice 1.2 : Reprendre au choix un exercice des semaines précédentes puis ajouter un 
//traitement à base d’exceptions là il vous semble pertinent, il faut à minima utiliser les mots 
//clés throws, throw, try catch…



// ex city7 i will implante a throw method
public class City {
    private String name;
    private int nbInhabitants;

    public City(String name, int nbInhabitants) throws InvalidCity {
        this.name = name;
        setNbInhabitants(nbInhabitants);
    }

    public void setNbInhabitants(int nbInhabitants) throws InvalidCity {  // in case of negative population
        if (nbInhabitants < 0) {
            throw new InvalidCity("Population cannot be negative.");
        }
        this.nbInhabitants = nbInhabitants;
    }
}

class InvalidCity extends Exception {
    public InvalidCity(String message) {
        super(message);
    }
}
//-"throws InvalidCity" in the method signature automatically declares that this method may 
//	throw an InvalidCity exception.
//-	"throw new InvalidCity" creates a new instance of the exception, holding information 
//	about the erroneous data and sends it to the catch block using the "super(message)" in the InvalidCity 
//	class constructor.
//-	The throw statement captures the complete context of the error, including the data and the steps in the program 
//	that led to the error.
//-	Additionally, it can include the parent exception's message if applicable.
//-	In case of invalid data input in the main class, the "try" block handles the error according 
//	to the throw statement's instructions,
//	and the "catch" block processes the error and displays a detailed report or message.

