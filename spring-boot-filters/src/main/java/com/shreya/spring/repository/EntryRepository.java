package com.shreya.spring.repository;

import com.shreya.spring.domain.Training;

import java.util.List;

public interface EntryRepository {

    boolean store(Training t);

    List<Training> retrieve() throws Exception;

    Training search(int id) throws Exception;

    boolean delete(int id) throws Exception;
}