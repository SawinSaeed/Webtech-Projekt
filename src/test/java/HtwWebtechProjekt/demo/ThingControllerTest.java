package HtwWebtechProjekt.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class ThingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ThingService service;

    @Test
    public void getAllThingsTest() throws Exception {
        mockMvc.perform(get("/things"))
                .andExpect(status().isOk());
    }
}