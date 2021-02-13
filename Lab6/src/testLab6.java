
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class testLab6 {
    public static void main(String[] args) {
        int game,rand;
        Scanner inputGame = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        game = inputGame.nextInt();
        
        rand = (int)(Math.random()*3);
        if(rand==0 && game == 1)
        {
            System.out.println("The computer is scissor.You are rock. You won");         
        }
        else if(rand==1 && game ==2)
        {
             System.out.println("The computer is rock.You are paper. You won");
        }
        else if (rand == 2 && game == 0) 
        {
            System.out.println("The computer is paper.You are scissor. You won");
        } 
        else if (rand == 0 && game == 2) 
        {
            System.out.println("The computer is scissor.You are rock. You lost");
        } 
        else if (rand == 1 && game == 0) 
        {
            System.out.println("The computer is rock.You are scissor. You lost");
        } 
        else if (rand == 2 && game == 1) 
        {
            System.out.println("The computer is paper.You are rock. You lost");
        } 
        else if (rand == 0 && game == 0) 
        {
            System.out.println("The computer is scissor.You are scissor too. It is a draw");
        } 
        else if (rand == 1 && game == 1) 
        {
            System.out.println("The computer is rock.You are rock too. It is a draw");
        } 
        else if (rand == 2 && game == 2) 
        {
            System.out.println("The computer is paper.You are paper too. It is a draw");
        }
        else
        {
            System.out.println("Error Plz input again");
        }
        
    }
    
    
}
