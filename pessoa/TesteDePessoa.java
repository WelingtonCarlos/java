package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCpf("00106921347");
        aluno.setNome("Welington");
        aluno.setIdade(25);
        aluno.setMatricula("2017159490");
        
        Professor professor = new Professor();
        professor.setCpf("00106921347");
        professor.setNome("Carlos");
        professor.setIdade(25);
        professor.setSalario(20000);
        
        System.out.println(professor.imprimirDadosDaPessoa());
        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
