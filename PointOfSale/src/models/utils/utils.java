package models.utils;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class utils {

    public static String formatMoney(Double money) {
        DecimalFormat df = new DecimalFormat("#0.00");
        String format = df.format(money);
        return format;
    }

    public static String dateFormat(LocalDateTime date) {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateformar = sdf.format(date);
        return dateformar;
    }
    
}
