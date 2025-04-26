package com.shreya.spring.service;

import com.shreya.spring.model.Library;
import com.shreya.spring.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    // Get all libraries
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    // Get library by id
    public Library getLibraryById(int id) {
        Optional<Library> library = libraryRepository.findById(id);
        return library.orElse(null);
    }

    // Save a library
    public Library saveLibrary(Library library) {
        return libraryRepository.save(library);
    }

    // Update a library
    public Library updateLibrary(int id, Library library) {
        // Check if library exists
        Optional<Library> existingLibrary = libraryRepository.findById(id);
        if (existingLibrary.isPresent()) {
            Library updatedLibrary = existingLibrary.get();
            updatedLibrary.setAddress(library.getAddress());
            updatedLibrary.setName(library.getName());
            return libraryRepository.save(updatedLibrary);
        } else {
            return null; // Handle case where library does not exist
        }
    }

    // Delete a library
    public void deleteLibrary(int id) {
        libraryRepository.deleteById(id);
    }
}
