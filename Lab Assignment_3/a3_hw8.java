// In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking 
// out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on the
// top and the largest is on the bottom. The puzzle is to move all the disks from peg a to peg c, 
// moving one disk at a time, so that we never place a larger disk on top of a smaller one. See 
// Figure 1 for an example of the case n = 4. Write a recursive program using Java for solving 
// the Towers of Hanoi puzzle for arbitrary n

import java.util.Scanner;

public class a3_hw8 {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod){
        if(n==1){
            System.out.println("Take disk 1 from rod "+from_rod+" to rod "+to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk "+n+" from rod "+from_rod+" to rod "+to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
        sc.close();
    }
}


// Enter number of disk: 4
// Take disk 1 from rod A to rod C
// Take disk 2 from rod A to rod B
// Take disk 1 from rod C to rod B
// Take disk 3 from rod A to rod C
// Take disk 1 from rod B to rod A
// Take disk 2 from rod B to rod C
// Take disk 1 from rod A to rod C
// Take disk 4 from rod A to rod B
// Take disk 1 from rod C to rod B
// Take disk 2 from rod C to rod A
// Take disk 1 from rod B to rod A
// Take disk 3 from rod C to rod B
// Take disk 1 from rod A to rod C
// Take disk 2 from rod A to rod B
// Take disk 1 from rod C to rod B