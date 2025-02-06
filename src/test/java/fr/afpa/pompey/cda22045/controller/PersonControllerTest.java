//package fr.afpa.pompey.cda22045.controller;
//
//import fr.afpa.pompey.cda22045.service.PersonService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@WebMvcTest(controllers = PersonController.class)
//class PersonControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private PersonService personService;
//
//    @Test
//    void getPersonTest() throws Exception {
//        mockMvc.perform(get("/api/persons"))
//                .andExpect(status().isOk());
//
//    }
//}