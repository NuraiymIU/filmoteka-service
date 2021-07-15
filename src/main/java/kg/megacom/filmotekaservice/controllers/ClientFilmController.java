package kg.megacom.filmotekaservice.controllers;

import kg.megacom.filmotekaservice.models.dto.ClientFilmDto;
import kg.megacom.filmotekaservice.services.ClientFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientFilm")
public class ClientFilmController {

    @Autowired
    private ClientFilmService clientFilmService;

}
