package com.aldren.modeling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ModelingAppTest {

    private static final String LANGUAGE_TAGALOG = "tagalog";
    private static final String LANGUAGE_TAGALOG_SOUND = "kok korokok";

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSuccessRequest() throws Exception {
        mockMvc.perform(get("/api/rooster/sounds?language=" + LANGUAGE_TAGALOG))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.language", is(LANGUAGE_TAGALOG)))
                .andExpect(jsonPath("$.sound", is(LANGUAGE_TAGALOG_SOUND)));
    }

    @Test
    public void testSuccessException() throws Exception {
        mockMvc.perform(get("/api/rooster/sounds?language=icelandic"))
                .andExpect(status().isBadRequest());
    }

}
