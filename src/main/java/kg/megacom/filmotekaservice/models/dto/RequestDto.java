package kg.megacom.filmotekaservice.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.filmotekaservice.models.entity.Film;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class RequestDto {

    private Long filmId;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate startDate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate endDate;

    private ClientDto client;

}
