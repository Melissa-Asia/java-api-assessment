package com.cbfacademy.apiassessment.Salon;

import org.springframework.web.bind.annotation.*;

import com.cbfacademy.apiassessment.core.SalonDesk;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/hairtyles")
public class SalonController {
    private final SalonDesk salonDesk;

    public SalonController() {
        this.salonDesk = new SalonDesk();
    }

    @GetMapping
    public List<Hairstyle> getAllHairstyles() throws IOException {
        return salonDesk.getAllHairstyles();
    }

    @PostMapping
    public void createHairstyle(@RequestBody Hairstyle hairstyle) throws IOException {
        List<Hairstyle> hairstyles = salonDesk.getAllHairstyles();
        hairstyles.add(hairstyle);
        salonDesk.saveHairstyles(hairstyles);
    }

    // Add endpoints for updating, deleting etc hairstyles
}
