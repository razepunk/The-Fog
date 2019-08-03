import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


/**
 *
 * @author razepunk
 */
public class theFog {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
        // TODO code application logic here

        URL url = theFog.class.getClassLoader().getResource("creepy.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioIn);
        audioClip.start();

        Thread.sleep(3333);

        URL url1 = theFog.class.getClassLoader().getResource("beat.wav");
        AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(url1);
        AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(url1);
        AudioFormat format1 = audioStream1.getFormat();
        DataLine.Info info1 = new DataLine.Info(Clip.class, format1);
        Clip audioClip1 = (Clip) AudioSystem.getLine(info1);
        audioClip1.open(audioIn1);
        audioClip1.start();


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        ImageIcon iconFog = new ImageIcon(theFog.class.getResource("fog.jpg"));
        JOptionPane.showMessageDialog(
                null,
                "The Fog",
                "The Fog", INFORMATION_MESSAGE,
                iconFog);
/*
        try {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = theFog.class.getResourceAsStream("hum.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        ImageIcon icon1 = new ImageIcon(theFog.class.getResource("fogicon.jpg" ));
        ImageIcon icon2 = new ImageIcon(theFog.class.getResource("owl.png" ));

        String name;

        do {
            name = (String) JOptionPane.showInputDialog(null,"Hello what is your name?","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
        }
        while (name.equalsIgnoreCase(""));
        JOptionPane.showMessageDialog(null, "Hi " + name + " welcome to the fog!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "We are going on an adventure!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "This world is your choice.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "Lets get started!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "You are standing at the base of a hill. \nYou feel the wind on your face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        ImageIcon iconFogH = new ImageIcon(theFog.class.getResource("sxhill.jpg"));
        JOptionPane.showMessageDialog(
                null,
                "HILL",
                "The Fog", INFORMATION_MESSAGE,
                iconFogH);

        JOptionPane.showMessageDialog(null, "You see at your feet,\n" +
                "an AXE and a SWORD.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "You can only pick up one.\n" +
                " Which do you choose?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        String weapon1;
        do {
            weapon1 = (String) JOptionPane.showInputDialog(null,"AXE or SWORD?","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
        }
        while (!weapon1.equalsIgnoreCase("Axe") && !weapon1.equalsIgnoreCase("Sword"));


        if (weapon1.equalsIgnoreCase("Axe")) {

            /*try {
                // get the sound file as a resource out of my jar file;
                // the sound file must be in the same directory as this class file.
                // the input stream portion of this recipe comes from a javaworld.com article.
                InputStream inputStream = theFog.class.getResourceAsStream("axe.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogA = new ImageIcon(theFog.class.getResource("axe.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "AXE",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogA);
            JOptionPane.showMessageDialog(null, "You lift the " + weapon1 + " of Øystein. \nYou feel the weight leave the axe\n" +
                    " and you can swing with ease!!!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "OK " + name + " since you have the AXE you can smash through doors.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        } else if (weapon1.equalsIgnoreCase("Sword")) {
           /* try {
                // get the sound file as a resource out of my jar file;
                // the sound file must be in the same directory as this class file.
                // the input stream portion of this recipe comes from a javaworld.com article.
                InputStream inputStream = theFog.class.getResourceAsStream("sword.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogS = new ImageIcon(theFog.class.getResource("sword.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "SWORD",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogS);


            JOptionPane.showMessageDialog(null, "You lift the " + weapon1 + " of ALEXANDER above your head \n lightning crackles above you!!!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "OK " + name + " since you have the SWORD you can light the way in the dark.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        }

        JOptionPane.showMessageDialog(null, "You hear the forest come to life.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "An owl overhead screams and dives for a sprinting mouse.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


        for (int i = 0; i < 2; i++) {
            // your code goes here


            JOptionPane msg = new JOptionPane("HOOT", JOptionPane.WARNING_MESSAGE,JOptionPane.DEFAULT_OPTION,icon2);
            final JDialog dlg = msg.createDialog("HOOT");
            dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(666);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    dlg.setVisible(false);
                }
            }).start();
            dlg.setVisible(true);
        }


        String direction1;

        do {
           direction1 = (String) JOptionPane.showInputDialog(null,"Lets go a direction. \n"
                   + "To the LEFT there is a swamp.\n"
                   + "To the RIGHT there is a long trail.\n"
                   + "The choice is yours!!!","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
       }
       while (!direction1.equalsIgnoreCase("Left") && !direction1.equalsIgnoreCase("Right"));




        if (direction1.equalsIgnoreCase("Left")) {

            JOptionPane.showMessageDialog(null, "You trudge into the swamp\n"
                    + "your feet are soaked to the bone.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "As you wade deeper and deeper\n" +
                    "you approach the hermits hut.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Discovering the hut in the center of\n" +
                    "the swamp, you trip on a branch.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Yelling out to the hut a voice answers you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'Come to the door' the hermit calls to you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Knocking the mud off your boots you enter\n" +
                    "the hut at the hermits beckon.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The hermit kindly offers you some bread and water.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The hermit fills your satchel with bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You feel full and ready to take on the adventure.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            String action1;
            do {


                action1 = (String) JOptionPane.showInputDialog(null,"Type THANKS to express gratitude","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!action1.equalsIgnoreCase("Thanks"));

            if (action1.equalsIgnoreCase("Thanks")) {
                JOptionPane.showMessageDialog(null, "'Thank you kind hermit!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            JOptionPane.showMessageDialog(null, "The hermit whispers some magic words.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You leave the hermits hut.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            JOptionPane.showMessageDialog(null, "You trudge to the edge of the swamp.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Drying off in the sun continuing on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The sun has been growing the grass high here its almost to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can see grasshoppers jumping in front of you as you walk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You walk to a windy road.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "As a thunderous stampeding sound is cast upon you,\n" +
                    "a soldier pushes you out of the way.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'You better kneel while The Winter Queen passes peasant.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            String actof = (String) JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");

            if (actof.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before the Winter Queen as she passes.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (actof.equalsIgnoreCase("Stand")) {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (actof.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            JOptionPane.showMessageDialog(null, "The Winter Queen passes.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking the road becomes rocky.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A looming mountain stretches along the edge of the horizon.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            String direction1L;

            do {
                direction1L = (String) JOptionPane.showInputDialog(null, "You can go UP the mountain or LEFT to the sea","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!direction1L.equalsIgnoreCase("UP") && !direction1L.equalsIgnoreCase("Left"));


            if (direction1L.equalsIgnoreCase("Up")) {
                JOptionPane.showMessageDialog(null, "At the boulders base, you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You catch your footing and start climbing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Reaching to grip a hold, you step up higher\n" +
                        " against the rock face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The wind pushes " + name + " against the rock", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You are almost there", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String climb;
                do {
                    climb = (String) JOptionPane.showInputDialog(null, "Type CLIMB to pull to the top!","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
                }
                while (!climb.equalsIgnoreCase("Climb"));



                JOptionPane.showMessageDialog(null, name + "climbs to the top", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Peering out across the planes you see the ocean", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You start walking down the mountain", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Some rocks roll down the path with you", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You make it to the bottom of the mountain", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            if (direction1L.equalsIgnoreCase("Left")) {
                JOptionPane.showMessageDialog(null, "AS soon as you start along the trail you see a beggar.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You do not have any money to give him but \n" +
                        "you VOW to come back and help", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You feel the dirt soften as you walk towards the ocean.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking along the path you see a interesting plant.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "It smells sweet and fragrant.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Take some if you dare.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String weed;

                do {
                    weed = (String) JOptionPane.showInputDialog(null,"Type WEED to snap off a piece or LEAVE it.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
                }
                while  (!weed.equalsIgnoreCase("Weed") && (!weed.equalsIgnoreCase("Leave")));


                if (weed.equalsIgnoreCase("Weed")) {
                    JOptionPane.showMessageDialog(null, "You take a bit of weed.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weed.equalsIgnoreCase("Leave")){
                    JOptionPane.showMessageDialog(null, "Sparing the plant you leave it", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

                JOptionPane.showMessageDialog(null, "Walking further the ground is very soft", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            JOptionPane.showMessageDialog(null, "You keep walking until you find a stream.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You take a DRINK, its so refreshing", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Peering out of a bush is a wild dog", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The DOG seems to be stuck on a vine", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String cut;
            do {
                cut = (String) JOptionPane.showInputDialog(null, "CUT the dog free.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!cut.equalsIgnoreCase("Cut"));

            JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " you CUT the dog free!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The dog wags its tail and barks 'bark.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String give;
            do {
                give = (String) JOptionPane.showInputDialog(null, "GIVE the dog some bread.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!give.equalsIgnoreCase("Give"));
            JOptionPane.showMessageDialog(null, "The dog gratefully eats the bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You now have a friend.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String doggo;
            do {
                doggo = (String) JOptionPane.showInputDialog(null,"Whats her name?","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (doggo.equalsIgnoreCase(""));

            JOptionPane.showMessageDialog(null, "Now " + name + " and " + doggo + " head along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " follows you towards the sea.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You finally see the beautiful water\n" +
                    "cresting on some rocks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogO = new ImageIcon(theFog.class.getResource("ocean.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "OCEAN",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogO);

            JOptionPane.showMessageDialog(null, "Hearing a song you have heard before a mermaid\n" +
                    "is singing at the waters edge.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You stand for a moment listening.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You ask the mermaid 'What song was that?'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'It was WATER WAVES' she replies.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A fish splashes you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            for (int i = 0; i < 2; i++) {
                // your code goes here


                JOptionPane msg = new JOptionPane("SPLASH", JOptionPane.WARNING_MESSAGE);
                final JDialog dlg = msg.createDialog("SPLASH");
                dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(444);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        dlg.setVisible(false);
                    }
                }).start();
                dlg.setVisible(true);
            }

            JOptionPane.showMessageDialog(null, "Smiling the mermaid says 'That's the end of it!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " looks up at you", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You pet " + doggo + " and head right along the sea.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Kicking the sand along the way.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking up a sand dune you discover a beaten path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " follows you down the path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further you see a large rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "An explosion of fire licks the rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "An old wizard appears from the flames.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "He turns and points " + "'" + name + "!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You are on a great quest are you not?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I am wizard'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I can create you a staff' says the wizard", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Remember this staff is your choice!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            String[] choices1 = {"Oak", "Maple", "Cherry", "Acacia", "Beech", "Pine"};
            String wood = (String) JOptionPane.showInputDialog(null, "Choose the wood",
                    "WOOD TYPE", JOptionPane.QUESTION_MESSAGE, icon1, // Use
                    // default
                    //icon
                    choices1, // Array of choices
                    choices1[0]); // Initial choice

            if (wood.equalsIgnoreCase("Oak")) {
                JOptionPane.showMessageDialog(null, "Oak is strong, heavy, and durable.");
            } else if (wood.equalsIgnoreCase("Maple")) {
                JOptionPane.showMessageDialog(null, "Maple is resistant to splitting and durable");
            } else if (wood.equalsIgnoreCase("Cherry")) {
                JOptionPane.showMessageDialog(null, "Cherry with age becomes darker");
            } else if (wood.equalsIgnoreCase("Acacia")) {
                JOptionPane.showMessageDialog(null, "Acacia is strong and beautiful looking");
            } else if (wood.equalsIgnoreCase("Beech")) {
                JOptionPane.showMessageDialog(null, "Beech is white with fine grain");
            } else if (wood.equalsIgnoreCase("Pine")) {
                JOptionPane.showMessageDialog(null, "Pine's strength and elacticity is good");
            } else {
                System.exit(0);
            }


            String[] choices2 = {"Earth", "Fire", "Water", "Air"};
            String element = (String) JOptionPane.showInputDialog(null, "Choose the element",
                    "ELEMENT", JOptionPane.QUESTION_MESSAGE, icon1, // Use
                    // default
                    // icon
                    choices2, // Array of choices
                    choices2[0]); // Initial choice
            if (element.equalsIgnoreCase("Earth")) {
                JOptionPane.showMessageDialog(null, "Earth is rooted to the " + wood + ".");
            } else if (element.equalsIgnoreCase("Fire")) {
                JOptionPane.showMessageDialog(null, "Fire burns within the " + wood + ".");
            } else if (element.equalsIgnoreCase("Water")) {
                JOptionPane.showMessageDialog(null, "Water soaks the " + wood + ".");
            } else if (element.equalsIgnoreCase("Air")) {
                JOptionPane.showMessageDialog(null, "Air breaths through the " + wood + ".");
            } else {
                System.exit(0);
            }


            String[] choices = {"<html><font color='red'>Ruby</font></html>", "<html><font color='green'>Emerald</font></html>",
                    "<html><font color='blue'>Sapphire</font></html>", "<html><font color='yellow'>Citrine</font></html>",
                    "<html><font color='gray'>Diamond</font></html>", "<html><font color='purple'>Amethyst</font></html>"};
            String gem = (String) JOptionPane.showInputDialog(null, "Choose the gem",
                    "GEM COLOR", JOptionPane.QUESTION_MESSAGE, icon1, // Use
                    // default
                    // icon
                    choices, // Array of choices
                    choices[0]); // Initial choice
            String gem1 = null;

            if (gem.equalsIgnoreCase("<html><font color='red'>Ruby</font></html>")) {
                JOptionPane.showMessageDialog(null, "A RUBY of deepest blood red.");
                gem1 = "Ruby";
            } else if (gem.equalsIgnoreCase("<html><font color='green'>Emerald</font></html>")) {
                JOptionPane.showMessageDialog(null, "A mossy evergreen EMERALD.");
                gem1 = "Emerald";
            } else if (gem.equalsIgnoreCase("<html><font color='blue'>Sapphire</font></html>")) {
                JOptionPane.showMessageDialog(null, "A SAPPHIRE of the deep blue ocean.");
                gem1 = "Sapphire";
            } else if (gem.equalsIgnoreCase("<html><font color='yellow'>Citrine</font></html>")) {
                JOptionPane.showMessageDialog(null, "A yellow glowing CITRINE shines.");
                gem1 = "Citrine";
            } else if (gem.equalsIgnoreCase("<html><font color='gray'>Diamond</font></html>")) {
                JOptionPane.showMessageDialog(null, "A white frozen DIAMOND shivers.");
                gem1 = "Diamond";
            } else if (gem.equalsIgnoreCase("<html><font color='purple'>Amethyst</font></html>")) {
                JOptionPane.showMessageDialog(null, "A dark purple AMETHYST of royal decent.");
                gem1 = "Amethyst";
            } else {
                System.exit(0);
            }


            JOptionPane.showMessageDialog(null, "A staff of " + wood + " infused with " + element + "\n" +
                    "adorned with a " + gem1 + " appears before you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "'Why dont you try that staff out.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'That rotting stump looks like it wants a beating.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String cast;
            do {
                cast = (String) JOptionPane.showInputDialog(null,"Type CAST to destroy the stump.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!cast.equalsIgnoreCase("Cast"));

            if (element.equalsIgnoreCase("Earth")) {
                JOptionPane.showMessageDialog(null, "Casting a huge bolder from the earth,\n" +
                        "it comes crashing down on the stump obliterating it.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (element.equalsIgnoreCase("Fire")) {
                JOptionPane.showMessageDialog(null, "Fire erupts from the staff,\n" +
                        "it engulfs the stump and burns it to a crisp.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (element.equalsIgnoreCase("Water")) {
                JOptionPane.showMessageDialog(null, "Water rushes from the staff,\n" +
                        "it pounds the stump and washes it away.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (element.equalsIgnoreCase("Air")) {
                JOptionPane.showMessageDialog(null, "The air around the stump twists and pulls it\n" +
                        "out of the earth and casts it away like a rice grain.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            JOptionPane.showMessageDialog(null, "'That was well done', says the wizard.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'You should be off to your quest.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I am finished here with you.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The wizard disappears, flames erupting again over the rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " wags her tail and you continue on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Further and further from the sea you walk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further it becomes hard to walk with dense patches of grass.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " hops over a tuft of grass.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further you can walk easier as trees pop up around you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " runs way right in the trees and barks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " is standing on a beaten path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You pet her and start along the path", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking along it is very quiet in the woods.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " stops and listens.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Her body trembles and she starts sprinting.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You give chase and you see what she was running at.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "There was a man watching you from some trees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " growls and corners the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You yell at the man, 'Who are you?!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "He snarls, 'I come to deliver your soul to Dalrak", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You jump at the ready.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String attack;
            do {
                attack = (String) JOptionPane.showInputDialog(null,"CAST or ATTACK","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!attack.equalsIgnoreCase("Cast") && !attack.equalsIgnoreCase("Attack"));


            if (attack.equalsIgnoreCase("Cast")) {

                if (element.equalsIgnoreCase("Earth")) {
                    JOptionPane.showMessageDialog(null, "Sweeping the staff forward you throw a large mound\n" +
                            "of dirt in the mans face", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man grabs his eyes and screams", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Fire")) {
                    JOptionPane.showMessageDialog(null, "You conjure a blast of fire and hit the man in the face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man screams and runs around slapping his face", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Water")) {
                    JOptionPane.showMessageDialog(null, "The " + wood + " weeps and you fling a huge ball \n" +
                            "of water at the mans chest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man keels over and coughs.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Air")) {
                    JOptionPane.showMessageDialog(null, "Swirling the staff around you then thrusting at the man.\n" +
                            "The air rushes from the staff knocking the man over", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man is on his hands and knees breathing heavy.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

            } else if (attack.equalsIgnoreCase("Attack")) {
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "Bringing the AXE down on this mans sword you break it in half.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man drops the sword handle and tries a right hook.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Dodging to the left he misses his attempted punch.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, doggo + " howls and bites the man on the wrist.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {

                    JOptionPane.showMessageDialog(null, "Slashing with the sword you make contact\n" +
                            "with his hands, he drops his sword.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Kicking the sword against a tree the man attacks in return.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, doggo + " howls and bites the man on the wrist.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                JOptionPane.showMessageDialog(null, "The man whimpers 'You can't defeat me.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "'I'll never stop, You'll have to kill me.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            String attack0;
            do {
                attack0 = (String) JOptionPane.showInputDialog(null,"Finish him. CAST or ATTACK","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!attack0.equalsIgnoreCase("Cast") && !attack0.equalsIgnoreCase("Attack"));

            if (attack0.equalsIgnoreCase("Cast")) {

                if (element.equalsIgnoreCase("Earth")) {
                    JOptionPane.showMessageDialog(null, "Earth rumbling, you hold\n" +
                            "the staff high above your head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Circling the staff around your head the earth\n" +
                            "opens up under the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man falls into the earth and it closes burying him.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Fire")) {
                    JOptionPane.showMessageDialog(null, "The " + wood + " is imbued with fire.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Casting a large flame the man starts to burn alive.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man runs and flops on the ground and starts rolling.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Casting again the flame licks the man burning him to a crisp.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Water")) {
                    JOptionPane.showMessageDialog(null, "Holding the staff high above your head you conjure\n" +
                            "a large cloud overhead.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Slamming the base against the ground a huge funnel\n" +
                            "of water explodes out of the cloud engulfing the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "After the downpour the man washes to your feet", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (element.equalsIgnoreCase("Air")) {
                    JOptionPane.showMessageDialog(null, "Thrusting at the man with the staff a large wind\n" +
                            "knocks the man back against a tree.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man coughs and blood trickles down his leg.\n" +
                            "The man was impaled on a branch through his chest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

            } else if (attack0.equalsIgnoreCase("Attack")) {
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "Full force you bring the AXE down on the mans head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The weight of the AXE forces it all the way down.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have divided the man in two.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {

                    JOptionPane.showMessageDialog(null, "Swinging the sword hard at the mans torso you cut\n" +
                            "cleanly through him", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The man blinks once and the divided torso slides off his legs.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

            }

            JOptionPane.showMessageDialog(null, "The man has be defeated!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Shaking off the fight you feel stronger.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, doggo + " barks and you continue on the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking along the trail you start to see rocks along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Curiously there is a women's necklace sitting on a rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String necklace;

            do {
                necklace = (String) JOptionPane.showInputDialog(null,"Pick up the NECKLACE.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }
            while (!necklace.equalsIgnoreCase("Necklace"));


            JOptionPane.showMessageDialog(null, "Picking it up it seems to be extremely valuable.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You place it safely in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Along the trail you walk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "More and more there are rocks stacked on\n" +
                    "top of each other along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further the rocks become bricks stacked on another.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Along the trail you walk", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Finding the entrance to this fort you see an inscription", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Light among the SUN is the day that awakens.\n" +
                    "THe glowing MOON with ethereal light that shines and protects the night.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "There is also a hieroglyph inscription", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            ImageIcon iconFoghi = new ImageIcon(theFog.class.getResource("stone.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "Hieroglyph",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFoghi);


            String stone;

            do {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }
                ImageIcon icon = new ImageIcon(theFog.class.getResource("stone.gif"));
                stone = JOptionPane.showInputDialog(icon, "SUN or MOON");
            }

            while (!stone.equalsIgnoreCase("Moon"));

            JOptionPane.showMessageDialog(null, "Rumbling the door moves open.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A soldier is waiting at the opening.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'First of all how did you do that? Then what business do you have here opening our fortress.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String[] choicesQ = {"I am looking for the crystal of time.", "I am looking to destroy the Winter Queen.", "It's not your business."};
            String elementQ = (String) JOptionPane.showInputDialog(null, "My business is",
                    "The Fog", JOptionPane.QUESTION_MESSAGE, icon1, // Use
                    // default
                    // icon
                    choicesQ, // Array of choices
                    choicesQ[0]); // Initial choice
            if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                JOptionPane.showMessageDialog(null, "Øystein knows where the crystal of time is.\n" +
                        "I will take you to him now.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                JOptionPane.showMessageDialog(null, "Øystein is a friend of the Winter Queen you will find no help here.\n" +
                        "I will take you to him but he will never help.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            String elementQ1 = null;
            if (elementQ.equalsIgnoreCase("It's not your business.")) {
                JOptionPane.showMessageDialog(null, "You must be on a quest with that cool staff of yours.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String[] choicesQ1 = {"I am looking for the crystal of time.", "I am looking to destroy the Winter Queen."};

                      elementQ1  = (String) JOptionPane.showInputDialog(null, "My business is",
                        "The Fog", JOptionPane.QUESTION_MESSAGE, icon1, // Use
                        // default
                        // icon
                        choicesQ1, // Array of choices
                        choicesQ1[0]); // Initial choice
                if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "Øystein knows where the crystal of time is.\n" +
                            "I will take you to him now.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "Øystein is a friend of the Winter Queen you will find no help here.\n" +
                            "I will take you to him but he will never help.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else {
                    System.exit(0);
                }
            }

            JOptionPane.showMessageDialog(null, "'Come follow me'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Following the soldier through some stone corridors,\n" +
                    "the soldier takes you into the fortress.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Deeper and deeper the hallways wind into the fortress.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Torches light the hallways allowing you to navigate the windowless hallways.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Finally you see some daylight appear down the path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Following the soldier you make it to the square in the center of the fortress.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Øystein is in the center of the square sitting his throne.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Approaching Øystein the soldier says 'you should kneel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            String actof2;
                  do {
                      actof2 = (String) JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");

                  }
                  while (!actof2.equalsIgnoreCase("Kneel") && !actof2.equalsIgnoreCase("Stand"));


            String quest = null;
            if (actof2.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before Øystein.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "'Greetings friend!' Øystein bellows.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")){
                    JOptionPane.showMessageDialog(null, "Øystein chuckles 'I see you have that weapon\n" +
                            "of mine good to see it again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "I know where the Crystal of Time is\n" +
                            "I will give you a map that will take you there.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Øystein hands you a map, you put it in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'The Crystal of Time is a powerful object you see.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'Take care when using it.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                    quest = "CrystalM";
                } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "Øystein says 'I have ties with the Winter Queen you will be on your own.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    quest = "Winter";
                }
                if (elementQ1 != null) {
                    if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "I know where the crystal of time is\n" +
                                "I will give you a map that will take you there even though I should not.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "Øystein hands you a map, you put it in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'The Crystal of Time is a powerful object you see.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'Take care when using it.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'You should be on your way take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        quest = "CrystalM";
                    }
                    else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scorned.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        quest = "Winter";

                    }
                }
            }

            else if (actof2.equalsIgnoreCase("Stand")) {
                JOptionPane.showMessageDialog(null, "Standing in front of Øystein you wait for him to speak.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'I am not going to help you for you cannot kneel' Øystein sneers again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    quest = "Crystal";


                } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scorned.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way fool, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    quest = "Winter";

                }

                if (elementQ1 != null) {
                    if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                        JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'And you are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'I am not going to help you for you cannot kneel' Øystein sneers again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        quest = "Crystal";


                    } else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                        JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scornes.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        JOptionPane.showMessageDialog(null, "'You should be on your way fool, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        quest = "Winter";

                    }
                }
            }


            if (quest != null) {
                if (quest.equalsIgnoreCase("CrystalM")){
                    JOptionPane.showMessageDialog(null, "A soldier takes you away, " + doggo + " follows.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Winding around the halls of the fortress the soldier takes you to the exit.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Finally the exit is shown and you walk out thanking the soldier.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You reenter the lively forest, looking around you are not sure where to go.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Taking a look at the map you see that\n" +
                            "if you take the left trail you will be on the way.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Walking to the trail " + doggo + " wags her tail and follows", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Walking you start to think about the quest at hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Thinking of the toils ahead you grip the staff and the " + weapon1 + " tight.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Hungry you sit and eat the bread the hermit gave you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You share some bread with " + doggo + ". She eats it happily and licks her lips.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Getting up you feel ready to continue.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Walking further down the trail you see some flowers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);



                }
                else if (quest.equalsIgnoreCase("Crystal")){
                    JOptionPane.showMessageDialog(null, "crystal no map.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                }
                else if (quest.equalsIgnoreCase("Winter")){
                    JOptionPane.showMessageDialog(null, "winter quest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                }

            }
            System.exit(0);



        }


        if (direction1.equalsIgnoreCase("Right")) {
            JOptionPane.showMessageDialog(null, "You start along the long trail ahead of you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking forward you see something up ahead.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            String beer;
            do {
                beer = (String) JOptionPane.showInputDialog(null,"Sitting on the side of the trail\n" +
                        "you find an old camp along the road.\n" +
                        "Looking around you find 6 beers.\nHow many 0-6 do you want to drink?\n" +
                        "or save them?","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            }

            while (!beer.equalsIgnoreCase("0") && (!beer.equalsIgnoreCase("1") && (!beer.equalsIgnoreCase("2") && (!beer.equalsIgnoreCase("3")
                        && (!beer.equalsIgnoreCase("4") && (!beer.equalsIgnoreCase("5") && (!beer.equalsIgnoreCase("6"))))))));



            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogB = new ImageIcon(theFog.class.getResource("beers.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "BEER",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogB);


            if (beer.equalsIgnoreCase("1")) {
                JOptionPane.showMessageDialog(null, "The beer is frothy and dark, aged\n " +
                        "to perfection, it gulps down quickly quenching your thirst.\n" +
                        "You save 5 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("2")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n " +
                        "to perfection, it gulps down quickly quenching your thirst.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.\n" +
                        "You save 4 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("3")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!\n" +
                        "You save 3 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("4")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.\n" +
                        "You save 2 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("5")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!");
                JOptionPane.showMessageDialog(null, "Fifth beer is an english ale.\n" +
                        "It has a thick head to it.\n" +
                        "Slurping it down you are really drunk.\n" +
                        "You save 1 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "'HICCUP'!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("6")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Fifth beer is an english ale.\n" +
                        "It has a thick head to it.\n" +
                        "Slurping it down you are really drunk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Sixth beer is the best yet!\n" +
                        "You drink it in one GULP.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "HICCUP!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "YOU GOT REALLY DRUNK.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "You save 6 beers in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            int allcoins = ThreadLocalRandom.current().nextInt(70, 100 + 1);
            JOptionPane.showMessageDialog(null, "You start walking down the long trail again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "Heading along the sun is bright", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "You see a slight shine in the dirt.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogC = new ImageIcon(theFog.class.getResource("coins.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "COINS",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogC);

            JOptionPane.showMessageDialog(null, "You dig up the shiny thing. \n It's " + allcoins + " gold piece!!! \n you are now a richer person!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking down the long trail you keep going.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "As " + name + " continues down the long trail you see a bunny.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can kill the bunny with your " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You will have the choice to attack the bunny, or hit enter to walk past.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String bunnyKill1;
            bunnyKill1 = (String) JOptionPane.showInputDialog(null,"Type kill to attack","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            if (bunnyKill1.equalsIgnoreCase("Kill") && weapon1.equalsIgnoreCase("Axe")) {
                JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " you split that bunny in half along with the rock it was sitting on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (bunnyKill1.equalsIgnoreCase("Kill") && weapon1.equalsIgnoreCase("Sword")) {
                JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " searing the flesh off in an instant you cooked that bunny.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else {
                JOptionPane.showMessageDialog(null, "You spare the cute bunny.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            JOptionPane.showMessageDialog(null, "You continue down the long trail and start to see a town come into view.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You walk closer and closer to the town.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Finally you see the town sign come into view.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "It reads Deathfall\n" +
                    "Population 565 and falling.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogDF = new ImageIcon(theFog.class.getResource("sign.gif"));
            JOptionPane.showMessageDialog(null, "DEATHFALL", "The Fog", INFORMATION_MESSAGE, iconFogDF);


            JOptionPane.showMessageDialog(null, "Walking into the town it feels like a dangerous place to be.\n" +
                    "Carefully you make your way through the town.\n" +
                    "A man bumps you and mumbles something as he walks past.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You make it to the tavern in the center of town.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "If you are thirsty and want to buy a beer you can.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String checkPocket1;
            checkPocket1 = (String) JOptionPane.showInputDialog(null,"Type CHECK to check your pocket for those coins.","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            if (checkPocket1.equalsIgnoreCase("check")) {
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else {
                JOptionPane.showMessageDialog(null, "Whatever.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }



            String buyBeer0;

            buyBeer0 = (String) JOptionPane.showInputDialog(null,"A beer is 3 coins.\n" +
                    "Type BUY and chug it!","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");



            if (buyBeer0.equalsIgnoreCase("Buy")) {

                allcoins = allcoins - 3;
                JOptionPane.showMessageDialog(null, "The burly barkeep passes you an ale.\n" +
                        "You take one look before,\n" +
                        "you drink the whole thing in one GULP.\n" +
                        "You now have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            if (!buyBeer0.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "I guess you didn't want a beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            String buyBeer1 = "";


            if (buyBeer0.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "Do you wanna buy another beer?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                buyBeer1 = (String) JOptionPane.showInputDialog(null,"Now buy a beer for 3 coins.\n" +
                        "Type BUY and chug it!","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");

                if (!buyBeer1.equalsIgnoreCase("Buy")) {
                    JOptionPane.showMessageDialog(null, "I guess you only wanted one beer.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

            }


            if (buyBeer1.equalsIgnoreCase("Buy")) {

                allcoins = allcoins - 3;
                JOptionPane.showMessageDialog(null, "The burly barkeep passes you an ale.\n" +
                        "You take one look before\n" +
                        "You drink the whole thing in one GULP.\n" +
                        "You now have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);



            }


            if (beer.equalsIgnoreCase("6") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You are too drunk to avoid a man's stab.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You bleed all over the tavern floor and DIE!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                System.exit(0);

            } else if (beer.equalsIgnoreCase("6") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You fumble and avoid a man's stab suddenly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "A patron steps in to save you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "After the fight you thank the unknown man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("6") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You avoid a man's stab suddenly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You trip the man before he gets to the door.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("5") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You stumble and avoid a man's stab suddenly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "A patron steps in to save you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "After the fight you thank the unknown woman.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            } else if (beer.equalsIgnoreCase("5") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Fumbling avoiding a man's stab suddenly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (beer.equalsIgnoreCase("5") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A man lunges at you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "In a flash you maneuver to a choke-hold.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Choking the man out you drop him to the floor.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("4") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Stumbling avoiding a man's stab suddenly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            } else if (beer.equalsIgnoreCase("4") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man is lunging at you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Kicking the man in the leg he drops to his knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man runs off wounded.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (beer.equalsIgnoreCase("4") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You glance at a man who's been staring at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He yells, 'death!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You run over and kick the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He falls to his knees.");
                JOptionPane.showMessageDialog(null, "You kick him in the chest again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He chokes and drops a knife.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You let the man live and he runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("3") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man is running at you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Punching him in the chest he falls.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man runs off wounded.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("3") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You glance at a man who's been staring at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He yells 'death' and runs at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You side step and the man falls.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Knee in his back you grab the knife.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You let the man live and he runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("3") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You stare daggers at him.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a long blade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You run over swinging the " + weapon1 + " to smash the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You run over swinging the " + weapon1 + " to smack the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                JOptionPane.showMessageDialog(null, "The knife falls to the floor.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You let this man run away.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("2") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You stare at a man who's been staring at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He yells 'death' and runs at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You clothesline the man he falls back.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Knee grinding on his chest you disarm him.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You let the man live another day, he runs off.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("2") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You watch him look at you.","The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a long knife.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You run and use the " + weapon1 + " to smash the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You run and use the " + weapon1 + " to smack the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                JOptionPane.showMessageDialog(null, "The knife falls to the floor.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You let this man run away.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("2") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You know the man walking in is bad news.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He looks and says 'You should leave!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You scream 'Come make me!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a blade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You make the first move with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
            } else if (beer.equalsIgnoreCase("1") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Watching him he walks over.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a long knife.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You use the " + weapon1 + " to smash the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You use the " + weapon1 + " to smack the knife from his hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                JOptionPane.showMessageDialog(null, "You let this man run away.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("1") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You watch a man walk in the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He looks and says 'You should leave!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You yell 'Come make me!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a blade!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You make the first move with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
            } else if (beer.equalsIgnoreCase("1") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A threatening man walks in.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You hold the " + weapon1 + " tightly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Before he moves you strike.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("0") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man walks in the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He yells 'You should leave!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You scream 'Come make me!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He pulls out a knife!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He runs over but you move with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You flail at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You flail at the man with the " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
            } else if (beer.equalsIgnoreCase("0") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Immediately you see a threatening man walk in.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You grasp the " + weapon1 + " tightly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man running at you has a sharp blade!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with the blade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The blade shoots against a post and sticks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("0") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "Immediately you see a threatening man walk in.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You hold the " + weapon1 + " tightly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man pulls out a sharp blade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "He beckons.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You run over to the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with the blade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The blade shoots against a post and sticks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You hand the man over to some royal guards.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            String buyfood1;
            buyfood1 = (String) JOptionPane.showInputDialog(null,"You can now BUY bread for 3 coins","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");


            if (buyfood1.equalsIgnoreCase("Buy")) {
                allcoins = allcoins - 3;
                JOptionPane.showMessageDialog(null, "You chomp down on the bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You now have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }

            JOptionPane.showMessageDialog(null, name + " you see a group playing a game", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can play with them and win 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Pick a number between 1-3", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            int gamble1 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            int gamble2 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            String choice1;
            choice1 = (String) JOptionPane.showInputDialog(null,"Pick 1-3 or hit enter","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            String choice2;
            JOptionPane.showMessageDialog(null, "The number was " + gamble1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            if (gamble1 == (1) && choice1.equalsIgnoreCase("1")) {
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            else if (gamble1 == (2) && choice1.equalsIgnoreCase("2")){
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            else if (gamble1 == (3) && choice1.equalsIgnoreCase("3")) {
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            else if (choice1.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "I guess you don't want to play", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            else {
                allcoins = allcoins - 5;
                JOptionPane.showMessageDialog(null, "You lost 5 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            choice2 = (String) JOptionPane.showInputDialog(null,"Again pick 1-3 or hit enter","The Fog",JOptionPane.INFORMATION_MESSAGE,icon1,null,"");
            JOptionPane.showMessageDialog(null, "The number was " + gamble2 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            if (gamble2 == (1) && choice2.equalsIgnoreCase("1")) {
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            else if (gamble2 == (2) && choice2.equalsIgnoreCase("2")){
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            else if (gamble2 == (3) && choice2.equalsIgnoreCase("3")) {
                allcoins = allcoins + 10;
                JOptionPane.showMessageDialog(null, "You won 10 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            else if (choice2.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "I guess you don't want to play", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            else  {
                allcoins = allcoins - 5;
                JOptionPane.showMessageDialog(null, "You lost 5 coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                    }


                System.exit(0);
        }






    }
}


