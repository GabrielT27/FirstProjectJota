class Funcionario {
    
    // Atributos
    String nome;
    int matricula;
    float salario;
    
    // Construtor padrão (sem parâmetros)
    Funcionario() {
        // Pode ser usado para garantir compatibilidade ou inicializações padrão
    }

    // Construtor com parâmetros
    Funcionario(String n, int m, float s) {
        nome = n;
        matricula = m;
        salario = s;
    }

    // Métodos setters
    void setNome(String n) {
        nome = n;
    }

    void setMatricula(int m) {
        matricula = m;
    }

    void setSalario(float s) {
        salario = s;
    }

    // Métodos getters
    String getNome() {
        return nome;
    }

    int getMatricula() {
        return matricula;
    }

    float getSalario() {
        return salario;
    }
}

