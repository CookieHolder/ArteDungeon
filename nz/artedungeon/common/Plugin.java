package nz.artedungeon.common;

import com.rsbuddy.event.events.MessageEvent;
import com.rsbuddy.script.ActiveScript;

public abstract class Plugin extends ActiveScript
{
    private boolean startup = false;


    /**
     * Get status of plugin
     *
     * @return String status
     */
    public abstract String getStatus();

    /**
     * Is plugin valid to be run
     *
     * @return boolean true if it should be
     */
    public abstract boolean isValid();

    /**
     * Get author of plugin
     *
     * @return String author name
     */
    public abstract String getAuthor();

    /**
     * Get name of plugin
     *
     * @return String plugin name
     */
    public abstract String getName();

    public abstract int loop();

    public void startupMessage() {
        if (!startup) {
            log("Doing " + getName() + " by " + getAuthor());
            startup = true;
        }
    }

    /*
      * (non-Javadoc)
      *
      * @see java.lang.Object#equals(java.lang.Object)
      */
    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof Plugin && o.getClass().getName().equals(getClass().getName());

    }

    public void reset() {

    }
}
