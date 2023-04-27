package com.UST.interview.Controller;

import com.UST.interview.Entity.Inter;
import com.UST.interview.Service.InterServ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest(Intcontroller.class)
class IntcontrollerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InterServ mockServ;

    @Test
    void testAddinter() throws Exception {
        // Setup
        // Configure InterServ.add(...).
        final Inter inter = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");
        when(mockServ.add(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"))).thenReturn(inter);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(post("/int/add")
                        .content(asJsonString(inter)).contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        //assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    private String asJsonString(Inter inter)
    {
        try{
            return new ObjectMapper().writeValueAsString(inter);
        }
        catch(JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    void testGetinterview() throws Exception {
        // Setup
        // Configure InterServ.get(...).
        final List<Inter> inters = List.of(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"));
        when(mockServ.get()).thenReturn(inters);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/int/all")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetinterview_InterServReturnsNoItems() throws Exception {
        // Setup
        when(mockServ.get()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/int/all")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("[]");
    }

    @Test
    void testGetinterviewid() throws Exception {
        // Setup
        // Configure InterServ.getid(...).
        final Inter inter = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");
        when(mockServ.getid(0L)).thenReturn(inter);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/int/all/{id}", 0)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }
}
