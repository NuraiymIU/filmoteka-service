package kg.megacom.filmotekaservice.controllers;

import kg.megacom.filmotekaservice.models.dto.ClientDto;
import kg.megacom.filmotekaservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/order")
    public ClientDto order(@RequestBody ClientDto clientDto){
        return clientService.order(clientDto);
    }
}
