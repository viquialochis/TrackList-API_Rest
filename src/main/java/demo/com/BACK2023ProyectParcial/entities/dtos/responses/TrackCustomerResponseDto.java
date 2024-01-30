package demo.com.BACK2023ProyectParcial.entities.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackCustomerResponseDto {

    private long trackId;
    private String name;
    private String composer;
    private int segundos;

}
