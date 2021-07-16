package kg.megacom.filmotekaservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFound extends RuntimeException {

    public NotFound(String message) {
        super(message);
    }
}