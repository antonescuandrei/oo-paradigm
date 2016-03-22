package ooparadigm;

/**
 * Picture class represents pictures.
 */
public class Picture implements Viewable {
    /** the width of the picture */
    private int width;
    /** the height of the picture */
    private int height;
    
    /**
     * Picture constructor.
     * @param width the width of the picture
     * @param height the height of the picture
     */
    public Picture(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * Look at the picture.
     */
    @Override
    public void view() {
        System.out.println("A picture of...");
    }
}