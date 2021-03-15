
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class lab18 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        for(int i = 1 ; i<=20;i++)
        {
            queue.enqueue(i);                    
        }
        int size = queue.getSize();
        System.out.println("The queue : ");
        for(int j = 1;j <= size;j++)
        {       
            System.out.printf("Value %d is : %d%n",j,queue.dequeue());
        }              
    }   
}

class Queue
{   
    private int elements[];
    private int size = 0;


    public Queue() 
    {
        elements = new int[8];
    }
    public void enqueue(int v)//fill queue 
    {    
      if(size >= elements.length)
      {
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
      }
        elements[size] = v;
        size++;
    }
    public int dequeue()
    {
        size--;
        if(!this.empty())
        {
            int[] temp = new int[elements.length - 1];
           
            System.arraycopy(elements, 1, temp, 0, elements.length - 1);
            elements = temp;
            int returnVal = elements[0];
            return returnVal;
        }
        return 0;
    }
    public boolean empty() 
    {
        return size == 0;        
    }
    public int getSize()
    {
        return size;             
    } 
}
