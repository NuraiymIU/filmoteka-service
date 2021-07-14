package kg.megacom.filmotekaservice.models.dto;

import kg.megacom.filmotekaservice.models.entity.Client;
import kg.megacom.filmotekaservice.models.entity.Film;
import lombok.Data;

import java.util.Date;

@Data
public class ClientFilmDto {

    private Long id;
    private Date startDate;
    private Date endDate;
    private Client client;
    private Film film;
}
