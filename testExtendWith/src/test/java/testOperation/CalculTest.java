package testOperation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import operation.Calcul;

@ExtendWith( LoggingExtension.class )
class CalculTest {

    Calcul                calcul = new Calcul();
    private static Logger LOGGER = LogManager.getLogger( CalculTest.class.getName() );

    public void setLogger( Logger LOGGER ) {
        this.LOGGER = LOGGER;
    }

    @BeforeEach
    public void initTest() {
        Timestamp date = new Timestamp( System.currentTimeMillis() );

        LOGGER.log( Level.INFO, "Début test " + date );

    }

    @Test
    void additionTest() {

        assertEquals( calcul.addition( 1, 3 ), 4 );

        assertThat( calcul.addition( 2, 5 ) ).isEqualTo( 7 );

    }

    // @Disabled( "désactiver car compliqué" )
    @Test
    void multiplicationTest() {

        assertEquals( calcul.multiplication( 1, 3 ), 3 );

        assertThat( calcul.multiplication( 2, 5 ) ).isEqualTo( 10 );

    }

}
