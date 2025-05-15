package com.shreya.spring.repository;
import com.shreya.spring.model.Training;

import java.util.List;

public interface EntiryRepository {

    public boolean store(Training t);

    public List<Training> retrieve();

    public Training search(int id);

    public boolean delete(int id);
}