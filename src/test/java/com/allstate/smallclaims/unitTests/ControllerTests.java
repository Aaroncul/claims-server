package com.allstate.smallclaims.unitTests;

import com.allstate.smallclaims.control.ClaimController;
import com.allstate.smallclaims.domain.Claim;
import com.allstate.smallclaims.domain.data.UserRepository;
import com.allstate.smallclaims.service.ClaimService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ControllerTests {

    @Autowired
    ClaimController claimsController;

    @MockBean
    ClaimService claimService;

    @MockBean
    UserRepository userRepository;

    @BeforeEach
    public void runFirst() {
        Mockito.when(claimService.countClaims())
                .thenReturn(116);

        Mockito.when(claimService.findById(1))
                .thenReturn(new Claim());
    }

    @Test
    public void checkThatNumberOfTransactionsIsAMapWithAKeyOfVolume() {
        Map<String,String> result = claimsController.getNumberOfClaims();
        assertEquals("116", result.get("volume"));
    }

    @Test
    public void checkThatNumberOfTransactionsIsAMapWithAKeyOfVolume2() {
        Map<String,String> result = claimsController.getNumberOfClaims();
        assertEquals("116", result.get("volume"));
    }

}
