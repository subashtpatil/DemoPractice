package Encapsulation;

public class Duck {
    //private int size = 12;

   public  int size = 12;
    public void setSize(int size)
    {
      /*  if (x<=0);
        else if(x>=25);
        else
            size = x;*/
        this.size=size;
    }
    public int getSize()
    {
        return size;
    }
    public void display()
    {
        if(size>10)
            System.out.println("bigger duck!!!");
        else if (size < 10)
            System.out.println("smaller duck!!");
    }
}