package property.encapsulation;

/**
 * Here's a simple example of property encapsulation -- hiding data and,
 * potentially behavior, by making instance properties private and by 
 * choosing getter/setter methods appropriately. Benefits: 
 *   - no direct access to property values outside of this class (protects
 *     against illegal or inappropriate values being assigned or accessed.)
 *   - combine with public get and/or set methods for controlled access
 *     (setters control values via validation). Note that we can choose to
 *      provide getters AND setters for read/write access, or just getters
 *     for read-only access. Or, we could make the class immutable by 
 *     providing a constructor that initializes all properties and eliminating
 *     all public setter methods. This class looks immutable, but it's not
 *     because the start() method mutates the state of the running property.
 *  - Also notice that this Class has a Single Responsibility: to do what an
 *    Engine can do and nothing more.
 * 
 * @author jlombardo
 */
public class Engine {
    private int cylinderCount;
    private boolean running;

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

  
 
}
