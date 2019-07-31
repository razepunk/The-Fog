import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
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
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here






        try {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = theFog.class.getResourceAsStream("creepy.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (IOException e) {
            e.printStackTrace();
        }



        Thread.sleep(3333);

        try {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = theFog.class.getResourceAsStream("beat.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


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

        try {
            // get the sound file as a resource out of my jar file;
            // the sound file must be in the same directory as this class file.
            // the input stream portion of this recipe comes from a javaworld.com article.
            InputStream inputStream = theFog.class.getResourceAsStream("hum.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (IOException e) {
            e.printStackTrace();
        }



        String name;

        do {
            name = JOptionPane.showInputDialog("Hello what is your name?");
        }
        while (name.equalsIgnoreCase(""));
        JOptionPane.showMessageDialog(null, "Hi " + name + " welcome to the fog!");
        JOptionPane.showMessageDialog(null, "We are going on an adventure!");
        JOptionPane.showMessageDialog(null, "This world is your choice.");
        JOptionPane.showMessageDialog(null, "Lets get started!");
        JOptionPane.showMessageDialog(null, "You are standing at the base of a hill. \nYou feel the wind on your face.");
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
                "an AXE and a SWORD.");
        JOptionPane.showMessageDialog(null, "You can only pick up one.\n" +
                " Which do you choose?");
        String weapon1;
        weapon1 = JOptionPane.showInputDialog("AXE or SWORD?");

        if (!weapon1.equalsIgnoreCase("Axe") && !weapon1.equalsIgnoreCase("Sword")) {

            while (!weapon1.equalsIgnoreCase("Axe") && !weapon1.equalsIgnoreCase("Sword")) {
                weapon1 = JOptionPane.showInputDialog("AXE or SWORD?");
            }
        }

        if (weapon1.equalsIgnoreCase("Axe")) {

            try {
                // get the sound file as a resource out of my jar file;
                // the sound file must be in the same directory as this class file.
                // the input stream portion of this recipe comes from a javaworld.com article.
                InputStream inputStream = theFog.class.getResourceAsStream("axe.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
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
                    " and you can swing with ease!!!  ");
            JOptionPane.showMessageDialog(null, "OK " + name + " since you have the AXE you can smash through doors.");
        } else if (weapon1.equalsIgnoreCase("Sword")) {
            try {
                // get the sound file as a resource out of my jar file;
                // the sound file must be in the same directory as this class file.
                // the input stream portion of this recipe comes from a javaworld.com article.
                InputStream inputStream = theFog.class.getResourceAsStream("sword.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
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


            JOptionPane.showMessageDialog(null, "You lift the " + weapon1 + " of ALEXANDER above your head \n lightning crackles above you!!!");
            JOptionPane.showMessageDialog(null, "OK " + name + " since you have the SWORD you can light the way in the dark.");
        }
        if (!weapon1.equalsIgnoreCase("Axe") && !weapon1.equalsIgnoreCase("Sword")) {
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "You hear the forest come to life.");
        JOptionPane.showMessageDialog(null, "An owl overhead screams and dives for a sprinting mouse.");


        for (int i = 0; i < 2; i++) {
            // your code goes here


            JOptionPane msg = new JOptionPane("HOOT", JOptionPane.WARNING_MESSAGE);
            final JDialog dlg = msg.createDialog("HOOT");
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


        String direction1;

        do {
           direction1 = JOptionPane.showInputDialog("Lets go a direction. \n"
                   + "To the LEFT there is a swamp.\n"
                   + "To the RIGHT there is a long trail.\n"
                   + "The choice is yours!!!");
       }
       while (!direction1.equalsIgnoreCase("Left") && !direction1.equalsIgnoreCase("Right"));




        if (direction1.equalsIgnoreCase("Left")) {

            JOptionPane.showMessageDialog(null, "You trudge into the swamp\n"
                    + "your feet are soaked to the bone.");
            JOptionPane.showMessageDialog(null, "As you wade deeper and deeper\n" +
                    "you approach the hermits hut.");
            JOptionPane.showMessageDialog(null, "Discovering the hut in the center of\n" +
                    "the swamp, you trip on a branch.");
            JOptionPane.showMessageDialog(null, "Yelling out to the hut a voice answers you!");
            JOptionPane.showMessageDialog(null, "'Come to the door' the hermit calls to you.");
            JOptionPane.showMessageDialog(null, "Knocking the mud off your boots you enter\n" +
                    "the hut at the hermits beckon.");
            JOptionPane.showMessageDialog(null, "The hermit kindly offers you some bread and water.");
            JOptionPane.showMessageDialog(null, "The hermit fills your satchel with bread.");
            JOptionPane.showMessageDialog(null, "You feel full and ready to take on the adventure.");

            String action1;
            do {


                action1 = JOptionPane.showInputDialog("Type THANKS to express gratitude");
            }
            while (!action1.equalsIgnoreCase("Thanks"));

            if (!action1.equalsIgnoreCase("Thanks")) {
                JOptionPane.showMessageDialog(null, "'Thank you kind hermit!'");

            }


            JOptionPane.showMessageDialog(null, "The hermit whispers some magic words.");
            JOptionPane.showMessageDialog(null, "You leave the hermits hut.");


            JOptionPane.showMessageDialog(null, "You trudge to the edge of the swamp.");
            JOptionPane.showMessageDialog(null, "Drying off in the sun continuing on.");
            JOptionPane.showMessageDialog(null, "The sun has been growing the grass high here its almost to your knees.");
            JOptionPane.showMessageDialog(null, "You can see grasshoppers jumping in front of you as you walk.");
            JOptionPane.showMessageDialog(null, "You walk to a windy road.");
            JOptionPane.showMessageDialog(null, "As a thunderous stampeding sound is cast upon you,\n" +
                    "a soldier pushes you out of the way.");
            JOptionPane.showMessageDialog(null, "'You better kneel while The Winter Queen passes peasant.'");


            String actof = JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.");

            if (actof.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before the Winter Queen as she passes.");
            } else if (actof.equalsIgnoreCase("Stand")) {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.");
            } else if (actof.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.");
            } else {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.");
            }
            JOptionPane.showMessageDialog(null, "The Winter Queen passes.");
            JOptionPane.showMessageDialog(null, "Walking the road becomes rocky.");
            JOptionPane.showMessageDialog(null, "A looming mountain stretches along the edge of the horizon.");

            String direction1L;

            direction1L = JOptionPane.showInputDialog(null, "You can go UP the mountain or LEFT to the sea");

            if (!direction1L.equalsIgnoreCase("UP") && !direction1L.equalsIgnoreCase("Left")) {

                while (!direction1L.equalsIgnoreCase("UP") && !direction1L.equalsIgnoreCase("Left")) {
                    direction1L = JOptionPane.showInputDialog(null, "You can go UP the mountain or LEFT to the sea");
                }
            }

            if (direction1L.equalsIgnoreCase("Up")) {
                JOptionPane.showMessageDialog(null, "At the boulders base, you take a deep breath.");
                JOptionPane.showMessageDialog(null, "You catch your footing and start climbing.");
                JOptionPane.showMessageDialog(null, "Reaching to grip a hold, you step up higher\n" +
                        " against the rock face.");
                JOptionPane.showMessageDialog(null, "The wind pushes " + name + " against the rock");
                JOptionPane.showMessageDialog(null, "You are almost there");
                String climb;
                climb = JOptionPane.showInputDialog(null, "Type CLIMB to pull to the top!");

                while (!climb.equalsIgnoreCase("Climb")) {
                    climb = JOptionPane.showInputDialog(null, "Type CLIMB to pull to the top!");
                }


                JOptionPane.showMessageDialog(null, name + " " + climb + "s to the top");
                JOptionPane.showMessageDialog(null, "Peering out across the planes you see the ocean");
                JOptionPane.showMessageDialog(null, "You start walking down the mountain");
                JOptionPane.showMessageDialog(null, "Some rocks roll down the path with you");
                JOptionPane.showMessageDialog(null, "You make it to the bottom of the mountain");
            }


            if (direction1L.equalsIgnoreCase("Left")) {
                JOptionPane.showMessageDialog(null, "AS soon as you start along the trail you see a beggar.");
                JOptionPane.showMessageDialog(null, "You do not have any money to give him but \n" +
                        "you VOW to come back and help");
                JOptionPane.showMessageDialog(null, "You feel the dirt soften as you walk towards the ocean.");
                JOptionPane.showMessageDialog(null, "Walking along the path you see a interesting plant.");
                JOptionPane.showMessageDialog(null, "It smells sweet and fragrant.");
                JOptionPane.showMessageDialog(null, "Take some if you dare.");
                String weed;

                weed = JOptionPane.showInputDialog("Type WEED to snap off a piece or leave it.");


                if (weed.equalsIgnoreCase("Weed")) {
                    JOptionPane.showMessageDialog(null, "You take a bit of weed.");
                } else {
                    JOptionPane.showMessageDialog(null, "Sparing the plant you leave it");
                }

                JOptionPane.showMessageDialog(null, "Walking further the ground is very soft");
            }


            JOptionPane.showMessageDialog(null, "You keep walking until you find a stream.");
            JOptionPane.showMessageDialog(null, "You take a DRINK, its so refreshing");
            JOptionPane.showMessageDialog(null, "Peering out of a bush is a wild dog");
            JOptionPane.showMessageDialog(null, "The DOG seems to be stuck on a vine");
            String cut;
            cut = JOptionPane.showInputDialog(null, "CUT the dog free.");
            if (!cut.equalsIgnoreCase("Cut")) {
                JOptionPane.showMessageDialog(null, "That is not freeing the DOG");
            }
            while (!cut.equalsIgnoreCase("Cut")) {
                cut = JOptionPane.showInputDialog(null, "CUT the dog free.");

            }
            JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " you CUT the dog free!");
            JOptionPane.showMessageDialog(null, "The dog wags its tail and barks 'bark.'");
            String give;
            give = JOptionPane.showInputDialog(null, "GIVE the dog some bread.");
            while (!give.equalsIgnoreCase("Give")) {
                give = JOptionPane.showInputDialog(null, "GIVE the dog some bread.");
            }
            JOptionPane.showMessageDialog(null, "You now have a friend.");
            String doggo;
            do {
                doggo = JOptionPane.showInputDialog("Whats her name?");
            }
            while (doggo.equalsIgnoreCase(""));

            JOptionPane.showMessageDialog(null, "Now " + name + " and " + doggo + " head along the trail.");
            JOptionPane.showMessageDialog(null, doggo + " follows you towards the sea.");
            JOptionPane.showMessageDialog(null, "You finally see the beautiful water\n" +
                    "cresting on some rocks.");
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
                    "is singing at the waters edge.");
            JOptionPane.showMessageDialog(null, "You stand for a moment listening.");
            JOptionPane.showMessageDialog(null, "You ask the mermaid 'What song was that?'");
            JOptionPane.showMessageDialog(null, "'It was WATER WAVES' she replies.");
            JOptionPane.showMessageDialog(null, "A fish splashes you!");

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

            JOptionPane.showMessageDialog(null, "Smiling the mermaid says 'That's the end of it!'");
            JOptionPane.showMessageDialog(null, doggo + " looks up at you");
            JOptionPane.showMessageDialog(null, "You pet " + doggo + " and head right along the sea.");
            JOptionPane.showMessageDialog(null, "Kicking the sand along the way.");
            JOptionPane.showMessageDialog(null, "Walking up a sand dune you discover a beaten path.");
            JOptionPane.showMessageDialog(null, doggo + " follows you down the path.");
            JOptionPane.showMessageDialog(null, "Walking further you see a large rock.");
            JOptionPane.showMessageDialog(null, "An explosion of fire licks the rock.");
            JOptionPane.showMessageDialog(null, "An old wizard appears from the flames.");
            JOptionPane.showMessageDialog(null, "He turns and points " + "'" + name + "!'");
            JOptionPane.showMessageDialog(null, "You are on a great quest are you not?");
            JOptionPane.showMessageDialog(null, "'I am wizard'");
            JOptionPane.showMessageDialog(null, "'I can create you a staff' says the wizard");
            JOptionPane.showMessageDialog(null, "Remember this staff is your choice!");

            String[] choices1 = {"Oak", "Maple", "Cherry", "Acacia", "Beech", "Pine"};
            String wood = (String) JOptionPane.showInputDialog(null, "Choose the wood",
                    "WOOD TYPE", JOptionPane.QUESTION_MESSAGE, null, // Use
                    // default
                    // icon
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
                    "ELEMENT", JOptionPane.QUESTION_MESSAGE, null, // Use
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
                    "GEM COLOR", JOptionPane.QUESTION_MESSAGE, null, // Use
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
                    "adorned with a " + gem1 + " appears before you.");

            JOptionPane.showMessageDialog(null, "'Why dont you try that staff out.'");
            JOptionPane.showMessageDialog(null, "'That rotting stump looks like it wants a beating.'");
            String cast;
            cast = JOptionPane.showInputDialog("Type CAST to destroy the stump.");
            while (!cast.equalsIgnoreCase("Cast")) {
                cast = JOptionPane.showInputDialog("Type CAST to destroy the stump.");
            }
            if (element.equalsIgnoreCase("Earth")) {
                JOptionPane.showMessageDialog(null, "Casting a huge bolder from the earth,\n" +
                        "it comes crashing down on the stump obliterating it.");

            } else if (element.equalsIgnoreCase("Fire")) {
                JOptionPane.showMessageDialog(null, "Fire erupts from the staff,\n" +
                        "it engulfs the stump and burns it to a crisp.");

            } else if (element.equalsIgnoreCase("Water")) {
                JOptionPane.showMessageDialog(null, "Water rushes from the staff,\n" +
                        "it pounds the stump and washes it away.");

            } else if (element.equalsIgnoreCase("Air")) {
                JOptionPane.showMessageDialog(null, "The air around the stump twists and pulls it\n" +
                        "out of the earth and casts it away like a rice grain.");

            }
            JOptionPane.showMessageDialog(null, "'That was well done', says the wizard.");
            JOptionPane.showMessageDialog(null, "'You should be off to your quest.'");
            JOptionPane.showMessageDialog(null, "'I am finished here with you.'");
            JOptionPane.showMessageDialog(null, "The wizard disappears, flames erupting again over the rock.");
            JOptionPane.showMessageDialog(null, doggo + " wags her tail and you continue on.");
            JOptionPane.showMessageDialog(null, "Further and further from the sea you walk.");
            JOptionPane.showMessageDialog(null, "Walking further it becomes hard to walk with dense patches of grass.");
            JOptionPane.showMessageDialog(null, doggo + " hops over a tuft of grass.");
            JOptionPane.showMessageDialog(null, "Walking further you can walk easier as trees pop up around you.");
            JOptionPane.showMessageDialog(null, doggo + " runs way right in the trees and barks.");
            JOptionPane.showMessageDialog(null, doggo + " is standing on a beaten path.");
            JOptionPane.showMessageDialog(null, "You pet her and start along the path");
            JOptionPane.showMessageDialog(null, "Walking along it is very quiet in the woods.");
            JOptionPane.showMessageDialog(null, doggo + " stops and listens.");
            JOptionPane.showMessageDialog(null, "Her body trembles and she starts sprinting.");
            JOptionPane.showMessageDialog(null, "You give chase and you see what she was running at.");
            JOptionPane.showMessageDialog(null, "There was a man watching you from some trees.");
            JOptionPane.showMessageDialog(null, doggo + " growls and corners the man.");
            JOptionPane.showMessageDialog(null, "You yell at the man, 'Who are you?!'");
            JOptionPane.showMessageDialog(null, "He snarls, 'I come to deliver your soul to Dalrak");
            JOptionPane.showMessageDialog(null, "You jump at the ready.");
            String attack;
            do {
                attack = JOptionPane.showInputDialog("CAST or ATTACK");
            }
            while (!attack.equalsIgnoreCase("Cast") && !attack.equalsIgnoreCase("Attack"));


            if (attack.equalsIgnoreCase("Cast")) {

                if (element.equalsIgnoreCase("Earth")) {
                    JOptionPane.showMessageDialog(null, "Sweeping the staff forward you throw a large mound\n" +
                            "of dirt in the mans face");
                    JOptionPane.showMessageDialog(null, "The man grabs his eyes and screams");
                } else if (element.equalsIgnoreCase("Fire")) {
                    JOptionPane.showMessageDialog(null, "You conjure a blast of fire and hit the man in the face.");
                    JOptionPane.showMessageDialog(null, "The man screams and runs around slapping his face");
                } else if (element.equalsIgnoreCase("Water")) {
                    JOptionPane.showMessageDialog(null, "The " + wood + " weeps and you fling a huge ball \n" +
                            "of water at the mans chest.");
                    JOptionPane.showMessageDialog(null, "The man keels over and coughs.");
                } else if (element.equalsIgnoreCase("Air")) {
                    JOptionPane.showMessageDialog(null, "Swirling the staff around you then thrusting at the man.\n" +
                            "The air rushes from the staff knocking the man over");
                    JOptionPane.showMessageDialog(null, "The man is on his hands and knees breathing heavy.");
                }

            } else if (attack.equalsIgnoreCase("Attack")) {
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "Bringing the AXE down on this mans sword you break it in half.");
                    JOptionPane.showMessageDialog(null, "The man drops the sword handle and tries a right hook.");
                    JOptionPane.showMessageDialog(null, "Dodging to the left he misses his attempted punch.");
                    JOptionPane.showMessageDialog(null, doggo + " howls and bites the man on the wrist.");
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.");
                } else if (weapon1.equalsIgnoreCase("Sword")) {

                    JOptionPane.showMessageDialog(null, "Slashing with the sword you make contact\n" +
                            "with his hands, he drops his sword.");
                    JOptionPane.showMessageDialog(null, "Kicking the sword against a tree the man attacks in return.");
                    JOptionPane.showMessageDialog(null, doggo + " howls and bites the man on the wrist.");
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.");
                }
                JOptionPane.showMessageDialog(null, "The man whimpers 'You can't defeat me.'");
                JOptionPane.showMessageDialog(null, "'I'll never stop, You'll have to kill me.'");

            }
            String attack0;
            do {
                attack0 = JOptionPane.showInputDialog("Finish him. CAST or ATTACK");
            }
            while (!attack0.equalsIgnoreCase("Cast") && !attack0.equalsIgnoreCase("Attack"));

            if (attack0.equalsIgnoreCase("Cast")) {

                if (element.equalsIgnoreCase("Earth")) {
                    JOptionPane.showMessageDialog(null, "Earth rumbling, you hold\n" +
                            "the staff high above your head.");
                    JOptionPane.showMessageDialog(null, "Circling the staff around your head the earth\n" +
                            "opens up under the man.");
                    JOptionPane.showMessageDialog(null, "The man falls into the earth and it closes burying him.");
                } else if (element.equalsIgnoreCase("Fire")) {
                    JOptionPane.showMessageDialog(null, "The " + wood + " is imbued with fire.");
                    JOptionPane.showMessageDialog(null, "Casting a large flame the man starts to burn alive.");
                    JOptionPane.showMessageDialog(null, "The man runs and flops on the ground and starts rolling.");
                    JOptionPane.showMessageDialog(null, "Casting again the flame licks the man burning him to a crisp.");
                } else if (element.equalsIgnoreCase("Water")) {
                    JOptionPane.showMessageDialog(null, "Holding the staff high above your head you conjure\n" +
                            "a large cloud overhead.");
                    JOptionPane.showMessageDialog(null, "Slamming the base against the ground a huge funnel\n" +
                            "of water explodes out of the cloud engulfing the man.");
                    JOptionPane.showMessageDialog(null, "After the downpour the man washes to your feet");
                } else if (element.equalsIgnoreCase("Air")) {
                    JOptionPane.showMessageDialog(null, "Thrusting at the man with the staff a large wind\n" +
                            "knocks the man back against a tree.");
                    JOptionPane.showMessageDialog(null, "The man coughs and blood trickles down his leg.\n" +
                            "The man was impaled on a branch through his chest.");
                }

            } else if (attack0.equalsIgnoreCase("Attack")) {
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "Full force you bring the AXE down on the mans head.");
                    JOptionPane.showMessageDialog(null, "The weight of the AXE forces it all the way down.");
                    JOptionPane.showMessageDialog(null, "You have divided the man in two.");
                } else if (weapon1.equalsIgnoreCase("Sword")) {

                    JOptionPane.showMessageDialog(null, "Swinging the sword hard at the mans torso you cut\n" +
                            "cleanly through him");
                    JOptionPane.showMessageDialog(null, "The man blinks once and the divided torso slides off his legs.");
                }

            }

            JOptionPane.showMessageDialog(null, "The man has be defeated!");
            JOptionPane.showMessageDialog(null, "Shaking off the fight you feel stronger.");
            JOptionPane.showMessageDialog(null, doggo + " barks and you continue on the trail.");
            JOptionPane.showMessageDialog(null, "Walking along the trail you start to see rocks along the trail.");
            JOptionPane.showMessageDialog(null, "Curiously there is a women's necklace sitting on a rock.");
            String necklace;

            do {
                necklace = JOptionPane.showInputDialog("Pick up the NECKLACE.");
            }
            while (!necklace.equalsIgnoreCase("Necklace"));


            JOptionPane.showMessageDialog(null, "Picking it up it seems to be extremely valuable.");
            JOptionPane.showMessageDialog(null, "You place it safely in your satchel.");
            JOptionPane.showMessageDialog(null, "Along the trail you walk.");
            JOptionPane.showMessageDialog(null, "More and more there are rocks stacked on\n" +
                    "top of each other along the trail.");
            JOptionPane.showMessageDialog(null, "Walking further the rocks become bricks stacked on another.");
            JOptionPane.showMessageDialog(null, "Along the trail you walk");
            JOptionPane.showMessageDialog(null, "Finding the entrance to this fort you see an inscription");
            JOptionPane.showMessageDialog(null, "Light among the SUN is the day that awakens.\n" +
                    "THe glowing MOON with ethereal light that shines and protects the night.");
            JOptionPane.showMessageDialog(null, "There is also a hieroglyph inscription");

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

            JOptionPane.showMessageDialog(null, "Rumbling the door moves open.");
            JOptionPane.showMessageDialog(null, "A soldier is waiting at the opening.");
            JOptionPane.showMessageDialog(null, "'First of all how did you do that? Then what business do you have here opening our fortress.'");
            String[] choicesQ = {"I am looking for the crystal of time.", "I am looking to destroy the Winter Queen.", "It's not your business."};
            String elementQ = (String) JOptionPane.showInputDialog(null, "My business is",
                    "Business", JOptionPane.QUESTION_MESSAGE, null, // Use
                    // default
                    // icon
                    choicesQ, // Array of choices
                    choicesQ[0]); // Initial choice
            if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                JOptionPane.showMessageDialog(null, "Øystein knows where the crystal of time is.\n" +
                        "I will take you to him now.");
            } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                JOptionPane.showMessageDialog(null, "Øystein is a friend of the Winter Queen you will find no help here.\n" +
                        "I will take you to him but he will never help.");
            }
            String elementQ1 = null;
            if (elementQ.equalsIgnoreCase("It's not your business.")) {
                JOptionPane.showMessageDialog(null, "You must be on a quest with that cool staff of yours.");
                String[] choicesQ1 = {"I am looking for the crystal of time.", "I am looking to destroy the Winter Queen."};

                      elementQ1  = (String) JOptionPane.showInputDialog(null, "My business is",
                        "Business", JOptionPane.QUESTION_MESSAGE, null, // Use
                        // default
                        // icon
                        choicesQ1, // Array of choices
                        choicesQ1[0]); // Initial choice
                if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "Øystein knows where the crystal of time is.\n" +
                            "I will take you to him now.");
                } else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "Øystein is a friend of the Winter Queen you will find no help here.\n" +
                            "I will take you to him but he will never help.");
                } else {
                    System.exit(0);
                }
            }

            JOptionPane.showMessageDialog(null, "'Come follow me'");
            JOptionPane.showMessageDialog(null, "Following the soldier through some stone corridors,\n" +
                    "the soldier takes you into the fortress.");
            JOptionPane.showMessageDialog(null, "Deeper and deeper the hallways wind into the fortress.");
            JOptionPane.showMessageDialog(null, "Torches light the hallways allowing you to navigate the windowless hallways.");
            JOptionPane.showMessageDialog(null, "Finally you see some daylight appear down the path.");
            JOptionPane.showMessageDialog(null, "Following the soldier you make it to the square in the center of the fortress.");
            JOptionPane.showMessageDialog(null, "Øystein is in the center of the square sitting his throne.");
            JOptionPane.showMessageDialog(null, "Approaching Øystein the soldier says 'you should kneel.");

            String actof2;
                  do {
                      actof2 = JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.");

                  }
                  while (!actof2.equalsIgnoreCase("Kneel") && !actof2.equalsIgnoreCase("Stand"));


            String quest = null;
            if (actof2.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before Øystein.");
                JOptionPane.showMessageDialog(null, "'Greetings friend!' Øystein bellows.");
                if (weapon1.equalsIgnoreCase("Axe")){
                    JOptionPane.showMessageDialog(null, "Øystein chuckles 'I see you have that weapon\n" +
                            "of mine good to see it again.");
                }
                if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "I know where the Crystal of Time is\n" +
                            "I will give you a map that will take you there.");
                    JOptionPane.showMessageDialog(null, "Øystein hands you a map, you put it in your satchel.");
                    JOptionPane.showMessageDialog(null, "'The Crystal of Time is a powerful object you see.' Øystein says.");
                    JOptionPane.showMessageDialog(null, "'Take care when using it.' Øystein says.");
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'");

                    quest = "CrystalM";
                } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "Øystein says 'I have ties with the Winter Queen you will be on your own.'");
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'");
                    quest = "Winter";
                }
                if (elementQ1 != null) {
                    if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.");
                        JOptionPane.showMessageDialog(null, "I know where the crystal of time is\n" +
                                "I will give you a map that will take you there even though I should not.");
                        JOptionPane.showMessageDialog(null, "Øystein hands you a map, you put it in your satchel.");
                        JOptionPane.showMessageDialog(null, "'The Crystal of Time is a powerful object you see.' Øystein says.");
                        JOptionPane.showMessageDialog(null, "'Take care when using it.' Øystein says.");
                        JOptionPane.showMessageDialog(null, "'You should be on your way take your dog.'");
                        quest = "CrystalM";
                    }
                    else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.");
                        JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scorned.");
                        JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'");
                        quest = "Winter";

                    }
                }
            }

            else if (actof2.equalsIgnoreCase("Stand")) {
                JOptionPane.showMessageDialog(null, "Standing in front of Øystein you wait for him to speak.");

                if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.");
                    JOptionPane.showMessageDialog(null, "'I am not going to help you for you cannot kneel' Øystein sneers again.");
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'");
                    quest = "Crystal";


                } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.");
                    JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scorned.");
                    JOptionPane.showMessageDialog(null, "'You should be on your way fool, take your dog.'");
                    quest = "Winter";

                }

                if (elementQ1 != null) {
                    if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                        JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.");
                        JOptionPane.showMessageDialog(null, "'And you are rude to my soldier!' Øystein snaps.");
                        JOptionPane.showMessageDialog(null, "'I am not going to help you for you cannot kneel' Øystein sneers again.");
                        JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'");
                        quest = "Crystal";


                    } else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                        JOptionPane.showMessageDialog(null, "'Insolent one you are!' Øystein sneers.");
                        JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.");
                        JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scornes.");
                        JOptionPane.showMessageDialog(null, "'You should be on your way fool, take your dog.'");
                        quest = "Winter";

                    }
                }
            }


            if (quest != null) {
                if (quest.equalsIgnoreCase("CrystalM")){
                    JOptionPane.showMessageDialog(null, "A soldier takes you away, " + doggo + " follows.");
                    JOptionPane.showMessageDialog(null, "Winding around the halls of the fortress the soldier takes you to the exit.");
                    JOptionPane.showMessageDialog(null, "Finally the exit is shown and you walk out thanking the soldier.");
                    JOptionPane.showMessageDialog(null, "You reenter the lively forest, looking around you are not sure where to go.");
                    JOptionPane.showMessageDialog(null, "Taking a look at the map you see that\n" +
                            "if you take the left trail you will be on the way.");
                    JOptionPane.showMessageDialog(null, "Walking to the trail " + doggo + " wags her tail and follows");
                    JOptionPane.showMessageDialog(null, "Walking you start to think about the quest at hand.");
                    JOptionPane.showMessageDialog(null, "Thinking of the toils ahead you grip the staff and the " + weapon1 + " tight.");
                    JOptionPane.showMessageDialog(null, "Hungry you sit and eat the bread the hermit gave you.");
                    JOptionPane.showMessageDialog(null, "You share some bread with " + doggo + ". She eats it happily and licks her lips.");
                    JOptionPane.showMessageDialog(null, "Getting up you feel ready to continue.");
                    JOptionPane.showMessageDialog(null, "Walking further down the trail you see some flowers.");



                }

                else if (quest.equalsIgnoreCase("Winter")){
                    JOptionPane.showMessageDialog(null, "winter quest.");

                }
                else if (quest.equalsIgnoreCase("Crystal")){
                    JOptionPane.showMessageDialog(null, "crystal no map.");

                }
            }
            System.exit(0);



        }


        if (direction1.equalsIgnoreCase("Right")) {
            JOptionPane.showMessageDialog(null, "You start along the long trail ahead of you.");
            JOptionPane.showMessageDialog(null, "Walking forward you see something up ahead.");


            String beer;

            beer = JOptionPane.showInputDialog("Sitting on the side of the trail\n" +
                    "you find an old camp along the road.\n" +
                    "Looking around you find 6 beers.\nHow many 0-6 do you want to drink?\n" +
                    "or save them?");

            if (!beer.equalsIgnoreCase("0") && (!beer.equalsIgnoreCase("1") && (!beer.equalsIgnoreCase("2") && (!beer.equalsIgnoreCase("3")
                    && (!beer.equalsIgnoreCase("4") && (!beer.equalsIgnoreCase("5") && (!beer.equalsIgnoreCase("6")))))))) {

                while (!beer.equalsIgnoreCase("0") && (!beer.equalsIgnoreCase("1") && (!beer.equalsIgnoreCase("2") && (!beer.equalsIgnoreCase("3")
                        && (!beer.equalsIgnoreCase("4") && (!beer.equalsIgnoreCase("5") && (!beer.equalsIgnoreCase("6")))))))) {
                    beer = JOptionPane.showInputDialog("Walking to the right you find an old camp along the road.\n" +
                            "Looking around you find 6 beers.\nHow many 0-6 do you want to drink?\n" +
                            "or save them?");
                }
            }

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
                        "You save 5 beers in your satchel.");
            } else if (beer.equalsIgnoreCase("2")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n " +
                        "to perfection, it gulps down quickly quenching your thirst.");
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.\n" +
                        "You save 4 beers in your satchel.");
            } else if (beer.equalsIgnoreCase("3")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.");
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.");
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!\n" +
                        "You save 3 beers in your satchel.");
            } else if (beer.equalsIgnoreCase("4")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.");
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.");
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!");
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.\n" +
                        "You save 2 beers in your satchel.");
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!");
            } else if (beer.equalsIgnoreCase("5")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.");
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.");
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!");
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.");
                JOptionPane.showMessageDialog(null, "Fifth beer is an english ale.\n" +
                        "It has a thick head to it.\n" +
                        "Slurping it down you are really drunk.\n" +
                        "You save 1 beers in your satchel.");
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!");
                JOptionPane.showMessageDialog(null, "'HICCUP'!");
            } else if (beer.equalsIgnoreCase("6")) {
                JOptionPane.showMessageDialog(null, "First beer is frothy and dark, aged\n" +
                        "to perfection, it gulps down quickly quenching your thirst.");
                JOptionPane.showMessageDialog(null, "Second beer is light and tan.\n" +
                        "You burp a little and start to feel the effects of the first beer.");
                JOptionPane.showMessageDialog(null, "Third beer is thick and very dark.\n" +
                        "The hops are very evident in this one!");
                JOptionPane.showMessageDialog(null, "Fourth beer is citrus flavored.\n" +
                        "You can taste orange and grapefruit.\n" +
                        "You burp again and start to feel drunk.");
                JOptionPane.showMessageDialog(null, "Fifth beer is an english ale.\n" +
                        "It has a thick head to it.\n" +
                        "Slurping it down you are really drunk.");
                JOptionPane.showMessageDialog(null, "Sixth beer is the best yet!\n" +
                        "You drink it in one GULP.\n");
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!");
                JOptionPane.showMessageDialog(null, "HICCUP!");
                JOptionPane.showMessageDialog(null, "YOU GOT REALLY DRUNK.");
            } else if (beer.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "You save 6 beers in your satchel.");
            }


            int randomNum = ThreadLocalRandom.current().nextInt(70, 100 + 1);
            JOptionPane.showMessageDialog(null, "You start walking down the long trail again.");

            JOptionPane.showMessageDialog(null, "Heading along the sun is bright");

            JOptionPane.showMessageDialog(null, "You see a slight shine in the dirt.");

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

            JOptionPane.showMessageDialog(null, "You dig up the shiny thing. \n It's " + randomNum + " gold piece!!! \n you are now a richer person! ");
            JOptionPane.showMessageDialog(null, "Walking down the long trail you keep going.");
            JOptionPane.showMessageDialog(null, "As " + name + " continues down the long trail you see a bunny.");
            JOptionPane.showMessageDialog(null, "You can kill the bunny with your " + weapon1 + ".");
            JOptionPane.showMessageDialog(null, "You will have the choice to attack the bunny, or hit enter to walk past.");
            String bunnyKill1;
            bunnyKill1 = JOptionPane.showInputDialog("Type kill to attack");
            if (bunnyKill1.equalsIgnoreCase("kill") && weapon1.equalsIgnoreCase("axe")) {
                JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " you split that bunny in half along with the rock it was sitting on.");
            } else if (bunnyKill1.equalsIgnoreCase("kill") && weapon1.equalsIgnoreCase("sword")) {
                JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " searing the flesh off in an instant you cooked that bunny.");
            } else {

                JOptionPane.showMessageDialog(null, "You spare the cute bunny.");

            }

            JOptionPane.showMessageDialog(null, "You continue down the long trail and start to see a town come into view.");
            JOptionPane.showMessageDialog(null, "You walk closer and closer to the town.");
            JOptionPane.showMessageDialog(null, "Finally you see the town sign come into view.");
            JOptionPane.showMessageDialog(null, "It reads Deathfall\n" +
                    "Population 565 and falling.");

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            }

            ImageIcon iconFogDF = new ImageIcon(theFog.class.getResource("sign.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "DEATHFALL",
                    "The Fog", INFORMATION_MESSAGE,
                    iconFogDF);


            JOptionPane.showMessageDialog(null, "Walking into the town it feels like a dangerous place to be.\n" +
                    "Carefully you make your way through the town.\n" +
                    "A man bumps you and mumbles something as he walks past.");
            JOptionPane.showMessageDialog(null, "You make it to the tavern in the center of town.");
            JOptionPane.showMessageDialog(null, "If you are thirsty and want to buy a beer you can.");
            String checkPocket1;
            checkPocket1 = JOptionPane.showInputDialog("Type CHECK to check your pocket for those coins.");
            if (checkPocket1.equalsIgnoreCase("check")) {
                JOptionPane.showMessageDialog(null, "You have " + randomNum + " coins.");

            } else {
                JOptionPane.showMessageDialog(null, "Whatever.");
            }

            String buyBeer0;

            buyBeer0 = JOptionPane.showInputDialog("A beer is 3 coins.\n" +
                    "Type BUY and chug it!");
            int randomNum1 = randomNum - 3;
            if (buyBeer0.equalsIgnoreCase("Buy")) {


                JOptionPane.showMessageDialog(null, "The burly barkeep passes you an ale.\n" +
                        "You take one look before,\n" +
                        "you drink the whole thing in one GULP.\n" +
                        "You now have " + randomNum1 + " coins.");
            }
            if (!buyBeer0.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "I guess you didn't want a beer.");
            }

            String buyBeer1 = "";


            if (buyBeer0.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "Do you wanna buy another beer?");
                buyBeer1 = JOptionPane.showInputDialog("Now buy a beer for 3 coins.\n" +
                        "Type BUY and chug it!");

                if (!buyBeer1.equalsIgnoreCase("Buy")) {
                    JOptionPane.showMessageDialog(null, "I guess you only wanted one beer.");
                }

            }

            int randomNum2 = randomNum1 - 3;
            if (buyBeer1.equalsIgnoreCase("Buy")) {


                JOptionPane.showMessageDialog(null, "The burly barkeep passes you an ale.\n" +
                        "You take one look before\n" +
                        "You drink the whole thing in one GULP.\n" +
                        "You now have " + randomNum2 + " coins.");


            }


            if (beer.equalsIgnoreCase("6") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You are too drunk to avoid a man's stab.");
                JOptionPane.showMessageDialog(null, "You bleed all over the tavern floor and DIE!");
                System.exit(0);

            } else if (beer.equalsIgnoreCase("6") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You fumble and avoid a man's stab suddenly.");
                JOptionPane.showMessageDialog(null, "A patron steps in to save you.");
                JOptionPane.showMessageDialog(null, "After the fight you thank the unknown man.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("6") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You avoid a man's stab suddenly.");
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.");
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.");
                JOptionPane.showMessageDialog(null, "You trip the man before he gets to the door.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("5") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You stumble and avoid a man's stab suddenly.");
                JOptionPane.showMessageDialog(null, "A patron steps in to save you.");
                JOptionPane.showMessageDialog(null, "After the fight you thank the unknown woman.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");


            } else if (beer.equalsIgnoreCase("5") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Fumbling avoiding a man's stab suddenly.");
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.");
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");

            } else if (beer.equalsIgnoreCase("5") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A man lunges at you!");
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.");
                JOptionPane.showMessageDialog(null, "In a flash you maneuver to a choke-hold.");
                JOptionPane.showMessageDialog(null, "Choking the man out you drop him to the floor.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("4") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Stumbling avoiding a man's stab suddenly.");
                JOptionPane.showMessageDialog(null, "You grab his hand and slam it on the bar.");
                JOptionPane.showMessageDialog(null, "He drops the knife and runs off.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");


            } else if (beer.equalsIgnoreCase("4") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man is lunging at you!");
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.");
                JOptionPane.showMessageDialog(null, "Kicking the man in the leg he drops to his knees.");
                JOptionPane.showMessageDialog(null, "The man runs off wounded.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");

            } else if (beer.equalsIgnoreCase("4") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You glance at a man who's been staring at you.");
                JOptionPane.showMessageDialog(null, "He yells, 'death!'");
                JOptionPane.showMessageDialog(null, "You run over and kick the man.");
                JOptionPane.showMessageDialog(null, "He falls to his knees.");
                JOptionPane.showMessageDialog(null, "You kick him in the chest again.");
                JOptionPane.showMessageDialog(null, "He chokes and drops a knife.");
                JOptionPane.showMessageDialog(null, "You let the man live and he runs off.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("3") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man is running at you!");
                JOptionPane.showMessageDialog(null, "You quickly dodge and disarm the man.");
                JOptionPane.showMessageDialog(null, "Punching him in the chest he falls.");
                JOptionPane.showMessageDialog(null, "The man runs off wounded.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("3") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You glance at a man who's been staring at you.");
                JOptionPane.showMessageDialog(null, "He yells 'death' and runs at you.");
                JOptionPane.showMessageDialog(null, "You side step and the man falls.");
                JOptionPane.showMessageDialog(null, "Knee in his back you grab the knife.");
                JOptionPane.showMessageDialog(null, "You let the man live and he runs off.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("3") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.");
                JOptionPane.showMessageDialog(null, "You stare daggers at him.");
                JOptionPane.showMessageDialog(null, "He pulls out a long blade.");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You run over swinging the " + weapon1 + " to smash the knife from his hand.");
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You run over swinging the " + weapon1 + " to smack the knife from his hand.");
                }
                JOptionPane.showMessageDialog(null, "The knife falls to the floor.");
                JOptionPane.showMessageDialog(null, "You let this man run away.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("2") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You stare at a man who's been staring at you.");
                JOptionPane.showMessageDialog(null, "He yells 'death' and runs at you.");
                JOptionPane.showMessageDialog(null, "You clothesline the man he falls back.");
                JOptionPane.showMessageDialog(null, "Knee grinding on his chest you disarm him.");
                JOptionPane.showMessageDialog(null, "You let the man live another day, he runs off.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("2") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.");
                JOptionPane.showMessageDialog(null, "You watch him look at you.");
                JOptionPane.showMessageDialog(null, "He pulls out a long knife.");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You run and use the " + weapon1 + " to smash the knife from his hand.");
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You run and use the " + weapon1 + " to smack the knife from his hand.");
                }
                JOptionPane.showMessageDialog(null, "The knife falls to the floor.");
                JOptionPane.showMessageDialog(null, "You let this man run away.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("2") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "You know the man walking in is bad news.");
                JOptionPane.showMessageDialog(null, "He looks and says 'You should leave!'");
                JOptionPane.showMessageDialog(null, "You scream 'Come make me!'");
                JOptionPane.showMessageDialog(null, "He pulls out a blade.");
                JOptionPane.showMessageDialog(null, "You make the first move with the " + weapon1 + ".");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
                }
            } else if (beer.equalsIgnoreCase("1") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A menacing man walks in the tavern.");
                JOptionPane.showMessageDialog(null, "Watching him he walks over.");
                JOptionPane.showMessageDialog(null, "He pulls out a long knife.");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You use the " + weapon1 + " to smash the knife from his hand.");
                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You use the " + weapon1 + " to smack the knife from his hand.");
                }
                JOptionPane.showMessageDialog(null, "You let this man run away.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("1") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "You watch a man walk in the tavern.");
                JOptionPane.showMessageDialog(null, "He looks and says 'You should leave!'");
                JOptionPane.showMessageDialog(null, "You yell 'Come make me!'");
                JOptionPane.showMessageDialog(null, "He pulls out a blade!");
                JOptionPane.showMessageDialog(null, "You make the first move with the " + weapon1 + ".");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You strike at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
                }
            } else if (beer.equalsIgnoreCase("1") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "A threatening man walks in.");
                JOptionPane.showMessageDialog(null, "You hold the " + weapon1 + " tightly.");
                JOptionPane.showMessageDialog(null, "Before he moves you strike.");
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with his head.");
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.");
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.");
                JOptionPane.showMessageDialog(null, "You hand over the man to some royal guards.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("0") && (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "A man walks in the tavern.");
                JOptionPane.showMessageDialog(null, "He yells 'You should leave!'");
                JOptionPane.showMessageDialog(null, "You scream 'Come make me!'");
                JOptionPane.showMessageDialog(null, "He pulls out a knife!");
                JOptionPane.showMessageDialog(null, "He runs over but you move with the " + weapon1 + ".");
                if (weapon1.equalsIgnoreCase("Axe")) {
                    JOptionPane.showMessageDialog(null, "You flail at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Twisting the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");

                } else if (weapon1.equalsIgnoreCase("Sword")) {
                    JOptionPane.showMessageDialog(null, "You flail at the man with the " + weapon1 + ".");
                    JOptionPane.showMessageDialog(null, "Turning the " + weapon1 + " you bash his head.");
                    JOptionPane.showMessageDialog(null, "He falls to the floor unconscious.");
                    JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
                }
            } else if (beer.equalsIgnoreCase("0") && (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy")))) {
                JOptionPane.showMessageDialog(null, "Immediately you see a threatening man walk in.");
                JOptionPane.showMessageDialog(null, "You grasp the " + weapon1 + " tightly.");
                JOptionPane.showMessageDialog(null, "The man running at you has a sharp blade!");
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with the blade.");
                JOptionPane.showMessageDialog(null, "The blade shoots against a post and sticks.");
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.");
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            } else if (beer.equalsIgnoreCase("0") && (!buyBeer0.equalsIgnoreCase("Buy"))) {
                JOptionPane.showMessageDialog(null, "Immediately you see a threatening man walk in.");
                JOptionPane.showMessageDialog(null, "You hold the " + weapon1 + " tightly.");
                JOptionPane.showMessageDialog(null, "The man pulls out a sharp blade.");
                JOptionPane.showMessageDialog(null, "He beckons.");
                JOptionPane.showMessageDialog(null, "You run over to the man.");
                JOptionPane.showMessageDialog(null, "You swing the " + weapon1 + " it connects with the blade.");
                JOptionPane.showMessageDialog(null, "The blade shoots against a post and sticks.");
                JOptionPane.showMessageDialog(null, "Kicking the man in the chest he falls.");
                JOptionPane.showMessageDialog(null, "The man seems to be unconscious.");
                JOptionPane.showMessageDialog(null, "You hand the man over to some royal guards.");
                JOptionPane.showMessageDialog(null, "Shaking off the fight you take a deep breath.");
            }
            String buyfood1;
            buyfood1 = JOptionPane.showInputDialog("You can now BUY bread for 3 coins");
            int randomNum3NA = randomNum - 3;
            int randomNum3FB = randomNum1 - 3;
            int randomNum3BB = randomNum2 - 3;
            if (buyfood1.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "You chomp down on the bread.");


                if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy"))) {
                    JOptionPane.showMessageDialog(null, "You now have " + randomNum3NA + " coins");
                } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy"))) {
                    JOptionPane.showMessageDialog(null, "You now have " + randomNum3FB + " coins");
                } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy"))) {
                    JOptionPane.showMessageDialog(null, "You now have " + randomNum3BB + " coins");
                }


            }

            JOptionPane.showMessageDialog(null, name + " You see a group playing a game");
            JOptionPane.showMessageDialog(null, "You can play with them and win 10 coins");
            JOptionPane.showMessageDialog(null, "Pick a number between 1-3");

            int gamble1 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            int gamble2 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            String choice1;
            choice1 = JOptionPane.showInputDialog("Pick 1-3 or hit enter");
            String choice2;
            JOptionPane.showMessageDialog(null, "The number was " + gamble1 + ".");

                 if (gamble1 == (1) && (choice1.equalsIgnoreCase("2"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }
                else if (gamble1 == (1) && (choice1.equalsIgnoreCase("3"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }




                else if (gamble1 == (2) && (choice1.equalsIgnoreCase("1"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }

                else if (gamble1 == (2) && (choice1.equalsIgnoreCase("3"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }

                else if (gamble1 == (3) && (choice1.equalsIgnoreCase("1"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }
                else if (gamble1 == (3) && (choice1.equalsIgnoreCase("2"))){
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 5;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }



                else if (gamble1 == (1) && (choice1.equalsIgnoreCase("1"))) {
                    JOptionPane.showMessageDialog(null, "You won 10 coins");
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3NA + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3FB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum1 + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3BB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    }
                }

                else if (gamble1 == (2) && (choice1.equalsIgnoreCase("2"))) {
                    JOptionPane.showMessageDialog(null, "You won 10 coins");
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3NA + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3FB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum1 + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3BB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    }
                }

                else if (gamble1 == (3) && (choice1.equalsIgnoreCase("3"))) {
                    JOptionPane.showMessageDialog(null, "You won 10 coins");
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3NA + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3FB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum1 + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinswon = randomNum3BB + 5;
                        JOptionPane.showMessageDialog(null, "You have " + coinswon + " coins");
                    }
                }



            else if (choice1.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "I guess you don't want to play");
            }






                choice2 = JOptionPane.showInputDialog("Again pick 1-3 or hit enter");
            JOptionPane.showMessageDialog(null, "The number was " + gamble2 + ".");


            if (choice2.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "I guess you don't want to play again");

            }


            if ((gamble1 == (1)) && (choice1.equalsIgnoreCase("1") && ((gamble1 == (2)) && (choice1.equalsIgnoreCase("2") && ((gamble1 == (3)) && (choice1.equalsIgnoreCase("3"))))))){

                if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {

                    if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                    else if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                   else if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                }


                else if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {

                    if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                    else if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                    else if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                }


                else if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {

                    if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                    else if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                   else if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                        JOptionPane.showMessageDialog(null, "You won 10 coins");
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3NA + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3FB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum1 + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinswon2 = randomNum3BB + 5;
                            JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                        }
                    }

                }

                else if (gamble2 == (1) && (choice2.equalsIgnoreCase("2") )) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");

                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    }
                    else if (gamble2 == (1) && (choice2.equalsIgnoreCase("3"))) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    } else if (gamble2 == (2) && (choice2.equalsIgnoreCase("1"))) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");

                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    } else if (gamble2 == (2) && (choice2.equalsIgnoreCase("3"))) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");

                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    } else if (gamble2 == (3) && (choice2.equalsIgnoreCase("1"))) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");

                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    } else if (gamble2 == (3) && (choice2.equalsIgnoreCase("2"))) {
                        if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3NA - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3FB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum1 - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");
                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                            int coinslost = randomNum3BB - 5;
                            JOptionPane.showMessageDialog(null, "You lost 5 coins");

                            JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                        }
                    }
            }

            else {

                if (gamble2 == (1) && (choice2.equalsIgnoreCase("2"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                } else if (gamble2 == (1) && (choice2.equalsIgnoreCase("3"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                } else if (gamble2 == (2) && (choice2.equalsIgnoreCase("1"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                } else if (gamble2 == (2) && (choice2.equalsIgnoreCase("3"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                } else if (gamble2 == (3) && (choice2.equalsIgnoreCase("1"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");

                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                } else if (gamble2 == (3) && (choice2.equalsIgnoreCase("2"))) {
                    if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3NA - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3FB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum1 - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                        int coinslost = randomNum3BB - 10;
                        JOptionPane.showMessageDialog(null, "You lost 5 coins");
                        JOptionPane.showMessageDialog(null, "You have " + coinslost + " coins");
                    }
                }
            }


                if ((gamble1 == (1)) && (choice1.equalsIgnoreCase("1") && ((gamble1 == (2)) && (choice1.equalsIgnoreCase("2") && ((gamble1 == (3)) && (choice1.equalsIgnoreCase("3"))))))) {

                    if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {

                        if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                    }


                    else if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {

                        if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                    }


                    else if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {

                        if (gamble2 == (1) && (choice2.equalsIgnoreCase("1"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (2) && (choice2.equalsIgnoreCase("2"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                        if (gamble2 == (3) && (choice2.equalsIgnoreCase("3"))) {
                            JOptionPane.showMessageDialog(null, "You won 10 coins");
                            if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (!buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3NA + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3FB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (!buyBeer1.equalsIgnoreCase("Buy") && (!buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum1 + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            } else if (buyBeer0.equalsIgnoreCase("Buy") && (buyBeer1.equalsIgnoreCase("Buy") && (buyfood1.equalsIgnoreCase("Buy")))) {
                                int coinswon2 = randomNum3BB + 10;
                                JOptionPane.showMessageDialog(null, "You have " + coinswon2 + " coins");
                            }
                        }

                    }
                }
                System.exit(0);
        }






    }
}

