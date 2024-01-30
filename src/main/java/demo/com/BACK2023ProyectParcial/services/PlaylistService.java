package demo.com.BACK2023ProyectParcial.services;

import demo.com.BACK2023ProyectParcial.entities.dtos.request.PlaylistDto;
import demo.com.BACK2023ProyectParcial.entities.dtos.responses.PlaylistResponseDto;

public interface PlaylistService extends Service<PlaylistDto, PlaylistResponseDto, Long>{

//    PlaylistResponseDto addWithCondition(PlaylistDto playlistDto, long customerId, long composerFilter);
}
