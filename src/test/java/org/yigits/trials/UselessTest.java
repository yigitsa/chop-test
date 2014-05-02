package org.yigits.trials;


import org.junit.Test;
import org.safehaus.chop.api.IterationChop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;


/** This is plain futility */
@IterationChop( iterations = 20, threads = 5 )
public class UselessTest {

    private static final Logger LOG = LoggerFactory.getLogger( UselessTest.class );

    private static final String FUTILE_CONSTANT = "Hede";

    @Test
    public void testUseless() {
        LOG.info( "Oh, so you want to cluster test this utter pointlessness?" );
        LOG.info( "That's sweet, I can do that..." );

        Useless futile = new Useless( FUTILE_CONSTANT, 14 );
        futile.wasteTime( 3000 );

        assertEquals( futile.getUselessText(), FUTILE_CONSTANT );
    }
}
