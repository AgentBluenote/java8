package annotations;

import java.awt.Image;
import java.awt.image.ImageObserver;

/**
 * Javadocs - This class is to illistrate what Tags ( ie. @author Michael ) can 
 * go into the commented section that javadoc uses to generate documentation. 
 * <p>
 * 
 * Looks like HTML tags can be used i.e.:
 * <ul>
 * <li>The Component to draw on
 * <li>A translation origin for rendering and clipping coordinates
 * <li>The current XOR alternation color
 *     (see <a href="#setXORMode">setXORMode</a>)
 * </ul>
 * <p>
 * new paragraph begins here.
 * and the extents of the Component used to create the Javadocs object.
 * 
 * @author      Sami Shaio
 * @author      Arthur van Hoff
 * @version     %I%, %G%
 * @since       1.0
 */
public abstract class JavadocTags {

    /** 
     * Draws as much of the specified image as is currently available
     * with its northwest corner at the specified coordinate (x, y).
     * This method will return immediately in all cases, even if the
     * entire image has not yet been scaled, dithered and converted
     * for the current output device.
     * <p>
     * If the current output representation is not yet complete then
     * the method will return false and the indicated 
     * {@link ImageObserver} object will be notified as the
     * conversion process progresses.
     *
     * @param img       the image to be drawn
     * @param x         the x-coordinate of the northwest corner
     *                  of the destination rectangle in pixels
     * @param y         the y-coordinate of the northwest corner
     *                  of the destination rectangle in pixels
     * @param observer  the image observer to be notified as more
     *                  of the image is converted.  May be 
     *                  <code>null</code>
     * @return          <code>true</code> if the image is completely 
     *                  loaded and was painted successfully; 
     *                  <code>false</code> otherwise.
     * @see             Image
     * @see             ImageObserver
     * @since           1.0
     */
    public abstract boolean drawImage(Image img, int x, int y, 
                                      ImageObserver observer);


    /**
     * Dispose of the system resources used by this graphics context.
     * process which may not happen for a long period of time.
     * <p>
     * Component or another Javadocs object.
     *
     * @see       #finalize()
     * @since     1.0
     */
    public abstract void dispose();

    /**
     * Disposes of this graphics context once it is no longer 
     * referenced.
     *
     * @see       #dispose()
     * @since     1.0
     */
    public void finalize() {
        dispose();
    }
}
