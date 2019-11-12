package com.aldren.modeling.service;

import com.aldren.modeling.exception.LanguageNotSupported;
import com.aldren.modeling.model.SoundResponse;
import com.aldren.modeling.service.impl.RoosterLanguageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RoosterLanguageService.class})
public class RoosterLanguageServiceTest {

    private static final String LANGUAGE_TAGALOG = "tagalog";
    private static final String LANGUAGE_TAGALOG_SOUND = "kok korokok";

    @Autowired
    @Qualifier("roosterLanguageService")
    private LanguageService svc;

    @Test
    public void testServiceSuccess() throws LanguageNotSupported {
        SoundResponse response = svc.getLanguageSound(LANGUAGE_TAGALOG);
        assertThat(response.getLanguage()).isEqualTo(LANGUAGE_TAGALOG);
        assertThat(response.getSound()).isEqualTo(LANGUAGE_TAGALOG_SOUND);
    }

    @Test(expected = LanguageNotSupported.class)
    public void testServiceException() throws LanguageNotSupported {
        svc.getLanguageSound("icelandic");
    }

}
