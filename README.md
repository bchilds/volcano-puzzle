# volcano-puzzle
D&amp;D Volcano door puzzle
5-3-17
This is a puzzle I made for one of my Dungeons and Dragons groups. 
The players open various doors by enabling/disabling various switches. 
I have coded in the logic to determine which combination of switches opens which doors.
They are in a volcano, so there are tunnels with solid walls that they (typically) cannot go through, and there are pools of lava which might seriously injure or kill the players. 
The players can find ways to move over the lava, and this is resolved in person by talking to me. 
I did not build player tokens in-game due to time restraints, so we kept track of player locations by hand.

When a combination to open a door is met, a green square appears over the location of the door on screen to signify that it is open. 
A string of numbers was used to determine a kind of code, with * meaning value irrelevant, 0 being  value must be false, 1 being value must be true, and 2 being a lock (if that switch was thrown, the door remained open regardless of the rest of the combination). 
The index of each bit represented a unique switch in the puzzle.

All UI done in Swing.
