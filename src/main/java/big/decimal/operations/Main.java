package big.decimal.operations;

// Importando la clase UtilsBigDecimal para usar su método
import big.decimal.operations.utils.UtilsBigDecimal;
// Importando la clase BigDecimal para crear un objeto BigDecimal
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Ejemplo de uso del método bigDecimalToDouble
        // Nota:Otro modo de crear un BigDecimal -> BigDecimal valor = BigDecimal.valueOf(123.45);
        BigDecimal bigDecimalValue = new BigDecimal(1425.456789);
        double resultConverted = UtilsBigDecimal.bigDecimalToDouble(bigDecimalValue);
        // Imprimimos el resultado

        // Códigos ANSI para colores y fondo
        final String RESET = "\u001B[0m";
        final String YELLOW_BG = "\u001B[43m";
        final String BLACK = "\u001B[30m";

        System.out.println("╔════════════════════════════════════════════════╦══════════════╗");
        System.out.println("║ Descripción                                    ║    Valor     ║");
        System.out.println("╠════════════════════════════════════════════════╬══════════════╣");
        System.out.println(String.format("║ %-44s   ║  %s%s%10.2f%s  ║",
                "El valor BigDecimal convertido a double",
                YELLOW_BG, BLACK, resultConverted, RESET));
        System.out.println("╚════════════════════════════════════════════════╩══════════════╝");



    }
}
