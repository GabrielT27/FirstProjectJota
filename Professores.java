class Professores extends Funcionario {
    String curso;
    Professores(String n, int m, float s, String c) {
        super(n, m, s);
        curso = c;
    }
    void setCurso(String c) {
        curso = c;
    }
    String getCurso() {
        return curso;
    }
    
    public String toString() {
        String saida= "nome: " + nome + "\n";
        saida += "Matricula: " + matricula + "\n";
        saida += "Curso: " + curso;
        return saida;
    }
}