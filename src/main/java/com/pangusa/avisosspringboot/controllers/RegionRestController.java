package com.pangusa.avisosspringboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.pangusa.avisosspringboot.models.entity.Region;
import com.pangusa.avisosspringboot.models.services.IRegionService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RegionRestController {
    
    @Autowired
    private IRegionService regionService;

    @GetMapping("/regions")
    public List<Region> index(){
        return regionService.findAll();
    }

     @GetMapping("/regions/{id}")
    public Region show(@PathVariable Long id){
        return regionService.findById(id);
    }

    @PostMapping("/regions")
    @ResponseStatus(HttpStatus.CREATED)
    public Region create(@RequestBody Region region){
        return regionService.save(region);
    }

     @PutMapping("/regions/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Region update(@RequestBody Region region, @PathVariable Long id){

        Region regionActual = regionService.findById(id);

        regionActual.setName(region.getName());
       
        return regionService.save(regionActual);
    }

    @DeleteMapping("/regions/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        regionService.delete(id);
    }

}
