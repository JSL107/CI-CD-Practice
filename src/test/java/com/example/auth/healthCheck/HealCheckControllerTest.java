package com.example.auth.healthCheck;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HealCheckController.class)
class HealCheckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void healthShouldReturnOk() throws Exception {
        // Given: /health 엔드포인트를 가진 컨트롤러가 구성되어 있음

        // When: /health GET 요청을 수행하면
        mockMvc.perform(get("/health"))

                // Then: 응답이 200 OK이고, 본문은 "App is running"
                .andExpect(status().isOk())
                .andExpect(content().string("App is running"));
    }
}