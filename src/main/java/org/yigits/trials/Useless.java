package org.yigits.trials;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** This class is totally useless */
public class Useless {

    private static Logger LOG = LoggerFactory.getLogger( Useless.class );

    private String uselessText;
    private int uselessValue;


    public Useless( final String uselessText, final int uselessValue ) {
        this.uselessText = uselessText;
        this.uselessValue = uselessValue;
    }


    public String getUselessText() {
        return uselessText;
    }


    public void setUselessText( final String uselessText ) {
        this.uselessText = uselessText;
    }


    public int getUselessValue() {
        return uselessValue;
    }


    public void setUselessValue( final int uselessValue ) {
        this.uselessValue = uselessValue;
    }


    public void wasteTime( int milliseconds ) {
        try {
            LOG.info( "Here is a text that means absolutely nothing: {}", uselessText );
            LOG.info( "Here is a value that justifies its own existence: {}", uselessValue );
            Thread.sleep( milliseconds );
            LOG.info( "I wasted my time for {} milliseconds and I'm a loser.", milliseconds );
        }
        catch ( InterruptedException e ) {
            LOG.error( "I couldn't waste my time cause someone woke me up", e );
        }
    }
}
