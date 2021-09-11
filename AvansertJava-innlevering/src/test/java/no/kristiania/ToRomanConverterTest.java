package no.kristiania;

import no.kristiania.ToRomanConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToRomanConverterTest {
    @Test
    void Convert1ToI(){assertEquals("I", ToRomanConverter.ToRoman(1));}

    @Test
    void Convert4ToIV(){assertEquals("IV", ToRomanConverter.ToRoman(4));}




}
