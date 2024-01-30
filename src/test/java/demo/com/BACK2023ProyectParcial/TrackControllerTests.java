package demo.com.BACK2023ProyectParcial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrackControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetTracksByCustomerIdWithValidId() {
        long validCustomerId = 2666; // id de cliente válido
        String url = "http://localhost:" + port + "/api/track/pro?customerid=" + validCustomerId;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    public void testGetTracksByCustomerIdWithValidIdButNoTracks() {
        long customerIdWithNoTracks = 2; // ID de cliente válido pero sin tracks
        String url = "http://localhost:" + port + "/api/track/pro?customerid=" + customerIdWithNoTracks;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        assertEquals(204, response.getStatusCodeValue());
    }

    @Test
    public void testGetTracksByNonExistentCustomerId() {
        long nonExistentCustomerId = 2222; // ID de cliente que no existe
        String url = "http://localhost:" + port + "/api/track/pro?customerid=" + nonExistentCustomerId;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        assertEquals(404, response.getStatusCodeValue());
    }
}


