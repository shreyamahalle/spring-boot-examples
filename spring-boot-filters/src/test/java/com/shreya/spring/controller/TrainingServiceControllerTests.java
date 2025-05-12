package com.shreya.spring.controller;

import com.shreya.spring.domain.Training;
import com.shreya.spring.service.TrainingService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TrainingServiceControllerTests {

    private final static String TRAINING_URI = "/training";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TrainingService trainingService;

    @Test
    public void insertTraining() throws Exception {
        Training training = new Training("kafka", 3, "java, jms");
        when(trainingService.storeTraining(training)).thenReturn(true);

        String trainingJson = "{\"title\":\"kafka\",\"duration\":3,\"prerequisites\":\"java, jms\"}";

        mockMvc.perform(post(TRAINING_URI)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(trainingJson))
                .andExpect(status().isOk());
    }

    @Test
    public void retrieveTraining() throws Exception {
        List<Training> trainingList = List.of(
                new Training("kafka", 3, "java, jms"),
                new Training("java", 1, "oops"),
                new Training("spring", 2, "java, database"),
                new Training("AWS", 15, "infra, rhel, os"),
                new Training("openshift", 15, "rhel, infra, file-system")
        );

        when(trainingService.retrieveTrainings()).thenReturn(trainingList);

        mockMvc.perform(get(TRAINING_URI)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(5)));
    }
}