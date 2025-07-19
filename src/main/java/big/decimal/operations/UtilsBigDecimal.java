package big.decimal.operations;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class UtilsBigDecimal {
    public static double bigDecimalToDouble(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            throw new IllegalArgumentException("BigDecimal cannot be null");
        }
        BigDecimal bigDecimalRounded = roundToTwoDecimals(bigDecimal);
        return bigDecimalRounded.doubleValue();
    }

    // Método solo para uso interno de la instancia
    private static BigDecimal roundToTwoDecimals(BigDecimal value) {
        return value.setScale(2, RoundingMode.DOWN);
    }




}
