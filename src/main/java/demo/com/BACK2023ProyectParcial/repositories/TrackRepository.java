package demo.com.BACK2023ProyectParcial.repositories;

import demo.com.BACK2023ProyectParcial.entities.Playlist;
import demo.com.BACK2023ProyectParcial.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

    @Query("SELECT t.trackId, t.name, t.composer, t.milliseconds " +
            "FROM InvoiceItem ii " +
            "JOIN ii.invoice i " +
            "JOIN i.customer c " +
            "JOIN ii.track t " +
            "WHERE c.customerId = :customerId ")
    List<Object[]> findTracksByCustomer(Long customerId);


}


