package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colours;
    public float r, g, b, value;

    public Colour(TableRow row)
    {   this.colours = row.getString("colour");
        this.r = row.getFloat("r");
        this.g = row.getFloat("g");
        this.b = row.getFloat("b");
        this.value = row.getFloat("value");
    }
    public String toString()
    {
        return colours + "\t" + value; 
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colours;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colours = colour;
    }

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

}