import java.util.Scanner;
class executavel {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Boa Noite Professor!");
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        System.out.print("Digite sua matricula: ");
        int matricula = teclado.nextInt();
        System.out.print("Digite seu salario: ");
        float salario = teclado.nextFloat();
        System.out.print("Digite seu curso: ");
        String curso = teclado.next();
        Professores fernando = new Professores(nome, matricula, salario, curso);
        System.out.print(fernando);
        
    
        
        
        
        
    }
}