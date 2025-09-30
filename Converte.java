import java.util.Scanner;

class ConverteMain {
    public static void main(String args[])
    {
        Scanner tst = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = tst.nextLine();
        
        
        ConversorUnidade conv = new ConversorUnidade();
        
        
        System.out.println("Digite um número em pés para converter em centímetros: ");
        double valorPes = tst.nextDouble();
        
        double convertidoPes = conv.pes2cm(valorPes);
        
        System.out.println(valorPes + " Pés, Convertido para centímetros é igual a:" + convertidoPes);
        
        
        
        
        System.out.println(" Escreva um número em polegadas para converter em centímetros: ");
        double valorPol = tst.nextDouble();
        
        double convertidoPol = conv.pol2cm(valorPol);
        
        System.out.println(valorPol + " Polegadas, Convertido para centímetros é igual a: " + convertidoPol);
        
        
        
        System.out.println(" Escreva um número em milimetros para converter em centímetros: ");
        double valorMM = tst.nextDouble();
        
        double convertidoMM = conv.mm2cm(valorMM);
        
        System.out.println(valorMM + " Milimetros. é igual a " + convertidoMM + " em centímetros"); 
        
        
        System.out.println(" Escreva um número em metros para converter em centímetros: ");
        double valorM = tst.nextDouble();
        
        double convertidoM = conv.m2cm(valorM);
        
        System.out.println(valorM + " Metros. É igual a " + convertidoM + " em centímetros");
        
        
        System.out.println("Escreva um número e jarda para converter em centímetros:");
        
        double valorJ = tst.nextDouble();
        double convertidoJ = conv.j2cm(valorJ);
        
        System.out.println(valorJ + " Jardas. É igual a " + convertidoJ + " em centímetros.");
        
        
        System.out.println("Obrigado por confiar em nós para realizar as suas conversões!!!");
        
        
        tst.close(); // sempre bom fechar o Scanner
        
    }
}
