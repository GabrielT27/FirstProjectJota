class Converte {
    public static void main(String args[])
    {
        ConversorUnidade conv = new ConversorUnidade();
        System.out.println("20 pés são=" + conv.pes2cm(20) + "centímetros");
        System.out.println("5 polegadas são=" + conv.pol2cm(5) + "centímetros");
        System.out.println("3  milimetros são=" + conv.mm2cm(3) + "centímetros");
        System.out.println("10 metros são=" + conv.m2cm(10) + "centímetros");
        
        
    }
}
