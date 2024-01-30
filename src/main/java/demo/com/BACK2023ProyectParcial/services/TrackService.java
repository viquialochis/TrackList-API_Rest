package demo.com.BACK2023ProyectParcial.services;

import demo.com.BACK2023ProyectParcial.entities.dtos.request.TrackDto;
import demo.com.BACK2023ProyectParcial.entities.dtos.responses.TrackCustomerResponseDto;
import demo.com.BACK2023ProyectParcial.entities.dtos.responses.TrackResponseDto;

import java.util.List;

public interface TrackService extends Service<TrackDto, TrackResponseDto, Long>{
    List<TrackCustomerResponseDto> findTracksByACustomer(Long customerId);
}
