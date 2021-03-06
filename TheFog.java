import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;


public class TheFog extends Component implements KeyListener {

    private static int mana;
    private static JDialog frame;
    private static JLabel lbl;
    private static JTextField tf;
    private static JProgressBar pb;


    private JTextField atf;

    private JProgressBar apb;

    private static void mana1() {
        frame = new JDialog((Dialog) null, "BUILD MANA");
        lbl = new JLabel("Type M to build mana");
        tf = new JTextField("Type here", 6);
        tf.requestFocus();
        tf.addKeyListener(new TheFog());
        tf.grabFocus();
        tf.hasFocus();
        tf.requestFocusInWindow();
        frame.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                tf.requestFocusInWindow();
            }
        });
        pb = new JProgressBar(0, 100);
        pb.setPreferredSize(new Dimension(175, 20));
        pb.setString("MANA");
        pb.setStringPainted(true);
        pb.setValue(0);


        JPanel panel = new JPanel();
        panel.add(pb);
        panel.add(tf);
        panel.requestFocus();
        panel.grabFocus();
        panel.hasFocus();
        panel.requestFocusInWindow();
        panel.isFocusOwner();
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.CYAN.darker());
        frame.setLayout(new BorderLayout());
        frame.add(lbl, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        frame.getModalExclusionType();
        frame.setModal(true);
        frame.isModal();
        frame.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
        frame.getModalExclusionType();
        tf.requestFocus();
        tf.grabFocus();
        tf.hasFocus();
        tf.requestFocusInWindow();
        tf.requestFocusInWindow();
        frame.getFocusableWindowState();

        frame.setFocusableWindowState(true);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.requestFocusInWindow();
        frame.requestFocus();
        frame.hasFocus();
        frame.isAutoRequestFocus();
        frame.toFront();
        frame.setAlwaysOnTop(true);

        frame.isFocusable();
        tf.requestFocusInWindow();
        frame.setVisible(true);


    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {


    }

    @Override
    public void keyReleased(KeyEvent ke) {

        int keycode = ke.getKeyCode();

        if (keycode == KeyEvent.VK_M) {
            mana++;
            lbl.setText("Build mana to 20. " + "Mana " + mana);
            pb.setValue(mana * 5);
            if (mana >= 20) {
                frame.dispose();
            }
        }
    }


    
    public void actionPerformed(ActionEvent ae) {


    }




    private void createWindow() {


        JDialog aframe = new JDialog(SwingUtilities.windowForComponent(this), "BUILD MANA");
        JLabel albl = new JLabel("Type M to build mana");
        atf = new JTextField("Type here",6);
        atf.requestFocus();
        atf.grabFocus();
        atf.hasFocus();
        atf.requestFocusInWindow();
        atf.addKeyListener(this);
        aframe.addWindowListener(new WindowAdapter() {
            public void windowOpened( WindowEvent e ){
                atf.requestFocusInWindow();
            }
        } );
        apb = new JProgressBar(0,100);
        apb.setPreferredSize(new Dimension(175,20));
        apb.setString("MANA");
        apb.setStringPainted(true);
        apb.setValue(0);




        JPanel panel = new JPanel();
        panel.add(apb);
        panel.add(atf);
        panel.requestFocus();
        panel.grabFocus();
        panel.hasFocus();
        panel.requestFocusInWindow();
        panel.isFocusOwner();
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().setBackground(Color.CYAN.darker());
        frame.setLayout(new BorderLayout());
        frame.add(lbl, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        frame.getModalExclusionType();
        frame.setModal(true);
        frame.isModal();
        frame.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
        frame.getModalExclusionType();
        tf.requestFocus();
        tf.grabFocus();
        tf.hasFocus();
        tf.requestFocusInWindow();
        tf.requestFocusInWindow();
        frame.getFocusableWindowState();

        frame.setFocusableWindowState(true);
        frame.setFocusable(true);
        frame.setAutoRequestFocus(true);
        frame.requestFocusInWindow();
        frame.requestFocus();
        frame.hasFocus();
        frame.isAutoRequestFocus();
        frame.toFront();
        frame.setAlwaysOnTop(true);

        frame.isFocusable();
        tf.requestFocusInWindow();
        frame.setVisible(true);






          /*JPanel allFrame = new JPanel();
        JLabel alltext = new JLabel("Type M to build mana");
        JLabel textLabel = new JLabel("I'm a label in the window", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));

        allFrame.setVisible(true);

        allFrame.isFocusable();

        allFrame.hasFocus();
        allFrame.requestFocusInWindow();

        allFrame.setFocusable(true);

        allFrame.requestFocusInWindow();
        allFrame.requestFocus();
        allFrame.hasFocus();*/


    }













    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException
    {
        // TODO code application logic here


        Color myNewGreen = new Color ( 45, 150, 94);  //creates your new color
        ImageIcon icon1 = new ImageIcon(TheFog.class.getResource("fogicon.jpg"));

        UIManager.put("OptionPane.background", myNewGreen);
        UIManager.put("Panel.background", myNewGreen);
        UIManager.put("Button.background", Color.lightGray);
        UIManager.put("OptionPane.messageForeground", Color.cyan);


        URL url = TheFog.class.getClassLoader().getResource("creepy.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioIn);
        audioClip.start();

        Thread.sleep(3333);

        URL url1 = TheFog.class.getClassLoader().getResource("beat.wav");
        AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(url1);
        AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(url1);
        AudioFormat format1 = audioStream1.getFormat();
        DataLine.Info info1 = new DataLine.Info(Clip.class, format1);
        Clip audioClip1 = (Clip) AudioSystem.getLine(info1);
        audioClip1.open(audioIn1);
        audioClip1.start();



        ImageIcon iconFog = new ImageIcon(TheFog.class.getResource("fog.jpg"));
        JOptionPane.showMessageDialog(
                null,
                null,
                "The Fog", JOptionPane.INFORMATION_MESSAGE,
                iconFog);

        URL urlfog = TheFog.class.getClassLoader().getResource("thefog.wav");
        AudioInputStream audioStreamfog = AudioSystem.getAudioInputStream(urlfog);
        AudioFormat formatfog = audioStreamfog.getFormat();
        DataLine.Info infofog = new DataLine.Info(Clip.class, formatfog);
        Clip audioClipfog = (Clip) AudioSystem.getLine(infofog);
        audioClipfog.open(audioStreamfog);
        audioClipfog.loop(audioClipfog.LOOP_CONTINUOUSLY);

        System.out.println("defaultSound " + urlfog);  // check the URL!

        ImageIcon icon2 = new ImageIcon(TheFog.class.getResource("owl.png"));
        ImageIcon icon3 = new ImageIcon(TheFog.class.getResource("splash.jpg"));



        String name;


        do {
            name = (String) JOptionPane.showInputDialog(null, "What is your name chosen one?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
            if ((name == null)) {
                audioClipfog.stop();
                System.exit(0);
            }
        }
        while (name.equalsIgnoreCase(""));


        String s1 = name.substring(0, 1).toUpperCase();
        String capName = s1 + name.substring(1);


        URL url3 = TheFog.class.getClassLoader().getResource("51051897.wav");
        AudioInputStream audioIn3 = AudioSystem.getAudioInputStream(url3);
        AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(url3);
        AudioFormat format3 = audioStream3.getFormat();
        DataLine.Info info3 = new DataLine.Info(Clip.class, format3);
        Clip audioClip3 = (Clip) AudioSystem.getLine(info3);
        audioClip3.open(audioIn3);
        audioClip3.start();

        JOptionPane.showMessageDialog(null, "Hello " + capName + ". Welcome to The Fog!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "We are going on an adventure!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "This world is your choice.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "Lets get started!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "You are standing at the base of a hill. \nYou feel the wind on your face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

        ImageIcon iconFogH = new ImageIcon(TheFog.class.getResource("sxhill.jpg"));
        JOptionPane.showMessageDialog(
                null,
                null,
                "The Fog", JOptionPane.INFORMATION_MESSAGE,
                iconFogH);

        JOptionPane.showMessageDialog(null, "You see at your feet,\n" +
                "an AXE and a SWORD.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "You can only pick up one.\n" +
                " Which do you choose?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        String weapon1;


        do {
            weapon1 = (String) JOptionPane.showInputDialog(null, "AXE or SWORD?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
            if ((weapon1 == null)) {
                System.exit(0);
            }
        }
        while (!weapon1.equalsIgnoreCase("Axe") && !weapon1.equalsIgnoreCase("Sword"));


        if (weapon1.equalsIgnoreCase("Axe")) {

            URL url2 = TheFog.class.getClassLoader().getResource("axe.wav");
            AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(url2);
            AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(url2);
            AudioFormat format2 = audioStream2.getFormat();
            DataLine.Info info2 = new DataLine.Info(Clip.class, format2);
            Clip audioClip2 = (Clip) AudioSystem.getLine(info2);
            audioClip2.open(audioIn2);
            audioClip2.start();


            ImageIcon iconFogA = new ImageIcon(TheFog.class.getResource("axe.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "AXE",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
                    iconFogA);
            JOptionPane.showMessageDialog(null, "You lift the " + weapon1 + " of Øystein. \nYou feel the weight leave the axe\n" +
                    " and you can swing with ease!!!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "OK " + capName + " since you have the AXE you can smash through doors.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        } else if (weapon1.equalsIgnoreCase("Sword")) {


            URL url4 = TheFog.class.getClassLoader().getResource("sword.wav");
            AudioInputStream audioIn4 = AudioSystem.getAudioInputStream(url4);
            AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(url4);
            AudioFormat format4 = audioStream4.getFormat();
            DataLine.Info info4 = new DataLine.Info(Clip.class, format4);
            Clip audioClip4 = (Clip) AudioSystem.getLine(info4);
            audioClip4.open(audioIn4);
            audioClip4.start();


            ImageIcon iconFogS = new ImageIcon(TheFog.class.getResource("sword.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "SWORD",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
                    iconFogS);


            JOptionPane.showMessageDialog(null, "You lift the " + weapon1 + " of ALEXANDER above your head \n lightning crackles above you!!!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "OK " + capName + " since you have the SWORD you can light the way in the dark.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        }

        JOptionPane.showMessageDialog(null, "You hear the forest come to life.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
        JOptionPane.showMessageDialog(null, "An owl overhead screams and dives for a sprinting mouse.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


        URL urlhoot = TheFog.class.getClassLoader().getResource("hoot.wav");
        AudioInputStream audioInhoot = AudioSystem.getAudioInputStream(urlhoot);
        AudioInputStream audioStreamhoot = AudioSystem.getAudioInputStream(urlhoot);
        AudioFormat formathoot = audioStreamhoot.getFormat();
        DataLine.Info infohoot = new DataLine.Info(Clip.class, formathoot);
        Clip audioCliphoot = (Clip) AudioSystem.getLine(infohoot);
        audioCliphoot.open(audioInhoot);
        audioCliphoot.start();


        for (int i = 0; i < 2; i++) {
            // your code goes here


            JOptionPane msg = new JOptionPane("HOOT", JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION, icon2);
            final JDialog dlg = msg.createDialog("HOOT");
            dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            new Thread(() -> {
                try {
                    Thread.sleep(666);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dlg.setVisible(false);
            }).start();
            dlg.setVisible(true);
        }


        String direction1;


        do {
            direction1 = (String) JOptionPane.showInputDialog(null, "Lets go a direction. \n"
                    + "To the LEFT there is a swamp.\n"
                    + "To the RIGHT there is a long trail.\n"
                    + "The choice is yours!!!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

            if ((direction1 == null)) {
                audioClipfog.stop();
                System.exit(0);
            }


        }
        while (!direction1.equalsIgnoreCase("Left") && !direction1.equalsIgnoreCase("Right"));


        if (direction1.equalsIgnoreCase("Left")) {

            JOptionPane.showMessageDialog(null, "You trudge into the swamp.\n"
                    + "Your feet are soaked to the bone.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Farther, deeper you wade.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Bugs scatter over the waters surface.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Discovering a hut in the center of\n" +
                    "the swamp, you trip on a branch.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "As you wade deeper and deeper\n" +
                    "you approach the hermits hut.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Yelling out to the hut, a voice answers you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'Come to the door' the hermit calls to you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Knocking the mud off your boots you enter\n" +
                    "the hut at the hermits beckon.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Entering the hut you take a seat at the hermits table.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'Traveler you have many choices to make.' Says the hermit.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'Destroying the Winter Queen you will bring balance back to the habitat.\n This will restore the ecosystem of this region.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'Or you can become more powerful than you can imagine obtaining the Crystal Of Time.\nIt is so powerful nothing can stand before your might.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "This quest will be your choice.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "The hermit kindly offers you some bread and water.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You sit and eat the food with the hermit.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "Then the hermit fills your satchel with bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You feel full and ready to take on the adventure.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            String action1;
            do {
                action1 = (String) JOptionPane.showInputDialog(null, "Type THANKS to express gratitude", "The Fog", JOptionPane.QUESTION_MESSAGE, icon1, null, "");

                if ((action1 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }


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
            String actof;
            do {
                actof = (String) JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.", "The Fog", JOptionPane.QUESTION_MESSAGE, icon1, null, "");

                if ((actof == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }


            }
            while (!actof.equalsIgnoreCase("Kneel") && !actof.equalsIgnoreCase("Stand"));

            if (actof.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before the Winter Queen as she passes.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (actof.equalsIgnoreCase("Stand")) {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else {
                JOptionPane.showMessageDialog(null, "The soldier pushes you down to your knees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            JOptionPane.showMessageDialog(null, "The Winter Queen passes.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking the road becomes rocky.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A looming mountain stretches along the edge of the horizon.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            String direction1L;

            do {
                direction1L = (String) JOptionPane.showInputDialog(null, "You can go UP the mountain or LEFT to the sea", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");


                if ((direction1L == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }


            }
            while (!direction1L.equalsIgnoreCase("UP") && !direction1L.equalsIgnoreCase("Left"));


            if (direction1L.equalsIgnoreCase("Up")) {
                JOptionPane.showMessageDialog(null, "At the boulders base, you take a deep breath.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You catch your footing and start climbing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Reaching to grip a hold, you step up higher\n" +
                        " against the rock face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The wind pushes " + capName + " against the rock", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You are almost there", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String climb;
                do {
                    climb = (String) JOptionPane.showInputDialog(null, "Type CLIMB to pull to the top!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                    if ((climb == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }


                }
                while (!climb.equalsIgnoreCase("Climb"));


                JOptionPane.showMessageDialog(null, capName + " climbs to the top", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Peering out across the planes you see the ocean", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You start walking down the mountain", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Some rocks roll down the path with you", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You make it to the bottom of the mountain", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            if (direction1L.equalsIgnoreCase("Left")) {
                JOptionPane.showMessageDialog(null, "Veering off to the left you make your way down the stone path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking is hard on the stones.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The stones make you lose balance.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Carefully making your way along the trail moving on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking for some time you are still not at the mountain pass.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Finally you see the fracture in the mountain.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Heading into the fracture " + capName + " is cast into darkness.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Touching the side of the wall keeps you on the path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Some sunlight peeks from the exit.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Exiting the pass you smell the ocean.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Eventually you walk and there is no more stone path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The stones become sand, softening your step as you carry onward.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You feel wet sand as you walk towards the ocean.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking along the path you see a interesting plant.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "It smells sweet and fragrant.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Take some if you dare.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String plant;

                do {
                    plant = (String) JOptionPane.showInputDialog(null, "Type PLANT to snap off a piece or LEAVE it.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                    if ((plant == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }
                }
                while (!plant.equalsIgnoreCase("Plant") && (!plant.equalsIgnoreCase("Leave")));


                if (plant.equalsIgnoreCase("Plant")) {
                    JOptionPane.showMessageDialog(null, "You take a bit of plant.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (plant.equalsIgnoreCase("Leave")) {
                    JOptionPane.showMessageDialog(null, "Sparing the plant you leave it", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

                JOptionPane.showMessageDialog(null, "Walking further the ground is very soft", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            JOptionPane.showMessageDialog(null, "You keep walking until you find a stream.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You take a drink, its so refreshing", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Peering out of a bush is a wild dog", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The dog seems to be stuck on a vine", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String cut;
            do {
                cut = (String) JOptionPane.showInputDialog(null, "CUT the dog free.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((cut == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }


            }
            while (!cut.equalsIgnoreCase("Cut"));

            JOptionPane.showMessageDialog(null, "Using the " + weapon1 + " you CUT the dog free!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The dog wags its tail and barks 'bark.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String give;
            do {
                give = (String) JOptionPane.showInputDialog(null, "GIVE the dog some bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((give == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }


            }
            while (!give.equalsIgnoreCase("Give"));
            JOptionPane.showMessageDialog(null, "The dog gratefully eats the bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You now have a friend.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String doggo;
            do {
                doggo = (String) JOptionPane.showInputDialog(null, "Whats her name?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((doggo == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }


            while (doggo.equalsIgnoreCase(""));

            String s2 = doggo.substring(0, 1).toUpperCase();
            String capNameD = s2 + doggo.substring(1);
            JOptionPane.showMessageDialog(null, "Now " + capName + " and " + capNameD + " head along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " follows you towards the sea.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You finally see the beautiful water\n" +
                    "cresting on some rocks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            ImageIcon iconFogO = new ImageIcon(TheFog.class.getResource("ocean.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "OCEAN",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
                    iconFogO);

            JOptionPane.showMessageDialog(null, "Hearing a song you have heard before a mermaid\n" +
                    "is singing at the waters edge.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You stand for a moment listening.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You ask the mermaid 'What song was that?'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'It was WATER WAVES' she replies.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A fish splashes you!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            for (int i = 0; i < 2; i++) {
                // your code goes here


                JOptionPane msg = new JOptionPane("SPLASH", JOptionPane.WARNING_MESSAGE, JOptionPane.DEFAULT_OPTION, icon3);
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
            JOptionPane.showMessageDialog(null, capNameD + " looks up at you", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You pet " + capNameD + " and head right along the sea.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Kicking the sand along the way.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking up a sand dune you discover a beaten path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " follows you down the path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further you see a large rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "An explosion of fire licks the rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "An old wizard appears from the flames.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "He turns and points " + "'" + capName + "!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You are on a great quest are you not?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I am wizard'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I can create you a staff' says the wizard", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Remember this staff is your choice!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            String[] choices1 = {"Oak", "Maple", "Cherry", "Acacia", "Beech", "Pine"};
            String wood = (String) JOptionPane.showInputDialog(null, "Choose the wood", "WOOD TYPE", JOptionPane.QUESTION_MESSAGE, icon1, choices1, choices1[0]);

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
                cast = (String) JOptionPane.showInputDialog(null, "Type CAST to destroy the stump.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((cast == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

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
            JOptionPane.showMessageDialog(null, capNameD + " wags her tail and you continue on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Further and further from the sea you walk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further it becomes hard to walk with dense patches of grass.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " hops over a tuft of grass.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further you can walk easier as trees pop up around you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " runs way right in the trees and barks.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " is standing on a beaten path.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You pet her and start along the path", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking along it is very quiet in the woods.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " stops and listens.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Her body trembles and she starts sprinting.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You give chase and you see what she was running at.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "There was a man watching you from some trees.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " growls and corners the man.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You yell at the man, 'Who are you?!'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "He snarls, 'I come to deliver your soul to Dalrak", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You jump at the ready.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String attack;
            do {
                attack = (String) JOptionPane.showInputDialog(null, "CAST or ATTACK", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((attack == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

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
                    JOptionPane.showMessageDialog(null, capNameD + " howls and bites the man on the wrist.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (weapon1.equalsIgnoreCase("Sword")) {

                    JOptionPane.showMessageDialog(null, "Slashing with the sword you make contact\n" +
                            "with his hands, he drops his sword.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Kicking the sword against a tree the man attacks in return.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, capNameD + " howls and bites the man on the wrist.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "She pulls him to the ground and clamps down harder.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }
                JOptionPane.showMessageDialog(null, "The man whimpers 'You can't defeat me.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "'I'll never stop, You'll have to kill me.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }
            String attack0;
            do {
                attack0 = (String) JOptionPane.showInputDialog(null, "Finish him. CAST or ATTACK", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((attack0 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

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

            JOptionPane.showMessageDialog(null, "The man has been defeated!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Shaking off the fight you feel stronger.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, capNameD + " barks and you continue on the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking along the trail you start to see rocks along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Curiously there is a women's necklace sitting on a rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String necklace;

            do {
                necklace = (String) JOptionPane.showInputDialog(null, "Pick up the NECKLACE.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((necklace == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
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
                    "The glowing MOON with ethereal light that shines and protects the night.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "There is also a hieroglyph inscription", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            ImageIcon iconFoghi = new ImageIcon(TheFog.class.getResource("stone.gif"));
            JOptionPane.showMessageDialog(
                    null,
                    "Hieroglyph",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
                    iconFoghi);


            String stone;

            do {
                ImageIcon icon = new ImageIcon(TheFog.class.getResource("stone.gif"));
                stone = JOptionPane.showInputDialog(icon, "SUN or MOON");

                if ((stone == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

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
            String elementQ1 = "";
            if (elementQ.equalsIgnoreCase("I am looking for the crystal of time.")) {
                JOptionPane.showMessageDialog(null, "Øystein knows where the crystal of time is.\n" +
                        "I will take you to him now.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (elementQ.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                JOptionPane.showMessageDialog(null, "Øystein is a friend of the Winter Queen you will find no help here.\n" +
                        "I will take you to him but he will never help.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (elementQ.equalsIgnoreCase("It's not your business.")) {
                JOptionPane.showMessageDialog(null, "You must be on a quest with that cool staff of yours.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                String[] choicesQ1 = {"I am looking for the crystal of time.", "I am looking to destroy the Winter Queen."};

                elementQ1 = (String) JOptionPane.showInputDialog(null, "My business is",
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

            } else {
                System.exit(0);
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
                actof2 = (String) JOptionPane.showInputDialog(null, "KNEEL to show peonage or you can STAND.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                if ((actof2 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }
            while (!actof2.equalsIgnoreCase("Kneel") && !actof2.equalsIgnoreCase("Stand"));


            String quest = "";


            if (actof2.equalsIgnoreCase("Kneel")) {
                JOptionPane.showMessageDialog(null, "You kneel before Øystein.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "'Greetings friend!' Øystein bellows.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Axe")) {
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

                if (elementQ1.equalsIgnoreCase("I am looking for the crystal of time.")) {
                    JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "I know where the crystal of time is\n" +
                            "I will give you a map that will take \n you there even though I should not.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Øystein hands you a map, you put it in your satchel.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'The Crystal of Time is a powerful object you see.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'Take care when using it.' Øystein says.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    quest = "CrystalM";
                } else if (elementQ1.equalsIgnoreCase("I am looking to destroy the Winter Queen.")) {
                    JOptionPane.showMessageDialog(null, "'You are rude to my soldier!' Øystein snaps.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'And you want to destroy an ally of mine!' Øystein scorned.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "'You should be on your way, take your dog.'", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    quest = "Winter";

                }

            } else if (actof2.equalsIgnoreCase("Stand")) {
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


            if (quest.equalsIgnoreCase("CrystalM")) {
                JOptionPane.showMessageDialog(null, "A soldier takes you away, " + capNameD + " follows.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Winding around the halls of the fortress the soldier takes you to the exit.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Finally the exit is shown and you walk out thanking the soldier.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You reenter the lively forest, looking around you are not sure where to go.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Taking a look at the map you see that\n" +
                        "if you take the left trail you will be on the way.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking to the trail " + capNameD + " wags her tail and follows", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking you start to think about the quest at hand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Thinking of the toils ahead you grip the staff and the " + weapon1 + " tight.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Hungry you sit and eat the bread the hermit gave you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You share some bread with " + capNameD + ". She eats it happily and licks her lips.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Getting up you feel ready to continue.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking further down the trail you see some flowers.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            } else if (quest.equalsIgnoreCase("Crystal")) {
                JOptionPane.showMessageDialog(null, "crystal no map.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (quest.equalsIgnoreCase("Winter")) {
                JOptionPane.showMessageDialog(null, "winter quest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }


            System.exit(0);
        }

        if (direction1.equalsIgnoreCase("Right")) {
            JOptionPane.showMessageDialog(null, "You start along the long trail ahead of you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking forward you see something up ahead.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            String beer;
            do {
                beer = (String) JOptionPane.showInputDialog(null, "Sitting on the side of the trail\n" +
                        "you find an old camp along the road.\n" +
                        "Looking around you find 6 beers.\nHow many 0-6 do you want to drink?\n" +
                        "or save them?", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((beer == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

            }

            while (!beer.equalsIgnoreCase("0") && (!beer.equalsIgnoreCase("1") && (!beer.equalsIgnoreCase("2") && (!beer.equalsIgnoreCase("3")
                    && (!beer.equalsIgnoreCase("4") && (!beer.equalsIgnoreCase("5") && (!beer.equalsIgnoreCase("6"))))))));



            ImageIcon iconFogB = new ImageIcon(TheFog.class.getResource("beers.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "BEER",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
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
                JOptionPane.showMessageDialog(null, "BURRRRRPPPPP!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
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

            String clover;

            if (beer.equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(null, "You start walking down the long trail again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Looking down at a patch of grass there are some clovers growing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Right there in the patch is a four leaf clover.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                do {
                    clover = (String) JOptionPane.showInputDialog(null, "Pick up the CLOVER", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                    if ((clover == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }

                }
                while (!clover.equalsIgnoreCase("Clover"));

                JOptionPane.showMessageDialog(null, "Putting the clover in your pocket you save it for good luck.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Following the trail you can't see any signs of civilization yet.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            } else if (beer.equalsIgnoreCase("1") && beer.equalsIgnoreCase("2")) {
                JOptionPane.showMessageDialog(null, "You start walking down the long trail again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Smelling some great flowers you pause for a minute.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "A bee buzzes past you on its way to new pastures.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "A stream nearby flows along the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            } else if (beer.equalsIgnoreCase("3")) {
                JOptionPane.showMessageDialog(null, "You start walking down the long trail again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Feeling good you start making great time down the trail", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Hurrying along you step on an ant hill", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Taking off your shoe you empty it of ants", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Watching where you walk now you keep heading down the trail", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (beer.equalsIgnoreCase("4") || beer.equalsIgnoreCase("5")) {
                JOptionPane.showMessageDialog(null, "You start walking down the long trail again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Trying to follow the path you walk into the grass feeling drunk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Maneuvering yourself back onto the trail you gather yourself.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "A black snake slithers in front of you, you almost step on it!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Really trying to gather your senses you continue down the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (beer.equalsIgnoreCase("6")) {
                JOptionPane.showMessageDialog(null, "You start stumbling down the road feeling quite drunk.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Walking through the grass you find a stream.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Leaning in to take a drink to sober up " + capName + " falls in!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Pulling yourself up out of the stream soaking wet.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Dripping wet you stagger down the trail.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            }

            JOptionPane.showMessageDialog(null, "Some trees emerge along the trail you are heading into the forest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "Continuing on the sun is bright", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            JOptionPane.showMessageDialog(null, "You see a slight shine in the dirt.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);



            ImageIcon iconFogC = new ImageIcon(TheFog.class.getResource("coins.jpg"));
            JOptionPane.showMessageDialog(
                    null,
                    "COINS",
                    "The Fog", JOptionPane.INFORMATION_MESSAGE,
                    iconFogC);

            JOptionPane.showMessageDialog(null, "You dig up the shiny thing. \n It's " + allcoins + " gold piece!!! \n you are now a richer person!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking down the long trail you keep going.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "As " + capName + " continues down the long trail you see a bunny.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can kill the bunny with your " + weapon1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You will have the choice to attack the bunny, or hit enter to walk past.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String bunnyKill1;

            do {
                bunnyKill1 = (String) JOptionPane.showInputDialog(null, "Type KILL to attack or SPARE", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((bunnyKill1 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }
            while (!bunnyKill1.equalsIgnoreCase("Kill") && !bunnyKill1.equalsIgnoreCase("Spare"));

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


            ImageIcon iconFogDF = new ImageIcon(TheFog.class.getResource("sign.gif"));
            JOptionPane.showMessageDialog(null, "DEATHFALL", "The Fog", JOptionPane.INFORMATION_MESSAGE, iconFogDF);


            JOptionPane.showMessageDialog(null, "Walking into the town it feels like a dangerous place to be.\n" +
                    "Carefully you make your way through the town.\n" +
                    "A man bumps you and mumbles something as he walks past.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You make it to the tavern in the center of town.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "If you are thirsty and want to buy a beer you can.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String checkPocket1;

            do {
                checkPocket1 = (String) JOptionPane.showInputDialog(null, "Type CHECK to check your pocket for those coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((checkPocket1 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }
            while (!checkPocket1.equalsIgnoreCase("Check") && !checkPocket1.equalsIgnoreCase(""));

            if (checkPocket1.equalsIgnoreCase("Check")) {
                JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (checkPocket1.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Whatever.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }


            String buyBeer0;

            do {
                buyBeer0 = (String) JOptionPane.showInputDialog(null, "A beer is 3 coins.\n" +
                        "Type BUY and chug it!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((buyBeer0 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }
            while (!buyBeer0.equalsIgnoreCase("Buy") && !buyBeer0.equalsIgnoreCase(""));

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

                do {
                    buyBeer1 = (String) JOptionPane.showInputDialog(null, "Now buy a beer for 3 coins.\n" +
                            "Type BUY and chug it!", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                    if ((buyBeer1 == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }
                }
                while (!buyBeer1.equalsIgnoreCase("Buy") && !buyBeer1.equalsIgnoreCase(""));

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
                JOptionPane.showMessageDialog(null, "He falls to his knees.","The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
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
                JOptionPane.showMessageDialog(null, "You watch him look at you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
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

            do {
                buyfood1 = (String) JOptionPane.showInputDialog(null, "You can now BUY bread for 3 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((buyfood1 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }
            }
            while (!buyfood1.equalsIgnoreCase("Buy") && !buyfood1.equalsIgnoreCase(""));

            if (buyfood1.equalsIgnoreCase("Buy")) {
                allcoins = allcoins - 3;
                JOptionPane.showMessageDialog(null, "You chomp down on the bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You now have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            } else if (!buyfood1.equalsIgnoreCase("Buy")) {
                JOptionPane.showMessageDialog(null, "I guess you didn't want any bread.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }

            JOptionPane.showMessageDialog(null, capName + " you see a group playing a game.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can play with them and win 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Pick a number between 1-3.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            int gamble1 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            int gamble2 = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            String choice1;

            do {

                choice1 = (String) JOptionPane.showInputDialog(null, "Pick 1-3 or hit enter.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((choice1 == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

            }
            while (!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("3") && !choice1.equals(""));


            if (choice1.equalsIgnoreCase("1") || choice1.equalsIgnoreCase("2") || choice1.equalsIgnoreCase("3")) {

                JOptionPane.showMessageDialog(null, "The number was " + gamble1 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                if (gamble1 == (1) && choice1.equalsIgnoreCase("1")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else if (gamble1 == (2) && choice1.equalsIgnoreCase("2")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (gamble1 == (3) && choice1.equalsIgnoreCase("3")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else {
                    allcoins = allcoins - 5;
                    JOptionPane.showMessageDialog(null, "You lost 5 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

                String choice2;

                do {

                    choice2 = (String) JOptionPane.showInputDialog(null, "Again pick 1-3 or hit enter.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                    if ((choice2 == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }
                }
                while (!choice2.equals("1") && !choice2.equals("2") && !choice2.equals("3") && !choice2.equals(""));

                JOptionPane.showMessageDialog(null, "The number was " + gamble2 + ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                if (gamble2 == (1) && choice2.equalsIgnoreCase("1")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else if (gamble2 == (2) && choice2.equalsIgnoreCase("2")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (gamble2 == (3) && choice2.equalsIgnoreCase("3")) {
                    allcoins = allcoins + 10;
                    JOptionPane.showMessageDialog(null, "You won 10 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                } else if (choice2.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "I guess you don't want to play again.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                } else {
                    allcoins = allcoins - 5;
                    JOptionPane.showMessageDialog(null, "You lost 5 coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "You have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                }
            } else {
                JOptionPane.showMessageDialog(null, "I guess you don't want to play.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            JOptionPane.showMessageDialog(null, "Feeling like you've over stayed your welcome you leave the tavern.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking through town there are few people on the street.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Finding a hunters shack you enter interested.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Inside you find a man sharpening a large knife.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'I got a fishing rod and a bow for sale.' Says the hunter.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "'They are on sale for 40 coins each' says the hunter.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            String hunt;
            do {
                hunt = (String) JOptionPane.showInputDialog(null, "Do you want the BOW or the ROD", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");
                if ((hunt == null)) {
                    audioClipfog.stop();
                    System.exit(0);
                }

            }
            while (!hunt.equalsIgnoreCase("Bow") && !hunt.equalsIgnoreCase("Rod"));

            if (hunt.equalsIgnoreCase("Bow")) {
                allcoins = allcoins - 40;
                JOptionPane.showMessageDialog(null, "Buying the bow you now have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            } else if (hunt.equalsIgnoreCase("Rod")) {
                allcoins = allcoins - 40;
                JOptionPane.showMessageDialog(null, "Buying the fishing rod you now have " + allcoins + " coins.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }

            JOptionPane.showMessageDialog(null, "Thanking the hunter you admire your purchase.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Making your way out of the shack you wave to the hunter.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Outside it is quiet in the streets.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "A woman holding food goods enters her home and locks the door.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking further you start getting to the outskirts of Deathfall.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Further you walk and now begin to enter the dense forest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Traveling though the forest there is a dense fog.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You can barely see in front of you.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Wandering though the fog you feel your way though.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The fog does not dissipate, you continue to feel your way though the forest.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Swearing you were just here you are lost and wondering.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            if (weapon1.equalsIgnoreCase("Sword")){
                JOptionPane.showMessageDialog(null, "You lift the sword up to cast light.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "The fog swirls around the sword dampening the light.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            }


            String wanderfog0;
            String wanderfogL;
            String wanderfogLL;
            String wanderfogLF;
            String wanderfogLR;
            String wanderfogR;
            String wanderfogRR;
            String wanderfogRL;
            String wanderfogRF;
            String wanderfogF;
            String wanderfogFF;
            String wanderfogFL;
            String wanderfogFR = "";
            do {
                do {
                    wanderfog0 = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                            "You have to make a choice on where to walk next.\n" +
                            "LEFT\n" +
                            "RIGHT\n" +
                            "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                    if ((wanderfog0 == null)) {
                        audioClipfog.stop();
                        System.exit(0);
                    }
                }
                while (!wanderfog0.equalsIgnoreCase("Left") && !wanderfog0.equalsIgnoreCase("Right") && !wanderfog0.equalsIgnoreCase("Forward"));

                if (wanderfog0.equalsIgnoreCase("Left")) {
                    JOptionPane.showMessageDialog(null, "Crushing a mushroom you find a new spot to stand", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    do {
                        wanderfogL = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                "You have to make a choice again on where to walk next.\n" +
                                "LEFT\n" +
                                "RIGHT\n" +
                                "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                        if ((wanderfogL == null)) {
                            audioClipfog.stop();
                            System.exit(0);
                        }
                    }
                    while (!wanderfogL.equalsIgnoreCase("Left") && !wanderfogL.equalsIgnoreCase("Right") && !wanderfogL.equalsIgnoreCase("Forward"));
                    if (wanderfogL.equalsIgnoreCase("Left")) {
                        JOptionPane.showMessageDialog(null, "A mouse scurries across your feet you feel lost.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogLL = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogLL == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogLL.equalsIgnoreCase("Left") && !wanderfogLL.equalsIgnoreCase("Right") && !wanderfogLL.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    } else if (wanderfogL.equalsIgnoreCase("Right")) {
                        JOptionPane.showMessageDialog(null, "You step into a spider web, shaking off the web you still see nothing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogLR = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogLR == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogLR.equalsIgnoreCase("Left") && !wanderfogLR.equalsIgnoreCase("Right") && !wanderfogLR.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    } else if (wanderfogL.equalsIgnoreCase("Forward")) {
                        JOptionPane.showMessageDialog(null, "A burned tree is looming overhead.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogLF = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogLF == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogLF.equalsIgnoreCase("Left") && !wanderfogLF.equalsIgnoreCase("Right") && !wanderfogLF.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    }


                } else if (wanderfog0.equalsIgnoreCase("Right")) {
                    JOptionPane.showMessageDialog(null, "A wolf howls in the distance.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                    do {
                        wanderfogR = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                "You have to make a choice again on where to walk next.\n" +
                                "LEFT\n" +
                                "RIGHT\n" +
                                "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                        if ((wanderfogR == null)) {
                            audioClipfog.stop();
                            System.exit(0);
                        }
                    }
                    while (!wanderfogR.equalsIgnoreCase("Left") && !wanderfogR.equalsIgnoreCase("Right") && !wanderfogR.equalsIgnoreCase("Forward"));

                    if (wanderfogR.equalsIgnoreCase("Right")) {
                        JOptionPane.showMessageDialog(null, "Centipedes crawl from a tree stump.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogRR = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogRR == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogRR.equalsIgnoreCase("Left") && !wanderfogRR.equalsIgnoreCase("Right") && !wanderfogRR.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    } else if (wanderfogR.equalsIgnoreCase("Forward")) {
                        JOptionPane.showMessageDialog(null, "Thorns grab at you and tear at your skin.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogRF = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogRF == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogRF.equalsIgnoreCase("Left") && !wanderfogRF.equalsIgnoreCase("Right") && !wanderfogRF.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    } else if (wanderfogR.equalsIgnoreCase("Left")) {
                        JOptionPane.showMessageDialog(null, "Sickening smells are coming from a large deer carcass nearby.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogRL = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogRL == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogRL.equalsIgnoreCase("Left") && !wanderfogRL.equalsIgnoreCase("Right") && !wanderfogRL.equalsIgnoreCase("Forward"));

                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    }

                }
                else if (wanderfog0.equalsIgnoreCase("Forward")) {
                    JOptionPane.showMessageDialog(null, "Walking a bit you find a broken sign on the ground that reads.\n" +
                            "'SIEGE'. But it doesn't help you find your way out", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    do {
                        wanderfogF = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                "You have to make a choice again on where to walk next.\n" +
                                "LEFT\n" +
                                "RIGHT\n" +
                                "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                        if ((wanderfogF == null)) {
                            audioClipfog.stop();
                            System.exit(0);
                        }
                    }
                    while (!wanderfogF.equalsIgnoreCase("Left") && !wanderfogF.equalsIgnoreCase("Right") && !wanderfogF.equalsIgnoreCase("Forward"));
                    if (wanderfogF.equalsIgnoreCase("Right")) {
                        JOptionPane.showMessageDialog(null, "Carefully stepping to the right you find the post that the sign was on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogFR = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogFR == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogFR.equalsIgnoreCase("Left") && !wanderfogFR.equalsIgnoreCase("Right") && !wanderfogFR.equalsIgnoreCase("Forward"));
                        if (wanderfogFR.equalsIgnoreCase("Right")){
                            JOptionPane.showMessageDialog(null, "As you step to the right the sun pops out though the dark fog above.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        }
                        else if (wanderfogFR.equalsIgnoreCase("Left")){
                            JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        }
                        else if (wanderfogFR.equalsIgnoreCase("Forward")){
                            JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        }

                    }
                    else if (wanderfogF.equalsIgnoreCase("Forward")) {
                        JOptionPane.showMessageDialog(null, "Walking forward you hit you head on a branch.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

                        do {
                            wanderfogFF = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogFF == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogFF.equalsIgnoreCase("Left") && !wanderfogFF.equalsIgnoreCase("Right") && !wanderfogFF.equalsIgnoreCase("Forward"));
                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    }
                    else if (wanderfogF.equalsIgnoreCase("Left")) {
                        JOptionPane.showMessageDialog(null, "Shifting to the left you get caught in a huge spiderweb.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                        do {
                            wanderfogFL = (String) JOptionPane.showInputDialog(null, "The fog is so thick you are lost standing in the forest.\n" +
                                    "You have to make a choice once again on where to walk next.\n" +
                                    "LEFT\n" +
                                    "RIGHT\n" +
                                    "Forward", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1, null, "");

                            if ((wanderfogFL == null)) {
                                audioClipfog.stop();
                                System.exit(0);
                            }
                        }
                        while (!wanderfogFL.equalsIgnoreCase("Left") && !wanderfogFL.equalsIgnoreCase("Right") && !wanderfogFL.equalsIgnoreCase("Forward"));
                        JOptionPane.showMessageDialog(null, "YOU ARE LOST.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    }
                }
            }
            while(!wanderfogFR.equalsIgnoreCase("Right"));

            JOptionPane.showMessageDialog(null, "Running towards the sun you can now see the trail onward.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Wiping the moisture off your brow you trudge on.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Walking along the leaves crunch under your feet.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "The landscape starts a downhill decent.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Keeping along the trail you keep the pace up.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Suddenly an arrow pierces the tree you were passing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You quickly put your back to another tree and listen.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You hear nothing, your heart is pounding.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You sneak a peek out and another arrow passes your head inches away.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You take a dive for a large rock.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Rolling in the dirt you grip the " + weapon1 + " tightly.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "You try to listen again but hear nothing.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            JOptionPane.showMessageDialog(null, "Sticking out your " + weapon1 + "to draw fire another arrow hits it", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);

            if (hunt.equalsIgnoreCase("Bow")){
                JOptionPane.showMessageDialog(null, "Grabbing the arrow from the ground the feathers are torn on it.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Running for more cover, the embankment has a place to stand.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "You nock the arrow and pull the bow string back.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Peeking out you see the figure running across the hillside.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                JOptionPane.showMessageDialog(null, "Your fingers release the arrow, It flies and misses the figure.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
            }
            if (hunt.equalsIgnoreCase("Rod")){
                JOptionPane.showMessageDialog(null, "Breathing hard you rush toward an embankment.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                if (weapon1.equalsIgnoreCase("Sword")){
                    JOptionPane.showMessageDialog(null, "You lift the sword up to a beam of light.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Light flashes and you bend the light towards the attacker.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "The attacker is blinded and covers their face.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Jumping up and rushing the hill.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

                if (weapon1.equalsIgnoreCase("Axe")){
                    JOptionPane.showMessageDialog(null, "Frustrated, sweat is beading off your forehead.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "Jumping up with the axe covering your chest an arrow impacts and deflects.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                    JOptionPane.showMessageDialog(null, "As the attacking figure is reaching for another arrow you rush.", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);
                }

            }
            JOptionPane.showMessageDialog(null, ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);




            JOptionPane.showMessageDialog(null, ".", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            JOptionPane.showMessageDialog(null, "start boss fight", "The Fog", JOptionPane.INFORMATION_MESSAGE, icon1);


            /*String death = "";
            do {


                JOptionPane optionPane = new JOptionPane("Do you want to attack?", JOptionPane.QUESTION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);


                JDialog dialog = optionPane.createDialog("Select Yes");
                dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

                Timer timer = new Timer(1000, e -> dialog.setVisible(false));
                timer.setRepeats(false);
                timer.start();

                dialog.setVisible(true);

                if (optionPane.getValue() instanceof Integer) {
                    int option = (Integer) optionPane.getValue();

                    if (option == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "You strike at the dragon", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Alive";

                    } else if (option == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "You get hit", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Death";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You got hit.", "The Fog", INFORMATION_MESSAGE, icon1);
                    death = "Death";
                }
            }

            while (!death.equalsIgnoreCase("Alive"));


            do {


                JOptionPane optionPane = new JOptionPane("Do you want to attack?", JOptionPane.QUESTION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);


                JDialog dialog = optionPane.createDialog("Select Yes");
                dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

                Timer timer = new Timer(1000, e -> dialog.setVisible(false));
                timer.setRepeats(false);
                timer.start();

                dialog.setVisible(true);

                if (optionPane.getValue() instanceof Integer) {
                    int option = (Integer) optionPane.getValue();

                    if (option == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "You strike at the dragon", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Alive";

                    } else if (option == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "You get hit", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Death";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You got hit.", "The Fog", INFORMATION_MESSAGE, icon1);
                    death = "Death";
                }
            }

            while (!death.equalsIgnoreCase("Alive"));


            do {


                JOptionPane optionPane = new JOptionPane("Do you want to attack?", JOptionPane.QUESTION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);


                JDialog dialog = optionPane.createDialog("Select Yes");
                dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

                Timer timer = new Timer(1000, e -> dialog.setVisible(false));
                timer.setRepeats(false);
                timer.start();

                dialog.setVisible(true);

                if (optionPane.getValue() instanceof Integer) {
                    int option = (Integer) optionPane.getValue();

                    if (option == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "You strike at the dragon", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Alive";

                    } else if (option == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "You get hit", "The Fog", INFORMATION_MESSAGE, icon1);
                        death = "Death";
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You got hit.", "The Fog", INFORMATION_MESSAGE, icon1);
                    death = "Death";
                }
            }

            while (!death.equalsIgnoreCase("Alive"));


            JOptionPane.showMessageDialog(null, "You defeated the dragon.", "The Fog", INFORMATION_MESSAGE, icon1);*/


        }
        System.exit(0);


    }
}

