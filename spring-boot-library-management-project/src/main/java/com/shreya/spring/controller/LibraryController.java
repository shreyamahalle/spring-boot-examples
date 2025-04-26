package com.shreya.spring.controller;

import com.shreya.spring.model.Library;
import com.shreya.spring.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    // Get all libraries
    @GetMapping
    public List<Library> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    // Get library by id
    @GetMapping("/{id}")
    public Library getLibraryById(@PathVariable int id) {
        return libraryService.getLibraryById(id);
    }

    // Create a new library
    @PostMapping
    public Library createLibrary(@RequestBody Library library) {
        return libraryService.saveLibrary(library);
    }

    // Update a library
    @PutMapping("/{id}")
    public Library updateLibrary(@PathVariable int id, @RequestBody Library library) {
        return libraryService.updateLibrary(id, library);
    }

    // Delete a library
    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable int id) {
        libraryService.deleteLibrary(id);
    }
}
