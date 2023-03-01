* Did not compile because of variable naming error in PokeTree.java. Should be worth 0! But I fixed
* GUI is too big on my machine, can't see all of it at once.
* Catching and Hunting work pretty well
* Pokedex/PokeTree still not working correctly (see assignment 4 feedback)
* GUI itself is okay. Again you just need to give yourself more time to debug your work! It just isn't quite a finished product.

## 
### 80/100
# Assignment5-PokeGUI
 
## Top Section -  50/50 points
- [X] A TextField or TextArea big enough display one Pokemon's toString output.
- [X] A button titled "Hunt"
- [X] A button titled "Catch"

Click the "Hunt" button:
- [X] Randomly selects one species of Pokemon and create it.
- [X] The TextField  displays "A Bulbasaur appeared!" (or whatever species was selected)
 
Click the "Catch" button:
- [X] Random Pokemon catching.
- [X] If the Pokemon caught, the text field displays something like "Caught: " + ```<Pokemon>.toString()``` 
If not the TextField  displays: "```<Pokemon>``` escaped"

## Bottom Section - 30/50 points
- [X] A TextArea for displaying a list of Pokemon
 * Issues with this not clearing, I think when displaying Pokedex. It doesn't fit either and no scroll bars.
- [ ] A button titled "Pokedex"  displays the output of printPokeTree
 * It does print the PokeTree, but not working right at all (-10)
- [X] A button titled "Backpack" displays a list of all Pokemon that have been caught, ordered by whatever Choice is selected.
- [ ] A Choice pop-up menu for the sorting order with the following choices:Number Recent 
 *Choice not used, popup with buttons
 * Recent works as expected
 * Number doesn't do what was intended (print list sorted by Pokemon number as in Assignment 3) and also doesn't keep accurate count of 
 Pokemon caught(what it was coded to do) This is because you've got "=+" rather than "+=" in the increment. (-10)

  

