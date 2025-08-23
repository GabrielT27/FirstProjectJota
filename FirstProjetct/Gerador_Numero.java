class Gerador_Numero {
    public static void main(String arg[]) {
        int valor=(int)(Math.random()*5);
        
        if(valor>0)
        {
            System.out.println("valor maior que zero="+valor);
        }
        else
        {
            System.out.println("Valor menor ou igual a zero="+valor);
        }
    }
}