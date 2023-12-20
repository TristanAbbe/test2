
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 * Décrivez votre classe Game ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class AliceInWonderlandGame
{   private static Room currentRoom;
    private static ArrayList<Room> listRoom;
    private static ArrayList<Item> listItem;
    private static ArrayList<Event> event;
    private static ArrayList<Character> character;
    private boolean death=false ;
    /**
     * Constructeur d'objets de classe Game
     */
    public AliceInWonderlandGame()
    {
    }
    public void initMap(){
    
        
        Room humid_hut = new Room("A small, scary and dark dirthole","Humid Hut");
        Room catwalk = new Room("A place with cat hair everywhere. A cat basket in the corner of the room with a bowl in the shape of a cat's head next"
        +" to it. There must surely be a cat here. There is also a litter on a mushroom, hence the room's smell...", "Catwalk");
        Room sage_passage = new Room("A quiet hallway where you feel safe. Better to follow the path and not deviate.", "Sage Passage");
        Room blowhard_courtyard = new Room("A very neat courtyard with fountains and sculptures arranged in such a way that you are always amazed."
        +" A little too much decoration, perhaps…", "Blowhard Courtyard");
        Room joyless_toilets = new Room("Magnificent toilets but with a slightly worn color making the atmosphere heavy and oppressive."
        +" The brush is missing.", "Joyless Toilets");
        Room hatmakers_bunker = new Room("A well-protected underground location. It looks like someone lives here given the amount of hats."
        +" These hats decorate the walls in a very original way, especially this little spiked helmet.", "Hatmaker's Bunker");
        Room beaver_river = new Room("A small river, not that deep. However, a small animal would not be able to swim across it without a good tail.", 
        "Beaver River");
        Room weeping_swamp = new Room("A not very welcoming swamp, the smells emanating from this place are so unpleasant that they make me cry."
        +" I wonder what could be hiding in this slush...", "Weeping Swamp");
        Room dumbyard = new Room("This place is quite primitive, a civilized person wouldn't stay there long...","Dumbyard");
        Room bunny_lobby = new Room("A small burrow that you can access through a small door but there seems to be another exit."
        +" A normal-sized person certainly couldn't enter this room. A basket of dusty Granolax is lying on the floor in the corner of the room, weird...", 
        "Bunny Lobby");
        Room glorious_rabbit_hole = new Room("A small room whose entrance is a tiny hole, a normal-sized person wouldn't be able to fit in at all!"
        +" Nevertheless, this room is very warm with gorgeous objects such as a tea set and a toilet brush. Someone must be living there.", "Glorious Rabbit Hole");
        Room despair_alley = new Room("There's a sign with the words: 'You who enter here, abandon all hope…'. Charming…", "Despair Alley");
        Room ware_square = new Room("This place appears to be used as storage space, a bit like the cloud, but it is completely empty."
        +" There is a well-camouflaged door at the back of this place. It looks deserted.", "Ware Square");
        Room fancy_pharmacy = new Room("I better understand why this room was hidden, there are tons of packaged medecine arranged in a very symmetrical way!"
        +" Among all its well-maintained goods, one of them stands out with a streak of light delicately depositing on the packaging, reflecting all its"
        +" splendor in the room. This is a box of Doubiprane.", "Fancy Pharmacy");
        Room sweating_room = new Room("An entrance hall with sofas, armchairs and a well-stocked fridge. There even are beds. People must come here to"
        +" relax. On the other hand, the atmosphere is really heavy and hot there with all this fog but it seems to be a very particular kind of smoke, very good-smelling.", 
        "Sweating Room");
        Room smokey_lobby = new Room("The cloud is denser in this room, it seems to be miles long. A pink elephant appeared for a moment, it's very strange."
        +" Colors become sounds and everything seems to be more intense. It seems that this fog confers extraordinary abilities.", "Smokey Lobby");
        Room caterpillar_craddle = new Room("I better understand where the smoke altering reality comes from: a hookah surely coming from the countries"
        +" of sand. On both sides of the room there are fossilized skins resembling molts of butterflies, normally they should not be this big for such"
        +" a small animal. Very light silk threads starting from the ceiling cross the room with in its center a large red mushroom with white spots on"
        +" which is placed a strange character of an unempathetic nature.", "Caterpillar Craddle");
        Room no_rest_forest = new Room("A big forest with big trees everywhere. There is only one narrow passage to squeeze through. You definitely"
        +" shouldn't stop for a pee break.", "No-Rest Forest");
        Room twins_bin_den = new Room("This place looks dangerous! Better to keep both eyes open...", "Twins' Bin Den");
        Room menace_palace = new Room("This is the entrance to a huge, menacing house of cards! The design of this castle must have been very laborious.", 
        "Menace Palace");
        Room lowland_woodland = new Room("Plains as far as the eye can see. I don't want to get lost...", "Lowland Woodland");
        Room body_card_garden = new Room("A large door adorned with precious stones stands at the end of this immense room. There seem to be cards with"
        +" arms and legs with little pointy helmets standing in front of the door. It looks like they're keeping it. Better to be discreet with them, they look dangerous.", 
        "Body-Card Garden");
        Room heart_queen_arena = new Room("I better understand why these body cards were guarding the door: there is a gigantic throne. Next to it, a gold"
        +" table with 2 dice placed on it. On the other side, a bar with piles of bottles as well as a small one which stands out due to its very strange"
        +" appearance. A powerful and very important person must live here, surely a king...", "Queen of Hearts' Arena");
    }
}
