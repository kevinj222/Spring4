package com.Sharath.motors.Controller;

import com.Sharath.motors.Entity.Cars;
import com.Sharath.motors.Service.Carservice;
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

@ExtendWith(SpringExtension.class)
@WebMvcTest(CarController.class)
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Carservice mockCarservice;

    @Test
    void testGetallcars() throws Exception {
        // Setup
        // Configure Carservice.gettallcars(...).
        final List<Cars> cars = List.of(new Cars(0, "carname", "brand", 0, "color", 0, "availdate", "status"));
        when(mockCarservice.gettallcars()).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharath/cars")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
      //  assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetallcars_CarserviceReturnsNoItems() throws Exception {
        // Setup
        when(mockCarservice.gettallcars()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharath/cars")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
      //  assertThat(response.getContentAsString()).isEqualTo("[]");
    }

    @Test
    void testGetcarbydate() throws Exception {
        // Setup
        // Configure Carservice.getcarbydate(...).
        final List<Cars> cars = List.of(new Cars(0, "carname", "brand", 0, "color", 0, "availdate", "status"));
        when(mockCarservice.getcarbydate("availdate")).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharath/cars/{availdate}", "availdate")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetcarbydate_CarserviceReturnsNoItems() throws Exception {
        // Setup
        when(mockCarservice.getcarbydate("availdate")).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharath/cars/{availdate}", "availdate")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
      //  assertThat(response.getContentAsString()).isEqualTo("[]");
    }
}
