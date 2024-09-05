package exercicio08;

public class MainProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos", "Matemática", 5000.00);
        professor.darAula();
        professor.corrigirProvas();
    }
}

