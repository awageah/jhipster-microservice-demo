package com.jhipster.microservice.demo.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.jhipster.microservice.demo.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the DemoResource REST controller.
 *
 * @see DemoResource
 */
@IntegrationTest
class DemoResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        DemoResource demoResource = new DemoResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(demoResource).build();
    }

    /**
     * Test sayHello
     */
    @Test
    void testSayHello() throws Exception {
        restMockMvc.perform(get("/api/demo/say-hello")).andExpect(status().isOk());
    }
}
