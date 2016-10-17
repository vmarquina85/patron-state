package patronstate;

public class PatronState {
    
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno();
        GestorMatricula gestor = new GestorMatricula();
        gestor.matricular(alumno1);
    }
    
}
