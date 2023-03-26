

public class coche {
    public class Coche {

        private int numPuertas;
        
        public Coche(int numPuertas) {
            this.numPuertas = numPuertas;
        }
        
        public void incrementarPuertas(){
            this.numPuertas++;
        }
        
        public int getNumPuertas() {
            return this.numPuertas;
        }
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche(3); // cree un coche con 3 puertas
        miCoche.incrementarPuertas(); // añadi una puerta al coche
        
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas."); // muestra el número de puertas del coche
    }


 
}
