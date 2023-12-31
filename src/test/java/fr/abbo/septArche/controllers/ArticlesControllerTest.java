package fr.abbo.septArche.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class ArticlesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testFindById() throws Exception {
        Long articleId = 1L;

        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/articles/{id}", articleId)
                .contentType(MediaType.APPLICATION_JSON));

        result.andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print()); // Print response details for debugging
    }

    // Add similar tests for other controller methods
}
