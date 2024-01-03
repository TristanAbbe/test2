import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

/**
 * Décrivez votre classe Game ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class AliceInWonderlandGame extends JFrame
{   private  Room currentRoom;
    private  ArrayList<Event> event;
    private  HashMap<String, Room> roomsMap;
    private  Alice alice;
    /**
     * Constructeur d'objets de classe Game
     */
    public void newGame()
    {
        roomsMap = new HashMap<>();
        initWorld();
        alice = new Alice();
        alice.setRoom(currentRoom);
        currentRoom.ajouterAlice(alice);
    }
    
    public void initWorld(){
        
        HumidHut humidHut = new HumidHut();
        Catwalk catwalk = new Catwalk();
        SagePassage sagePassage = new SagePassage();
        BlowhardCourtyard blowhardCourtyard = new BlowhardCourtyard();
        JoylessToilets joylessToilets = new JoylessToilets();
        HatmakersBunker hatmakersBunker = new HatmakersBunker();
        BeaverRiver beaverRiver = new BeaverRiver();
        WeepingSwamp weepingSwamp = new WeepingSwamp();
        Dumbyard dumbyard = new Dumbyard();
        BunnyLobby bunnyLobby = new BunnyLobby();
        GloriousRabbitHole gloriousRabbitHole = new GloriousRabbitHole();
        DespairAlley despairAlley = new DespairAlley();
        WareSquare wareSquare = new WareSquare();
        FancyPharmacy fancyPharmacy = new FancyPharmacy();
        SweatingRoom sweatingRoom = new SweatingRoom();
        SmokeyLobby smokeyLobby = new SmokeyLobby();
        CaterpillarCraddle caterpillarCraddle = new CaterpillarCraddle();
        NoRestForest noRestForest = new NoRestForest();
        TwinsBinDen twinsBinDen = new TwinsBinDen();
        MenacePalace menacePalace = new MenacePalace();
        LowlandWoodland lowlandWoodland = new LowlandWoodland();
        BodyCardGarden bodyCardGarden = new BodyCardGarden();
        HeartQueenArena heartQueenArena = new HeartQueenArena();
        
        //set the exits 
        humidHut.setExit("South", catwalk);
        
        catwalk.setExit("South", noRestForest);
        catwalk.setExit("West", sagePassage);
        catwalk.setExit("East", despairAlley);
        catwalk.setExit("North", humidHut);
        
        sagePassage.setExit("East", catwalk);
        sagePassage.setExit("West", blowhardCourtyard);
        
        blowhardCourtyard.setExit("South", beaverRiver);
        blowhardCourtyard.setExit("West", hatmakersBunker);
        blowhardCourtyard.setExit("East", sagePassage);
        blowhardCourtyard.setExit("North", joylessToilets);
        
        joylessToilets.setExit("South", blowhardCourtyard);
        
        hatmakersBunker.setExit("East", blowhardCourtyard);
        
        beaverRiver.setExit("North", blowhardCourtyard);
        beaverRiver.setExit("West", weepingSwamp);
        
        weepingSwamp.setExit("East", beaverRiver);
        weepingSwamp.setExit("West", dumbyard);
        weepingSwamp.setExit("South", bunnyLobby);
        
        bunnyLobby.setExit("North", weepingSwamp);
        bunnyLobby.setExit("West", gloriousRabbitHole);
        
        gloriousRabbitHole.setExit("East", bunnyLobby);
        
        dumbyard.setExit("East", weepingSwamp);
        
        noRestForest.setExit("North", catwalk);
        noRestForest.setExit("West", twinsBinDen);
        noRestForest.setExit("South", menacePalace);
        
        twinsBinDen.setExit("East", noRestForest);
        
        menacePalace.setExit("North", noRestForest);
        menacePalace.setExit("West", lowlandWoodland);
        menacePalace.setExit("East", bodyCardGarden);
        
        lowlandWoodland.setExit("East", menacePalace);
        
        bodyCardGarden.setExit("East", heartQueenArena);
        bodyCardGarden.setExit("West", menacePalace);
        
        heartQueenArena.setExit("West", bodyCardGarden);
        
        despairAlley.setExit("West", catwalk);
        despairAlley.setExit("North", wareSquare);
        despairAlley.setExit("South", sweatingRoom);
        
        wareSquare.setExit("South", despairAlley);
        wareSquare.setExit("East", fancyPharmacy);
        
        fancyPharmacy.setExit("West", wareSquare);
        
        sweatingRoom.setExit("East", smokeyLobby);
        sweatingRoom.setExit("North", despairAlley);
        
        smokeyLobby.setExit("West", sweatingRoom);
        smokeyLobby.setExit("East", caterpillarCraddle);
        
        caterpillarCraddle.setExit("West", smokeyLobby);

        // Add rooms to the map
        roomsMap.put("HumidHut", humidHut);
        roomsMap.put("Catwalk", catwalk);
        roomsMap.put("SagePassage", sagePassage);
        roomsMap.put("BlowhardCourtyard", blowhardCourtyard);
        roomsMap.put("JoylessToilets", joylessToilets);
        roomsMap.put("HatmakersBunker", hatmakersBunker);
        roomsMap.put("BeaverRiver", beaverRiver);
        roomsMap.put("WeepingSwamp", weepingSwamp);
        roomsMap.put("Dumbyard", dumbyard);
        roomsMap.put("BunnyLobby", bunnyLobby);
        roomsMap.put("GloriousRabbitHole", gloriousRabbitHole);
        roomsMap.put("DespairAlley", despairAlley);
        roomsMap.put("WareSquare", wareSquare);
        roomsMap.put("FancyPharmacy", fancyPharmacy);
        roomsMap.put("SweatingRoom", sweatingRoom);
        roomsMap.put("SmokeyLobby", smokeyLobby);
        roomsMap.put("CaterpillarCraddle", caterpillarCraddle);
        roomsMap.put("NoRestForest", noRestForest);
        roomsMap.put("TwinsBinDen", twinsBinDen);
        roomsMap.put("MenacePalace", menacePalace);
        roomsMap.put("LowlandWoodland", lowlandWoodland);
        roomsMap.put("BodyCardGarden", bodyCardGarden);
        roomsMap.put("HeartQueenArena", heartQueenArena);
        
        setCurrentRoom(humidHut);
    }
    
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room newRoom) {
        currentRoom = newRoom;
    }
    
    public Alice getAlice(){
        return alice;
    }
    
    public void handleMove (String direction) {
        alice.move(direction);
        currentRoom.removeAlice(alice);
        setCurrentRoom(alice.getRoom());
        currentRoom.ajouterAlice(alice);
        updateHungerProgressBar();
    }
    
    public void updateHungerProgressBar() {

    }

}
