package bo.edu.udabol.iaaigaf.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Activosfijos {
    private Long idactivodijo;
    private String activofijo;
    private BigDecimal costoinicial;
    private Integer vidautil;
    private LocalDate fechacompra;
}
