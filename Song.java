
package test;

import java.math.BigDecimal;

public class Song extends NamedThing{
    private BigDecimal length;

    public Song(String name, BigDecimal length) {
        super(name);
        this.length = length;
    }
    
    public BigDecimal getLength() { return length; }
}