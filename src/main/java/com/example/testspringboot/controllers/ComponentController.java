package com.example.testspringboot.controllers;


import com.example.testspringboot.model.Component;
import com.example.testspringboot.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComponentController {

    private final ComponentService componentService;

    @Autowired
    public ComponentController(ComponentService componentService) {
        this.componentService = componentService;
    }

    @PostMapping(value = "/components")
    public ResponseEntity<?> create() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/components")
    public ResponseEntity<List<Component>> read() {
        final List<Component> components = componentService.readAll();
        return components != null && !components.isEmpty()
                ? new ResponseEntity<>(components, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/components/byId/{id}")
    public ResponseEntity<Component> read(@PathVariable(name = "id") int id) {
        final Component component = componentService.read(id);
        return component != null
                ? new ResponseEntity<>(component, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/components/byId/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Component component) {
        final boolean updated = componentService.update(component, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/components/byId/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = componentService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}