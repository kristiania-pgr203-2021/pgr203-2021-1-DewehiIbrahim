package no.kristiania;

import no.kristiania.ToRomanConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToRomanConverterTest {
    @Test
    void Convert1ToI(){assertEquals("I", ToRomanConverter.tesToRoman(1));}

    @Test
    void Convert4ToIV(){assertEquals("IV", ToRomanConverter.tesToRoman(4));}

    @Test
    void Convert6ToV(){assertEquals("VI", ToRomanConverter.tesToRoman(6));}

    @Test
    void Convert9ToIX(){assertEquals("IX", ToRomanConverter.tesToRoman(9));}




}
