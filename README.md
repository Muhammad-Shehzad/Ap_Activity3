# Ap_Activity3
Tower of Hanoi

The Tower of Hanoi puzzle was invented by the French mathematician Edouard Lucas in 1883. We are given a tower of 8 disks, initially stacked in increasing size on one of three towers. The objective is to transfer the entire tower to one of the other ones, moving only one disk at a time and never a larger one onto a smaller.

The rules of this puzzle are as follows:

Only one disk may be moved at a time.
Disks may not be set aside but must always be placed on a tower.
A larger disk may never be placed on top of a smaller disk.
Recursive Algorithm
For N disks, to be moved from the tower Src to tower Dst with central tower Aux, the following recursive algorithm will solve this problem:

Solve(N, Src, Aux, Dst)

    if N is 0

      exit

    else

      Solve(N - 1, Src, Dst, Aux)

      Move from Src to Dst

      Solve(N - 1, Aux, Src, Dst)

Task
Solve the tower of Hanoi problem, keeping track of all the moves and current states for each tower and displaying them at the end for each tower separately.

Hint
Use a data structure that can hold moves for each tower.
