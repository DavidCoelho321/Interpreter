public class Ferraria {
    public static String formula = "medida1 * 2 + altura";

    public static double calcularNota(double medida1, double medida2) {
        String expressao;
        expressao = formula.replace("medida1", Double.toString(medida1));
        expressao = expressao.replace("medida2", Double.toString(medida2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
