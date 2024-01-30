package demo.com.BACK2023ProyectParcial.entities.dtos.request;

import demo.com.BACK2023ProyectParcial.entities.Playlist;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackDto {
    private long trackId;
    private String name;
    private long albumId;
    private long mediaTypesId;
    private long genresId;
    private String composer;
    private int milliseconds;
    private int bytes;
    private int unitPrice;


}
