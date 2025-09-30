class ConversorUnidade 
{
    public static double pol2cm(double pol)
    {
        double cm = pol * 2.54;
        return cm;
    }
    public static double pes2cm(double pes)
    {
        double cm = pes * 30.48;
        return cm;
    }
    public static double milha2km(double milha)
    {
        double km = milha * 1.609;
        return km;
    }
    public static double mm2cm(double mm) {
        double cm = mm * 0.1;
        return cm;
    }
    public static double m2cm(double m) {
        double cm = m * 100;
        return cm;
    }
    public static double j2cm(double j) {
        double cm = j * 91.44;
        return cm;
    }
}
