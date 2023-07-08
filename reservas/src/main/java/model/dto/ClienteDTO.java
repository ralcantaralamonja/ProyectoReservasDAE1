package model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private String fullName;
    private String DNICliente ;
    private String direccionCliente;
    private String correoCliente;
    private String celularCliente;
}
