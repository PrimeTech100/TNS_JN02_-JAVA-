public abstract class shape{
    protected float area;
    protected static final float pI=3.14f;
    public void show ()
    {
        System.out.println("Area = " + area);
    }    
    public abstract void  calarea();
}

public class circal{
    protected float area;
    public void show ()
    {
        
        System.out.println("Area = " + area);
    }    
    // public abstract void  calarea();
}