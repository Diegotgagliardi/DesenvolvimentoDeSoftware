package ExClasses;

public class Classes {
    public static void main(String[] args) {
        //Tipos básicos
        String matrícula;
        String nome;
        double nota1;
        double nota2;

        //Vetores (5 alunos)
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        String[] notas1 = new double[5];
        String[] notas2 = new double[5];

        //Classes
        aluno a1 = new aluno();
        a1.matrícula = "A";
        a1.nome = "Nome 1";
        a1.nota1 = 7;
        a1.nota2 = 8;

        aluno a2 = new aluno();
        aluno a3 = new aluno();
        aluno a4 = new aluno();
        aluno a5 = new aluno();
    }
}
