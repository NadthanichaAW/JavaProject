/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgame;

import animatefx.animation.JackInTheBox;

import java.awt.FontFormatException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author beaut
 */
public class FXMLGameController implements Initializable {

    @FXML
    private AnchorPane menu, multiplePlayer, howToPlay, NamePlayer;
    @FXML
    private Button PlayMuti, btn_standmutiple, btn_Hitmutiple, btn_go;
    @FXML
    private ImageView firstcard1, firstcard2, cardplayer1_2, card1_1, card2_1, card2_2, card1_3, card2_3, card1_4, card1_5;
    @FXML
    private ImageView card2_4, card2_5;
    @FXML
    private ImageView im1, im2, im3, im4, im5, im6;
    @FXML
    private ImageView im1_1, im1_2, im1_3, im1_4, im1_5, im1_6;
    @FXML
    private ImageView imx1_3, im2_3, im3_3, im4_3, im5_3, im6_3, imscore, cardR_menu, crownWinner, btn_Sound;
    @FXML
    private Button btn_nextplayer, btn_nextround, btn_Menu;
    @FXML
    private TextField namePlayer1, namePlayer2;
    @FXML
    private RadioButton btn_card1, btn_card2, btn_card3;
    @FXML
    private Text textShowscore1, textShowscore2, textNameEnd1, textNameEnd2, textScoreDown1, textScoreDown2, textTime;
    @FXML
    private Text textWin, textplay, textnoplay, textplayer, textBJ, textround, textscorep1, textscorep2;

    
    private String[] name = new String[10];
    private int[] deck = new int[10];
    private Media soundClick;
    private MediaPlayer mediaPlay;
    private boolean player1;
    private boolean player2;
    private boolean cardp1_3 = false;
    private boolean cardp1_4 = false;
    private boolean cardp1_5 = false;
    private boolean cardp2_3 = false;
    private boolean cardp2_4 = false;
    private boolean cardp2_5 = false;
    private boolean standplayer1 = false;
    private boolean standplayer2 = false;
    private boolean sound = true;
    private int round = 1;
    private int countp1 = 2;
    private int countp2 = 2;
    private int countimage = 4;
    private boolean closeCard = false;
    private int yourCard = 0;
    private int sum1 = 0;
    private int sum2 = 0;
    private int score1 = 0;
    private int score2 = 0;
    private ArrayList<Integer> p1 = new ArrayList<>();
    private ArrayList<Integer> p2 = new ArrayList<>();
    private Random r = new Random();
    private Image[] image = new Image[10];
    private DeckOfCard card2 = new DeckOfCard();
    private DeckOfCard card = new DeckOfCard();
    private Player player = new Player();
    private TranslateTransition TCplayer2_back = new TranslateTransition();
    private TranslateTransition TCplayer2_1 = new TranslateTransition();
    private TranslateTransition TCplayer2_2 = new TranslateTransition();
    private TranslateTransition TCplayer1_back = new TranslateTransition();
    private TranslateTransition TCplayer1_1 = new TranslateTransition();
    private TranslateTransition TCplayer1_2 = new TranslateTransition();
    private TranslateTransition TCplayer1_3 = new TranslateTransition();
    private TranslateTransition TCplayer1_4 = new TranslateTransition();
    private TranslateTransition TCplayer1_5 = new TranslateTransition();
    private TranslateTransition TCplayer2_3 = new TranslateTransition();
    private TranslateTransition TCplayer2_4 = new TranslateTransition();
    private TranslateTransition TCplayer2_5 = new TranslateTransition();
    private TranslateTransition T = new TranslateTransition();
    private FadeTransition fade = new FadeTransition();
    private FadeTransition fadename = new FadeTransition();
    private Path TCplayer2_2P = new Path();
    private Path TCplayer1_2P = new Path();

    private PathTransition TCplayer2_2PT = new PathTransition();
    private PathTransition TCplayer1_2PT = new PathTransition();

    private JackInTheBox jack = new JackInTheBox();
    private ScaleTransition scaleTran = new ScaleTransition();
    private ScaleTransition scaleTran2 = new ScaleTransition();
    private ScaleTransition scaleTran3 = new ScaleTransition();
    private ScaleTransition scaleTran4 = new ScaleTransition();
    private ScaleTransition scaleTran5 = new ScaleTransition();
    private ScaleTransition scaleTran6 = new ScaleTransition();
    private ScaleTransition scaleTran7 = new ScaleTransition();
    private ScaleTransition scaleTran8 = new ScaleTransition();
    private ScaleTransition scaleTran9 = new ScaleTransition();
    private ScaleTransition scaleTran10 = new ScaleTransition();
    private ScaleTransition scaleTran11 = new ScaleTransition();
    private ScaleTransition scaleTran12 = new ScaleTransition();

    @FXML
    private ImageView fristcard1;
    @FXML
    private Text textplayer11;
    @FXML
    private Button btn_howtoplay;
    @FXML
    private Button btn_Mutiplayer;
    @FXML
    private Rectangle rectPath;

    public void animation() {

        RotateTransition RC = new RotateTransition();
        RotateTransition RC2 = new RotateTransition();
        Path path = new Path();
        Path path2 = new Path();
        Glow glow = new Glow();        
        GaussianBlur blur = new GaussianBlur();                
        PathTransition pathTransition = new PathTransition();
        PathTransition pathTransition2 = new PathTransition();
        cardR_menu.setImage(new Image("/card2/1.png"));
                   
        RC.setNode(cardR_menu);
        RC.setAxis(Rotate.Y_AXIS);
        RC.setFromAngle(0);
        RC.setToAngle(30);
        RC.setInterpolator(Interpolator.LINEAR);
        RC.setDuration(Duration.millis(1000));
        RC.setCycleCount(100);
        RC.setAutoReverse(true);
        RC.play();

        pathTransition.setNode(cardR_menu);
        pathTransition.setPath(path);
        path.getElements().add(new MoveTo(20, 20));
        path.getElements().add(new LineTo(20, -20));
        pathTransition.setDuration(Duration.valueOf("800ms"));
        pathTransition.setCycleCount(100);
        pathTransition.setAutoReverse(true);
        pathTransition.play();
        
        rectPath.setEffect(glow);
        rectPath.setEffect(blur);
        rectPath.setFill(Color.LIGHTYELLOW);
        RC2.setNode(rectPath);
        RC2.setAxis(Rotate.Y_AXIS);
        RC2.setFromAngle(0);
        RC2.setToAngle(30);
        RC2.setInterpolator(Interpolator.LINEAR);       
        RC2.setDuration(Duration.millis(1000));
        RC2.setCycleCount(100);
        RC2.setAutoReverse(true);
        RC2.play();       
        pathTransition2.setNode(rectPath);
        pathTransition2.setPath(path2);
        path2.getElements().add(new MoveTo(20,20));
        path2.getElements().add(new LineTo(20,-20));                 
        pathTransition2.setDuration(Duration.valueOf("800ms"));               
        pathTransition2.setCycleCount(100);
        pathTransition2.setAutoReverse(true);
        pathTransition2.play();        
        
    }

    public void ResetPlayer() {
        yourCard = 0;
        round = 1;
        score1 = 0;
        score2 = 0;
        imscore.setImage(null);
        textround.setText(null);
        textscorep1.setText(null);
        textscorep2.setText(null);
        textShowscore1.setText(null);
        textShowscore2.setText(null);
        btn_card1.relocate(369, 424);
        btn_card2.relocate(584, 424);
        btn_card3.relocate(807, 424);
        btn_card1.setSelected(false);
        btn_card2.setSelected(false);
        btn_card3.setSelected(false);
        btn_nextround.relocate(-807, 424);
        btn_Menu.relocate(-807, 424);
        crownWinner.setImage(null);
        textWin.setText(null);
        textNameEnd1.setText(null);
        textNameEnd2.setText(null);
        textScoreDown1.setText(null);
        textScoreDown2.setText(null);
        cardplayer1_2.setImage(null);
        card1_1.setImage(null);
        card2_1.setImage(null);
        card2_2.setImage(null);
        namePlayer1.clear();
        namePlayer2.clear();
        im6.relocate(542, 247);
        im5.relocate(544, 247);
        im4.relocate(549, 247);
        im3.relocate(554, 247);
        im2.relocate(559, 247);
        im1.relocate(564, 247);
        im1_6.relocate(351, 247);
        im1_5.relocate(343, 247);
        im1_4.relocate(338, 247);
        im1_3.relocate(333, 247);
        im1_2.relocate(326, 247);
        im1_1.relocate(319, 247);
        im6_3.relocate(773, 247);
        im5_3.relocate(770, 247);
        im4_3.relocate(767, 247);
        im3_3.relocate(764, 247);
        im2_3.relocate(761, 247);
        imx1_3.relocate(758, 247);
        textBJ.setText("Twenty One Times Lucky");
    }

    public void setDeck() {
        DeckOfCard newDeck = new DeckOfCard();
        deck = newDeck.ran();
        sum1 = deck[2] + deck[0];
        sum2 = deck[3] + deck[1];
        name = newDeck.nameImage(yourCard);
        for (int i = 0; i < 10; i++) {
            image[i] = new Image(name[i]);
        }
    }
    
    public void soundEffectsClick(){
        String path  = "mouse_click_3.mp3";
        soundClick = new Media(getClass().getResource(path).toExternalForm());
        mediaPlay = new MediaPlayer(soundClick);
        mediaPlay.play();
    } 

    public void reSet() {
        player1 = false;
        player2 = false;
        System.out.println(yourCard);
        switch (yourCard) {
            case 1 -> {
                Image imageback = new Image("/card1/BACK2.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            case 2 -> {
                Image imageback = new Image("/card2/back.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            case 3 -> {
                Image imageback = new Image("/card3/back.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            default -> {
            }
        }
        card1_1.setImage(null);
        cardplayer1_2.setImage(null);
        card1_3.setImage(null);
        card1_4.setImage(null);
        card1_5.setImage(null);
        card2_3.setImage(null);
        card2_1.setImage(null);
        card2_2.setImage(null);
        card2_3.setImage(null);
        card2_4.setImage(null);
        card2_5.setImage(null);
        cardp1_3 = false;
        cardp1_4 = false;
        cardp1_5 = false;
        cardp2_3 = false;
        cardp2_4 = false;
        cardp2_5 = false;
        standplayer1 = false;
        standplayer2 = false;
        closeCard = false;
        countp1 = 2;
        countp2 = 2;
        countimage = 4;
        p1.clear();
        p2.clear();
    }

    public void play() {
        switch (yourCard) {
            case 2 -> {
                im6.relocate(960, 223);
                im5.relocate(965, 223);
                im4.relocate(970, 223);
                im3.relocate(974, 223);
                im2.relocate(978, 223);
                im1.relocate(982, 223);
                im1_6.relocate(-960, 223);
                im1_5.relocate(-965, 223);
                im1_4.relocate(-970, 223);
                im1_3.relocate(-974, 223);
                im1_2.relocate(-978, 223);
                im1_1.relocate(-982, 223);
                im6_3.relocate(-960, 223);
                im5_3.relocate(-965, 223);
                im4_3.relocate(-970, 223);
                im3_3.relocate(-974, 223);
                im2_3.relocate(-978, 223);
                imx1_3.relocate(-982, 223);
            }
            case 1 -> {
                im1_6.relocate(960, 223);
                im1_5.relocate(965, 223);
                im1_4.relocate(970, 223);
                im1_3.relocate(974, 223);
                im1_2.relocate(978, 223);
                im1_1.relocate(982, 223);
                im6_3.relocate(-960, 223);
                im5_3.relocate(-965, 223);
                im4_3.relocate(-970, 223);
                im3_3.relocate(-974, 223);
                im2_3.relocate(-978, 223);
                imx1_3.relocate(-982, 223);
                im6.relocate(-960, 223);
                im5.relocate(-965, 223);
                im4.relocate(-970, 223);
                im3.relocate(-974, 223);
                im2.relocate(-978, 223);
                im1.relocate(-982, 223);
            }
            case 3 -> {
                im6_3.relocate(960, 223);
                im5_3.relocate(965, 223);
                im4_3.relocate(970, 223);
                im3_3.relocate(974, 223);
                im2_3.relocate(978, 223);
                imx1_3.relocate(982, 223);
                im1_6.relocate(-960, 223);
                im1_5.relocate(-965, 223);
                im1_4.relocate(-970, 223);
                im1_3.relocate(-974, 223);
                im1_2.relocate(-978, 223);
                im1_1.relocate(-982, 223);
                im6.relocate(-960, 223);
                im5.relocate(-965, 223);
                im4.relocate(-970, 223);
                im3.relocate(-974, 223);
                im2.relocate(-978, 223);
                im1.relocate(-982, 223);
            }
            default -> {
            }
        }
        textround.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 46");
        textNameEnd2.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 26");
        textplayer.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 28");
        textscorep1.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 42");
        textscorep2.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 42");
        textShowscore1.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 50");
        textNameEnd1.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 26");
        textplay.setStyle("-fx-font-family: Forte Regular; -fx-font-size: 33");
        btn_standmutiple.relocate(977, 417);
        btn_Hitmutiple.relocate(977, 461);
        btn_nextplayer.relocate(965, 285);
        btn_Menu.relocate(965, 285);
        btn_card1.relocate(55, 105);
        btn_card2.relocate(55, 105);
        btn_card3.relocate(55, 105);
        textBJ.relocate(-1000, 400);
        imscore.setImage(new Image("/JavaFXGAME/images/score2.png"));

        RotateTransition RCplayer1_back = new RotateTransition();
        RotateTransition RCplayer1_1 = new RotateTransition();
        RotateTransition RCplayer2_back = new RotateTransition();
        RotateTransition RCplayer2_1 = new RotateTransition();

        RCplayer2_back.setNode(firstcard2);
        RCplayer2_back.setDuration(Duration.millis(800));
        RCplayer2_back.setByAngle(360);
        RCplayer2_back.play();

        RCplayer2_1.setNode(card2_1);
        RCplayer2_1.setDuration(Duration.millis(800));
        RCplayer2_1.setByAngle(360);
        RCplayer2_1.play();

        RCplayer1_back.setNode(firstcard1);
        RCplayer1_back.setDuration(Duration.millis(800));
        RCplayer1_back.setByAngle(360);
        RCplayer1_back.play();

        RCplayer1_1.setNode(card1_1);
        RCplayer1_1.setDuration(Duration.millis(800));
        RCplayer1_1.setByAngle(360);
        RCplayer1_1.play();

        textround.setText("Round " + round);

        player.setNamePlayer1(namePlayer2.getText());
        player.setNamePlayer2(namePlayer1.getText());

        textscorep1.setText(player.getNamePlayer1());
        textscorep2.setText(player.getNamePlayer2());
        textShowscore1.setText(": " + score1);
        textShowscore2.setText(": " + score2);
        System.out.println("card = " + yourCard);
        switch (yourCard) {
            case 1 -> {
                Image imageback = new Image("/card1/BACK2.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            case 2 -> {
                Image imageback = new Image("/card2/back.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            case 3 -> {
                Image imageback = new Image("/card3/back.png");
                firstcard1.setImage(imageback);
                firstcard2.setImage(imageback);
            }
            default -> {
            }
        }
        card1_1.setImage(image[0]);
        cardplayer1_2.setImage(image[2]);
        card2_1.setImage(image[1]);
        card2_2.setImage(image[3]);

        if (deck[2] > deck[3]) {
            player1 = true;
            closeCard = true;
            p1.add(deck[0]);
            p1.add(deck[2]);
            p2.add(deck[1]);
            p2.add(deck[3]);

            fadename.setDuration(Duration.millis(8000));
            fadename.setNode(textplayer);
            fadename.setFromValue(0);
            fadename.setToValue(1);
            fadename.play();
            
            textplayer.setText(namePlayer1.getText());
            System.out.println("player 1 = " + player1 + ",player 2 = " + player2);
            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);

            fade.setDuration(Duration.millis(10000));
            fade.setNode(textnoplay);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();

            TCplayer2_back.setNode(firstcard2);
            TCplayer2_back.setDuration(Duration.millis(300));
            TCplayer2_back.setDelay(Duration.millis(3000));
            TCplayer2_back.setToY(-250);//up 
            TCplayer2_back.setToX(150);
            TCplayer2_back.play();

            TCplayer2_1.setNode(card2_1);
            TCplayer2_1.setDuration(Duration.millis(300));
            TCplayer2_1.setDelay(Duration.millis(3000));
            TCplayer2_1.setToY(-250);
            TCplayer2_1.setToX(150);
            TCplayer2_1.play();

            jack.setNode(card2_2);
            TCplayer2_2PT.setNode(card2_2);
            TCplayer2_2PT.setPath(TCplayer2_2P);
            TCplayer2_2.setNode(card2_2);
            scaleTran.setNode(card2_2);
            TCplayer2_2P.getElements().add(new MoveTo(960, 223));
            TCplayer2_2P.getElements().add(new CubicCurveTo(960, -100, 360, -100, 77, 110));//(pointstart,pointstart,theekhong-x,theekhong-y,left-right[point2],up-down[point2])
            TCplayer2_2PT.setDelay(Duration.ONE);
            jack.setDelay(Duration.ONE);
            TCplayer2_2.setDelay(Duration.valueOf("3000ms"));
            scaleTran.setDelay(Duration.valueOf("3000ms"));
            scaleTran.setToX(0.6);
            scaleTran.setToY(0.6);

            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDelay(Duration.valueOf("3000ms"));
            TCplayer2_3.setToY(-250);
            TCplayer2_3.setToX(150);
            TCplayer2_3.play();

            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDelay(Duration.valueOf("3000ms"));
            TCplayer2_4.setToY(-250);
            TCplayer2_4.setToX(150);
            TCplayer2_4.play();

            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDelay(Duration.valueOf("3000ms"));
            TCplayer2_5.setToY(-250);
            TCplayer2_5.setToX(150);
            TCplayer2_5.play();

            TCplayer2_2.setToY(-250);
            TCplayer2_2.setToX(150);
            jack.play();
            TCplayer2_2PT.play();
            TCplayer2_2.play();
            scaleTran.play();

            //------------------player1----------------------//
            TCplayer1_back.setNode(firstcard1);
            TCplayer1_back.setDuration(Duration.millis(300));
            TCplayer1_back.setDelay(Duration.millis(3000));
            TCplayer1_back.setToX(-100);
            TCplayer1_back.play();

            TCplayer1_1.setNode(card1_1);
            TCplayer1_1.setDuration(Duration.millis(300));
            TCplayer1_1.setDelay(Duration.millis(3000));
            TCplayer1_1.setToX(-100);
            TCplayer1_1.play();

            TCplayer1_3.setNode(card1_3);
            TCplayer1_3.setDuration(Duration.millis(300));
            TCplayer1_3.setDelay(Duration.millis(3000));
            TCplayer1_3.setToX(-100);
            TCplayer1_3.play();

            TCplayer1_4.setNode(card1_4);
            TCplayer1_4.setDuration(Duration.millis(300));
            TCplayer1_4.setDelay(Duration.millis(3000));
            TCplayer1_4.setToX(-100);
            TCplayer1_4.play();

            TCplayer1_5.setNode(card1_5);
            TCplayer1_5.setDuration(Duration.millis(300));
            TCplayer1_5.setDelay(Duration.millis(3000));
            TCplayer1_5.setToX(-100);
            TCplayer1_5.play();

            TCplayer1_2PT.setNode(cardplayer1_2);
            TCplayer1_2PT.setPath(TCplayer1_2P);
            TCplayer1_2.setNode(cardplayer1_2);
            jack.setNode(cardplayer1_2);
            TCplayer1_2P.getElements().add(new MoveTo(960, 223));
            TCplayer1_2P.getElements().add(new CubicCurveTo(960, -100, 360, -100, 77, 110));//(pointstart,pointstart,theekhong-x,theekhong-y,left-right[point2],up-down[point2])
            TCplayer1_2PT.setDelay(Duration.ONE);
            jack.setDelay(Duration.ONE);
            TCplayer1_2.setDelay(Duration.valueOf("3000ms"));
            TCplayer1_2.setToX(-100);
            jack.play();
            TCplayer1_2PT.play();
            TCplayer1_2.play();

            textplay.setText(deck[2] + "+?/21");
            textnoplay.setText(deck[3] + "+?/21");

            //-------------------setScale----------------------//
            scaleTran3.setNode(firstcard2);
            scaleTran3.setDelay(Duration.valueOf("3000ms"));
            scaleTran3.setToX(0.6);
            scaleTran3.setToY(0.6);
            scaleTran3.play();

            scaleTran2.setNode(card2_1);
            scaleTran2.setDelay(Duration.valueOf("3000ms"));
            scaleTran2.setToX(0.6);
            scaleTran2.setToY(0.6);
            scaleTran2.play();

            scaleTran7.setNode(card2_3);
            scaleTran7.setDelay(Duration.valueOf("3000ms"));
            scaleTran7.setToX(0.6);
            scaleTran7.setToY(0.6);
            scaleTran7.play();

            scaleTran8.setNode(card2_4);
            scaleTran8.setDelay(Duration.valueOf("3000ms"));
            scaleTran8.setToX(0.6);
            scaleTran8.setToY(0.6);
            scaleTran8.play();

            scaleTran9.setNode(card2_5);
            scaleTran9.setDelay(Duration.valueOf("3000ms"));
            scaleTran9.setToX(0.6);
            scaleTran9.setToY(0.6);
            scaleTran9.play();

            System.out.println("start -> countp1 = " + countp1);
            System.out.println("start -> countp2 = " + countp2);

        } else {
            player2 = true;
            closeCard = true;
            textplayer.setText(namePlayer2.getText());
            System.out.println("player 1 = " + player1 + ",player 2 = " + player2);
            fade.setDuration(Duration.millis(10000));
            fade.setNode(textnoplay);
            fade.setFromValue(0);
            fade.setToValue(1);
            fade.play();
            p1.add(deck[0]);
            p1.add(deck[2]);
            p2.add(deck[1]);
            p2.add(deck[3]);
            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);
            TCplayer1_back.setNode(firstcard1);
            TCplayer1_back.setDuration(Duration.millis(300));
            TCplayer1_back.setDelay(Duration.millis(3000));
            TCplayer1_back.setToY(-250);
            TCplayer1_back.setToX(-100);
            TCplayer1_back.play();

            TCplayer1_1.setNode(card1_1);
            TCplayer1_1.setDuration(Duration.millis(300));
            TCplayer1_1.setDelay(Duration.millis(3000));
            TCplayer1_1.setToY(-250);
            TCplayer1_1.setToX(-100);
            TCplayer1_1.play();

            TCplayer1_3.setNode(card1_3);
            TCplayer1_3.setDuration(Duration.millis(300));
            TCplayer1_3.setDelay(Duration.millis(3000));
            TCplayer1_3.setToY(-250);
            TCplayer1_3.setToX(-100);
            TCplayer1_3.play();

            TCplayer1_4.setNode(card1_4);
            TCplayer1_4.setDuration(Duration.millis(300));
            TCplayer1_4.setDelay(Duration.millis(3000));
            TCplayer1_4.setToY(-250);
            TCplayer1_4.setToX(-100);
            TCplayer1_4.play();

            TCplayer1_5.setNode(card1_5);
            TCplayer1_5.setDuration(Duration.millis(300));
            TCplayer1_5.setDelay(Duration.millis(3000));
            TCplayer1_5.setToY(-250);
            TCplayer1_5.setToX(-100);
            TCplayer1_5.play();

            TCplayer1_2.setNode(cardplayer1_2);
            TCplayer1_2PT.setNode(cardplayer1_2);
            TCplayer1_2PT.setPath(TCplayer1_2P);
            jack.setNode(cardplayer1_2);
            TCplayer1_2P.getElements().add(new MoveTo(960, 223));
            TCplayer1_2P.getElements().add(new CubicCurveTo(960, -100, 360, -100, 77, 110));//(pointstart,pointstart,theekhong-x,theekhong-y,left-right[point2],up-down[point2])
            TCplayer1_2PT.setDelay(Duration.ONE);
            jack.setDelay(Duration.ONE);
            TCplayer1_2.setDelay(Duration.valueOf("3000ms"));
            TCplayer1_2.setToY(-250);
            TCplayer1_2.setToX(-100);
            TCplayer1_2.play();
            TCplayer1_2PT.play();
            jack.play();

            //-----------------player2----------------------//       
            TCplayer2_back.setNode(firstcard2);
            TCplayer2_back.setDuration(Duration.millis(300));
            TCplayer2_back.setDelay(Duration.millis(3000));
            TCplayer2_back.setToX(150);
            TCplayer2_back.play();

            TCplayer2_1.setNode(card2_1);
            TCplayer2_1.setDuration(Duration.millis(300));
            TCplayer2_1.setDelay(Duration.millis(3000));
            TCplayer2_1.setToX(150);
            TCplayer2_1.play();

            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDuration(Duration.millis(300));
            TCplayer2_3.setDelay(Duration.millis(3000));
            TCplayer2_3.setToX(150);
            TCplayer2_3.play();

            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDuration(Duration.millis(300));
            TCplayer2_4.setDelay(Duration.millis(3000));
            TCplayer2_4.setToX(150);
            TCplayer2_4.play();

            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDuration(Duration.millis(300));
            TCplayer2_5.setDelay(Duration.millis(3000));
            TCplayer2_5.setToX(150);
            TCplayer2_5.play();

            TCplayer2_2.setNode(card2_2);
            TCplayer2_2PT.setNode(card2_2);
            TCplayer2_2PT.setPath(TCplayer2_2P);
            jack.setNode(card2_2);
            TCplayer2_2P.getElements().add(new MoveTo(960, 223));
            TCplayer2_2P.getElements().add(new CubicCurveTo(960, -100, 360, -100, 77, 110));//(pointstart,pointstart,theekhong-x,theekhong-y,left-right[point2],up-down[point2])
            TCplayer2_2PT.setDelay(Duration.ONE);
            jack.setDelay(Duration.ONE);
            TCplayer2_2.setDelay(Duration.valueOf("3000ms"));

            TCplayer2_2.setToX(150);
            TCplayer2_2.play();
            TCplayer2_2PT.play();
            jack.play();

            textplay.setText(deck[3] + "+?/21");
            textnoplay.setText(deck[2] + "+?/21");

            scaleTran4.setNode(firstcard1);
            scaleTran4.setDelay(Duration.valueOf("3000ms"));
            scaleTran4.setToX(0.6);
            scaleTran4.setToY(0.6);
            scaleTran4.play();
            scaleTran5.setNode(card1_1);
            scaleTran5.setDelay(Duration.valueOf("3000ms"));
            scaleTran5.setToX(0.6);
            scaleTran5.setToY(0.6);
            scaleTran5.play();
            scaleTran6.setNode(cardplayer1_2);
            scaleTran6.setDelay(Duration.valueOf("3000ms"));
            scaleTran6.setToX(0.6);
            scaleTran6.setToY(0.6);
            scaleTran6.play();
            scaleTran10.setNode(card1_3);
            scaleTran10.setDelay(Duration.valueOf("3000ms"));
            scaleTran10.setToX(0.6);
            scaleTran10.setToY(0.6);
            scaleTran10.play();
            scaleTran11.setNode(card1_4);
            scaleTran11.setDelay(Duration.valueOf("3000ms"));
            scaleTran11.setToX(0.6);
            scaleTran11.setToY(0.6);
            scaleTran11.play();
            scaleTran12.setNode(card1_5);
            scaleTran12.setDelay(Duration.valueOf("3000ms"));
            scaleTran12.setToX(0.6);
            scaleTran12.setToY(0.6);
            scaleTran12.play();

            System.out.println("start -> countp1 = " + countp1);
            System.out.println("start -> countp2 = " + countp2);
        }

    }

    /**
     * Initializes the controller class.
     *
     */
    @FXML
    private void handleButtonAction(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        animation();
    }

    @FXML
    private void handleMouseClickHowtoplay(MouseEvent event) {
        soundEffectsClick();
        NamePlayer.setVisible(false);
        multiplePlayer.setVisible(false);
        menu.setVisible(false);
        howToPlay.setVisible(true);
    }

    @FXML
    private void handleMouseClickMuti(MouseEvent event) {
        soundEffectsClick();
        multiplePlayer.setVisible(false);
        NamePlayer.setVisible(true);
        menu.setVisible(false);
        howToPlay.setVisible(false);
        namePlayer1.setAlignment(Pos.BOTTOM_RIGHT);
        namePlayer2.setAlignment(Pos.BOTTOM_RIGHT);
        System.out.println(namePlayer1.getText());
        System.out.println(namePlayer2.getText());
    }

    private void handleMouseClickturnH(MouseEvent event) {
        menu.setVisible(true);
        multiplePlayer.setVisible(false);
        howToPlay.setVisible(false);
    }

    private void handleMouseClickturn(MouseEvent event) {
        menu.setVisible(true);
        multiplePlayer.setVisible(false);
        howToPlay.setVisible(false);
    }

    private void handleMouseClickturnM(MouseEvent event) {
        menu.setVisible(true);
        multiplePlayer.setVisible(false);
        howToPlay.setVisible(false);
    }

    //----------------------MutiplePlayer--------------------------//
    @FXML
    private void handleButtonplayMutiplae(MouseEvent event) {
        soundEffectsClick();
        setDeck();
        imscore.setImage(new Image("/JavaFXGAME/images/score.png"));
        PlayMuti.relocate(965, 285);
        btn_nextround.relocate(-965, 285);
        play();
    }

    @FXML
    private void handleButtonopenCard1(MouseEvent event) {
        closeCard = false;
        if (player1) {
            firstcard1.relocate(2000, 223);
            if (countp1 > 2) {
                textplay.setText((sum1) + "/21");
            } else {
                textplay.setText((deck[0] + deck[2]) + "/21");
            }
            firstcard1.setScaleX(0.6);
            firstcard1.setScaleY(0.6);
        }
        System.out.println(closeCard);
    }

    @FXML
    private void handleButtonopenCard2(MouseEvent event) {
        closeCard = false;
        if (player2) {
            firstcard2.relocate(2000, 223);
            if (countp2 > 2) {
                textplay.setText((sum2) + "/21");
            } else {
                textplay.setText((deck[1] + deck[3]) + "/21");
            }
            firstcard2.setScaleX(0.6);
            firstcard2.setScaleY(0.6);
        }
        System.out.println(closeCard);
    }

    @FXML
    private void handleButtoncloseCard1(MouseEvent event) {
        closeCard = true;
        if (player1) {
            firstcard1.relocate(597, 247);
            if (countp1 > 2) {
                textplay.setText((sum1 - deck[0]) + "+?/21");
            } else {
                textplay.setText(deck[2] + "+?/21");
            }
            firstcard1.setScaleX(1);
            firstcard1.setScaleY(1);
        }
        System.out.println(closeCard);
    }

    @FXML
    private void handleButtoncloseCard2(MouseEvent event) {
        closeCard = true;
        if (player2) {
            firstcard2.relocate(355, 247);
            if (countp2 > 2) {
                textplay.setText((sum2 - deck[1]) + "+?/21");
            } else {
                textplay.setText(deck[3] + "+?/21");
            }
            firstcard2.setScaleX(1);
            firstcard2.setScaleY(1);
        }
        System.out.println(closeCard);
    }

    @FXML
    private void handleButtonHitMutiple(MouseEvent event) {
        soundEffectsClick();
        if (player1) {
            sum1 = 0;
            countp1++;
            System.out.println("countp1 = " + countp1);
            System.out.println("player1 : card3 " + cardp1_3 + " card4 " + cardp1_4 + " card5 " + cardp1_5);
            p1.add(deck[countimage]);
            if ((countp1 == 3) && (cardp1_3 == false)) {
                cardp1_3 = true;
                card1_3.setImage(image[countimage]);
                new JackInTheBox(card1_3).play();
                System.out.println("card1-3");
            }
            if ((countp1 == 4) && (cardp1_4 == false)) {
                cardp1_4 = true;
                card1_4.setImage(image[countimage]);
                new JackInTheBox(card1_4).play();
                System.out.println("card1-4");
            }
            if ((countp1 == 5) && (cardp1_5 == false)) {
                cardp1_5 = true;
                card1_5.setImage(image[countimage]);
                new JackInTheBox(card1_5).play();
                System.out.println("card1-5");
            }
            for (int x = 0; x < p1.size(); x++) {
                System.out.println(" " + sum1 + " + " + p1.get(x));
                sum1 += p1.get(x);
                System.out.println("Sum1 = " + sum1);
            }
            System.out.println(p1);
            if (closeCard) {
                textplay.setText(sum1 - deck[0] + "+?/21");
            } else {
                textplay.setText((sum1) + "/21");
            }
            countimage++;
        } else {
            sum2 = 0;
            countp2++;
            System.out.println("countp2 = " + countp2);
            System.out.println("player2 : card3 " + cardp2_3 + " card4 " + cardp2_4 + " card5 " + cardp2_5);
            p2.add(deck[countimage]);
            if ((countp2 == 3) && (cardp2_3 == false)) {
                cardp2_3 = true;
                card2_3.setImage(image[countimage]);
                new JackInTheBox(card2_3).play();
                System.out.println("card2-3");
            }
            if ((countp2 == 4) && (cardp2_4 == false)) {
                cardp2_4 = true;
                card2_4.setImage(image[countimage]);
                new JackInTheBox(card2_4).play();
                System.out.println("card2-4");
            }
            if ((countp2 == 5) && (cardp2_5 == false)) {
                cardp2_5 = true;
                card2_5.setImage(image[countimage]);
                new JackInTheBox(card2_5).play();
                System.out.println("card2-5");
            }
            for (int x = 0; x < p2.size(); x++) {
                System.out.println(" " + sum2 + " + " + p2.get(x));
                sum2 += p2.get(x);
                System.out.println("Sum2 = " + sum2);
            }
            System.out.println(p2);
            if (closeCard) {
                textplay.setText((sum2 - deck[1]) + "+?/21");
            } else {
                textplay.setText((sum2) + "/21");
            }
            countimage++;
        }
        btn_standmutiple.relocate(965, 285);
        btn_Hitmutiple.relocate(965, 285);
        btn_nextplayer.relocate(978, 428);
    }

    @FXML
    private void handleButtonStandMutiple(MouseEvent event) throws FontFormatException, IOException {
        soundEffectsClick();
        if (player1) {
            standplayer1 = true;
        }
        if (player2) {
            standplayer2 = true;
        }
        if (standplayer1 == true && standplayer2 == true) {
            System.out.println("end");
            textplay.setText(null);
            textnoplay.setText(null);
            textplayer.setText(null);
            textNameEnd1.setText(namePlayer2.getText());
            textNameEnd2.setText(namePlayer1.getText());
            textScoreDown1.setText(sum2 + " / 21");
            textScoreDown2.setText(sum1 + " / 21");
            btn_nextround.relocate(971, 570);
            btn_standmutiple.relocate(-965, 285);
            btn_Hitmutiple.relocate(-965, 285);
            btn_nextplayer.relocate(-978, 428);
            player.player1Win(sum1, sum2);

            if (((sum1 > sum2) && (sum1 <= 21)) || (sum2 > 21)) {
                score2++;
            } else if (((sum1 < sum2) && (sum2 <= 21)) || (sum1 > 21)) {
                score1++;
            }
            player.setScorePlayer1(score1);
            player.setScorePlayer2(score2);
            if (player.getScorePlayer1() == 3 || player.getScorePlayer2() == 3) {
                btn_Menu.relocate(975, 505);
                Image imageEnd = new Image("/JavaFXGAME/images/crownWin.png");
                crownWinner.setImage(imageEnd);
                crownWinner.relocate(325, 224);
                textWin.setText("Win");
                textWin.relocate(415, 154);
                if (player.getScorePlayer2() == 3) {
                    crownWinner.relocate(574, 224);
                    textWin.setText("Win");
                    textWin.relocate(675, 154);
                }
            }
            System.out.println("player1 : " + sum1 + " player2 : " + sum2);
            textShowscore1.setText(": " + player.getScorePlayer1());
            textShowscore2.setText(": " + player.getScorePlayer2());
            if (player1) {
                System.out.println("P1");
                firstcard1.setImage(null);
                firstcard2.setImage(null);
                firstcard2.setScaleX(1);
                firstcard2.setScaleY(1);
                TCplayer2_back.setNode(firstcard2);
                TCplayer2_back.setDuration(Duration.millis(300));
                TCplayer2_back.setDelay(Duration.millis(100));
                TCplayer2_back.setToY(5);
                TCplayer2_back.setToX(5);
                TCplayer2_back.play();

                card2_1.setScaleX(1);
                card2_1.setScaleY(1);
                TCplayer2_1.setNode(card2_1);
                TCplayer2_1.setDuration(Duration.millis(300));
                TCplayer2_1.setDelay(Duration.millis(100));
                TCplayer2_1.setToY(5);
                TCplayer2_1.setToX(5);
                TCplayer2_1.play();

                card2_2.setScaleX(1);
                card2_2.setScaleY(1);
                TCplayer2_2.setNode(card2_2);
                TCplayer2_2.setDuration(Duration.millis(300));
                TCplayer2_2.setDelay(Duration.millis(100));
                TCplayer2_2.setToY(5);
                TCplayer2_2.setToX(5);
                TCplayer2_2.play();
                System.out.println(cardp2_3);

                card2_3.setScaleX(1);
                card2_3.setScaleY(1);
                TCplayer2_3.setNode(card2_3);
                TCplayer2_3.setDuration(Duration.millis(300));
                TCplayer2_3.setDelay(Duration.millis(100));
                TCplayer2_3.setToY(5);
                TCplayer2_3.setToX(5);
                System.out.println("print");
                TCplayer2_3.play();

                card2_4.setScaleX(1);
                card2_4.setScaleY(1);
                TCplayer2_4.setNode(card2_4);
                TCplayer2_4.setDuration(Duration.millis(300));
                TCplayer2_4.setDelay(Duration.millis(100));
                TCplayer2_4.setToY(5);
                TCplayer2_4.setToX(5);
                TCplayer2_4.play();

                card2_5.setScaleX(1);
                card2_5.setScaleY(1);
                TCplayer2_5.setNode(card2_5);
                TCplayer2_5.setDuration(Duration.millis(300));
                TCplayer2_5.setDelay(Duration.millis(100));
                TCplayer2_5.setToY(5);
                TCplayer2_5.setToX(5);
                TCplayer2_5.play();

                //----------------player 1------------------//
                TCplayer1_back.setDelay(Duration.millis(100));
                TCplayer1_back.setDuration(Duration.millis(300));
                TCplayer1_back.setToX(5);
                TCplayer1_back.play();

                TCplayer1_1.setDelay(Duration.millis(100));
                TCplayer1_1.setDuration(Duration.millis(300));
                TCplayer1_1.setToX(5);
                TCplayer1_1.play();

                TCplayer1_2.setDuration(Duration.millis(300));
                TCplayer1_2.setDelay(Duration.millis(100));
                TCplayer1_2.setToX(5);
                TCplayer1_2.play();

                TCplayer1_3.setNode(card1_3);
                TCplayer1_3.setDuration(Duration.millis(300));
                TCplayer1_3.setDelay(Duration.millis(100));

                TCplayer1_3.setToX(5);
                TCplayer1_3.play();

                TCplayer1_4.setNode(card1_4);
                TCplayer1_4.setDuration(Duration.millis(300));
                TCplayer1_4.setDelay(Duration.millis(100));
                TCplayer1_4.setToX(5);
                TCplayer1_4.play();

                TCplayer1_5.setNode(card1_5);
                TCplayer1_5.setDuration(Duration.millis(300));
                TCplayer1_5.setDelay(Duration.millis(100));
                TCplayer1_5.setToX(5);
                TCplayer1_5.play();

            } else {
                firstcard1.setImage(null);
                firstcard2.setImage(null);
                System.out.println("P2");
                firstcard1.setScaleX(1);
                firstcard1.setScaleY(1);
                TCplayer1_back.setNode(firstcard1);
                TCplayer1_back.setDelay(Duration.millis(100));
                TCplayer1_back.setDuration(Duration.millis(300));
                TCplayer1_back.setToY(5);
                TCplayer1_back.setToX(5);
                TCplayer1_back.play();

                card1_1.setScaleX(1);
                card1_1.setScaleY(1);
                TCplayer1_1.setNode(card1_1);
                TCplayer1_1.setDelay(Duration.millis(100));
                TCplayer1_1.setDuration(Duration.millis(300));
                TCplayer1_1.setToY(5);
                TCplayer1_1.setToX(5);
                TCplayer1_1.play();

                cardplayer1_2.setScaleX(1);
                cardplayer1_2.setScaleY(1);
                TCplayer1_2.setNode(cardplayer1_2);
                TCplayer1_2.setDuration(Duration.millis(300));
                TCplayer1_2.setDelay(Duration.millis(100));
                TCplayer1_2.setToY(5);
                TCplayer1_2.setToX(5);
                TCplayer1_2.play();
                System.out.println("cardp1_3 is " + cardp1_3);
                System.out.println("cardp2_3 is " + cardp2_3);

                card1_3.setScaleX(1);
                card1_3.setScaleY(1);
                TCplayer1_3.setNode(card1_3);
                TCplayer1_3.setDuration(Duration.millis(300));
                TCplayer1_3.setDelay(Duration.millis(100));
                TCplayer1_3.setToY(5);
                TCplayer1_3.setToX(5);
                TCplayer1_3.play();

                card1_4.setScaleX(1);
                card1_4.setScaleY(1);
                TCplayer1_4.setNode(card1_4);
                TCplayer1_4.setDuration(Duration.millis(300));
                TCplayer1_4.setDelay(Duration.millis(100));
                TCplayer1_4.setToY(5);
                TCplayer1_4.setToX(5);
                TCplayer1_4.play();

                card1_5.setScaleX(1);
                card1_5.setScaleY(1);
                TCplayer1_5.setNode(card1_5);
                TCplayer1_5.setDuration(Duration.millis(300));
                TCplayer1_5.setDelay(Duration.millis(100));
                TCplayer1_5.setToY(5);
                TCplayer1_5.setToX(5);
                TCplayer1_5.play();

                //-----------------player 2---------------------//
                TCplayer2_back.setDuration(Duration.millis(300));
                TCplayer2_back.setDelay(Duration.millis(100));
                TCplayer2_back.setToX(-5);
                TCplayer2_back.play();

                TCplayer2_1.setDuration(Duration.millis(300));
                TCplayer2_1.setDelay(Duration.millis(100));
                TCplayer2_1.setToX(-5);
                TCplayer2_1.play();

                TCplayer2_2.setDuration(Duration.millis(300));
                TCplayer2_2.setDelay(Duration.millis(100));
                TCplayer2_2.setToX(-5);
                TCplayer2_2.play();

                TCplayer2_3.setNode(card2_3);
                TCplayer2_3.setDuration(Duration.millis(300));
                TCplayer2_3.setDelay(Duration.millis(100));
                TCplayer2_3.setToX(-5);
                TCplayer2_3.play();

                TCplayer2_4.setNode(card2_4);
                TCplayer2_4.setDuration(Duration.millis(300));
                TCplayer2_4.setDelay(Duration.millis(100));
                TCplayer2_4.setToX(-5);
                TCplayer2_4.play();

                TCplayer2_5.setNode(card2_5);
                TCplayer2_5.setDuration(Duration.millis(300));
                TCplayer2_5.setDelay(Duration.millis(100));
                TCplayer2_5.setToX(-5);
                TCplayer2_5.play();

            }
        } else {
            btn_standmutiple.relocate(965, 285);
            btn_Hitmutiple.relocate(965, 285);
            btn_nextplayer.relocate(978, 428);
        }

    }

    @FXML
    private void handleButtonnextplayer(MouseEvent event) {
        soundEffectsClick();
        btn_standmutiple.relocate(977, 417);
         if(player1){
            if(!cardp2_4){
                btn_Hitmutiple.relocate(977, 461);
            }
        }
        else{
            if(!cardp1_4){
                btn_Hitmutiple.relocate(977, 461);
            }
        }
        btn_nextplayer.relocate(965, 285);

        if (player1) {
            firstcard2.setScaleX(1);
            firstcard2.setScaleY(1);
            TCplayer2_back.setNode(firstcard2);
            TCplayer2_back.setDuration(Duration.millis(300));
            TCplayer2_back.setDelay(Duration.millis(300));
            TCplayer2_back.setToY(5);
            TCplayer2_back.play();

            card2_1.setScaleX(1);
            card2_1.setScaleY(1);
            TCplayer2_1.setNode(card2_1);
            TCplayer2_1.setDuration(Duration.millis(300));
            TCplayer2_1.setDelay(Duration.millis(300));
            TCplayer2_1.setToY(5);
            TCplayer2_1.play();

            card2_2.setScaleX(1);
            card2_2.setScaleY(1);
            TCplayer2_2.setNode(card2_2);
            TCplayer2_2.setDuration(Duration.millis(300));
            TCplayer2_2.setDelay(Duration.millis(300));
            TCplayer2_2.setToY(5);
            TCplayer2_2.play();

            card2_3.setScaleX(1);
            card2_3.setScaleY(1);
            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDuration(Duration.millis(300));
            TCplayer2_3.setDelay(Duration.millis(300));
            TCplayer2_3.setToY(5);
            TCplayer2_3.play();

            card2_4.setScaleX(1);
            card2_4.setScaleY(1);
            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDuration(Duration.millis(300));
            TCplayer2_4.setDelay(Duration.millis(300));
            TCplayer2_4.setToY(5);
            TCplayer2_4.play();

            card2_5.setScaleX(1);
            card2_5.setScaleY(1);
            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDuration(Duration.millis(300));
            TCplayer2_5.setDelay(Duration.millis(300));
            TCplayer2_5.setToY(5);
            TCplayer2_5.play();

            //--------------------player1--------------------//
            firstcard1.setScaleX(0.6);
            firstcard1.setScaleY(0.6);
            TCplayer1_back.setNode(firstcard1);
            TCplayer1_back.setDelay(Duration.millis(300));
            TCplayer1_back.setDuration(Duration.millis(300));
            TCplayer1_back.setToY(-250);
            TCplayer1_back.play();

            card1_1.setScaleX(0.6);
            card1_1.setScaleY(0.6);
            TCplayer1_1.setNode(card1_1);
            TCplayer1_1.setDelay(Duration.millis(300));
            TCplayer1_1.setDuration(Duration.millis(300));
            TCplayer1_1.setToY(-250);
            TCplayer1_1.play();

            cardplayer1_2.setScaleX(0.6);
            cardplayer1_2.setScaleY(0.6);
            TCplayer1_2.setNode(cardplayer1_2);
            TCplayer1_2.setDuration(Duration.millis(300));
            TCplayer1_2.setDelay(Duration.millis(300));
            TCplayer1_2.setToY(-250);
            TCplayer1_2.play();

            card1_3.setScaleX(0.6);
            card1_3.setScaleY(0.6);
            TCplayer1_3.setNode(card1_3);
            TCplayer1_3.setDuration(Duration.millis(300));
            TCplayer1_3.setDelay(Duration.millis(300));
            TCplayer1_3.setToY(-250);
            TCplayer1_3.play();

            card1_4.setScaleX(0.6);
            card1_4.setScaleY(0.6);
            TCplayer1_4.setNode(card1_4);
            TCplayer1_4.setDuration(Duration.millis(300));
            TCplayer1_4.setDelay(Duration.millis(300));
            TCplayer1_4.setToY(-250);
            TCplayer1_4.play();

            card1_5.setScaleX(0.6);
            card1_5.setScaleY(0.6);
            TCplayer1_5.setNode(card1_5);
            TCplayer1_5.setDuration(Duration.millis(300));
            TCplayer1_5.setDelay(Duration.millis(300));
            TCplayer1_5.setToY(-250);
            TCplayer1_5.play();

            card2_3.setScaleX(1);
            card2_3.setScaleY(1);
            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDuration(Duration.millis(300));
            TCplayer2_3.setDelay(Duration.millis(300));
            TCplayer2_3.setToY(5);
            TCplayer2_3.play();

            card2_4.setScaleX(1);
            card2_4.setScaleY(1);
            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDuration(Duration.millis(300));
            TCplayer2_4.setDelay(Duration.millis(300));
            TCplayer2_4.setToY(5);
            TCplayer2_4.play();

            card2_5.setScaleX(1);
            card2_5.setScaleY(1);
            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDuration(Duration.millis(300));
            TCplayer2_5.setDelay(Duration.millis(300));
            TCplayer2_5.setToY(5);
            TCplayer2_5.play();
            //}
        }
        if (player2) {
            firstcard1.setScaleX(1);
            firstcard1.setScaleY(1);
            TCplayer1_back.setNode(firstcard1);
            TCplayer1_back.setDelay(Duration.millis(300));
            TCplayer1_back.setDuration(Duration.millis(300));
            TCplayer1_back.setToY(5);
            TCplayer1_back.play();

            card1_1.setScaleX(1);
            card1_1.setScaleY(1);
            TCplayer1_1.setNode(card1_1);
            TCplayer1_1.setDelay(Duration.millis(300));
            TCplayer1_1.setDuration(Duration.millis(300));
            TCplayer1_1.setToY(5);
            TCplayer1_1.play();

            cardplayer1_2.setScaleX(1);
            cardplayer1_2.setScaleY(1);
            TCplayer1_2.setNode(cardplayer1_2);
            TCplayer1_2.setDuration(Duration.millis(300));
            TCplayer1_2.setDelay(Duration.millis(300));
            TCplayer1_2.setToY(5);
            TCplayer1_2.play();

            //-----------------player2----------------------// 
            firstcard2.setScaleX(0.6);
            firstcard2.setScaleY(0.6);
            TCplayer2_back.setNode(firstcard2);
            TCplayer2_back.setDuration(Duration.millis(300));
            TCplayer2_back.setDelay(Duration.millis(300));
            TCplayer2_back.setToY(-250);
            TCplayer2_back.play();

            card2_1.setScaleX(0.6);
            card2_1.setScaleY(0.6);
            TCplayer2_1.setNode(card2_1);
            TCplayer2_1.setDuration(Duration.millis(300));
            TCplayer2_1.setDelay(Duration.millis(300));
            TCplayer2_1.setToY(-250);
            TCplayer2_1.play();

            card2_2.setScaleX(0.6);
            card2_2.setScaleY(0.6);
            TCplayer2_2.setNode(card2_2);
            TCplayer2_2.setDuration(Duration.millis(300));
            TCplayer2_2.setDelay(Duration.millis(300));
            TCplayer2_2.setToY(-250);
            TCplayer2_2.play();

            card2_3.setScaleX(0.6);
            card2_3.setScaleY(0.6);
            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDuration(Duration.millis(300));
            TCplayer2_3.setDelay(Duration.millis(300));
            TCplayer2_3.setToY(-250);
            TCplayer2_3.play();

            card2_4.setScaleX(0.6);
            card2_4.setScaleY(0.6);
            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDuration(Duration.millis(300));
            TCplayer2_4.setDelay(Duration.millis(300));
            TCplayer2_4.setToY(-250);
            TCplayer2_4.play();

            card2_5.setScaleX(0.6);
            card2_5.setScaleY(0.6);
            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDuration(Duration.millis(300));
            TCplayer2_5.setDelay(Duration.millis(300));
            TCplayer2_5.setToY(-250);
            TCplayer2_5.play();

            card1_3.setScaleX(1);
            card1_3.setScaleY(1);
            TCplayer1_3.setNode(card1_3);
            TCplayer1_3.setDuration(Duration.millis(300));
            TCplayer1_3.setDelay(Duration.millis(300));
            TCplayer1_3.setToY(5);
            TCplayer1_3.play();

            card1_4.setScaleX(1);
            card1_4.setScaleY(1);
            TCplayer1_4.setNode(card1_4);
            TCplayer1_4.setDuration(Duration.millis(300));
            TCplayer1_4.setDelay(Duration.millis(300));
            TCplayer1_4.setToY(5);
            TCplayer1_4.play();

            card1_5.setScaleX(1);
            card1_5.setScaleY(1);
            TCplayer1_5.setNode(card1_5);
            TCplayer1_5.setDuration(Duration.millis(300));
            TCplayer1_5.setDelay(Duration.millis(300));
            TCplayer1_5.setToY(5);
            TCplayer1_5.play();

            card2_3.setScaleX(0.6);
            card2_3.setScaleY(0.6);
            TCplayer2_3.setNode(card2_3);
            TCplayer2_3.setDuration(Duration.millis(300));
            TCplayer2_3.setDelay(Duration.millis(300));
            TCplayer2_3.setToY(-250);
            TCplayer2_3.play();

            card2_4.setScaleX(0.6);
            card2_4.setScaleY(0.6);
            TCplayer2_4.setNode(card2_4);
            TCplayer2_4.setDuration(Duration.millis(300));
            TCplayer2_4.setDelay(Duration.millis(300));
            TCplayer2_4.setToY(-250);
            TCplayer2_4.play();

            card2_5.setScaleX(0.6);
            card2_5.setScaleY(0.6);
            TCplayer2_5.setNode(card2_5);
            TCplayer2_5.setDuration(Duration.millis(300));
            TCplayer2_5.setDelay(Duration.millis(300));
            TCplayer2_5.setToY(-250);
            TCplayer2_5.play();

        }
        if (player1) {
            player2 = true;
            player1 = false;
            textplayer.setText(namePlayer2.getText());
            if (countp1 > 2) {
                textnoplay.setText((sum1 - deck[0]) + "+?/21");
            } else {
                textnoplay.setText(deck[2] + "+?/21");
            }
            if (countp2 > 2) {
                textplay.setText((sum2 - deck[1]) + "+?/21");
            } else {
                textplay.setText(deck[3] + "+?/21");
            }
        } else {
            player1 = true;
            player2 = false;
            textplayer.setText(namePlayer1.getText());
            if (countp2 > 2) {
                textnoplay.setText((sum2 - deck[1]) + "+?/21");
            } else {
                textnoplay.setText(deck[3] + "+?/21");
            }
            if (countp1 > 2) {
                textplay.setText((sum1 - deck[0]) + "+?/21");
            } else {
                textplay.setText(deck[2] + "+?/21");
            }
        }
    }

    @FXML
    private void handleButtonRound(MouseEvent event) {
        soundEffectsClick();
        round++;
        if (score1 == 3 || score2 == 3) {
            crownWinner.setImage(null);
            textWin.setText(null);
            round = 1;
            score1 = 0;
            score2 = 0;
        }
        setDeck();
        textNameEnd1.setText(null);
        textNameEnd2.setText(null);
        textScoreDown1.setText(null);
        textScoreDown2.setText(null);
        btn_nextround.relocate(971, -570);
        reSet();
        play();
    }

    @FXML
    private void handleMouseClickcard1(MouseEvent event) {
        yourCard = 1;
        btn_card1.setSelected(true);
        btn_card2.setSelected(false);
        btn_card3.setSelected(false);
    }

    @FXML
    private void handleMouseClickcard2(MouseEvent event) {
        yourCard = 2;
        btn_card1.setSelected(false);
        btn_card2.setSelected(true);
        btn_card3.setSelected(false);
    }

    @FXML
    private void handleMouseClickcard3(MouseEvent event) {
        yourCard = 3;
        btn_card1.setSelected(false);
        btn_card2.setSelected(false);
        btn_card3.setSelected(true);
    }

    @FXML
    private void handleButtonGo(MouseEvent event) {
        multiplePlayer.setVisible(true);
        menu.setVisible(false);
        howToPlay.setVisible(false);
        NamePlayer.setVisible(false);
    }

    @FXML
    private void handleButtonSound(MouseEvent event) {
        if (sound) {
            btn_Sound.setImage(new Image("/JavaFXGAME/images/imagescut.png"));
            sound = false;
        } else {
            btn_Sound.setImage(new Image("/JavaFXGAME/images/images1cut.png"));
            sound = true;
        }
    }

    @FXML
    private void handleButtonGoToMenu(MouseEvent event) {
        NamePlayer.setVisible(false);
        multiplePlayer.setVisible(false);
        menu.setVisible(true);
        howToPlay.setVisible(false);
        PlayMuti.relocate(554, 493);
        animation();
        ResetPlayer();
        reSet();
    }

    @FXML
    private void handleButtonReturn(MouseEvent event) {
        NamePlayer.setVisible(false);
        multiplePlayer.setVisible(false);
        menu.setVisible(true);
        howToPlay.setVisible(false);
    }

    @FXML
    private void handleButtonExit_Menu(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to Logout!");
        alert.setContentText("Do you want to Logout?");
               
        if(alert.showAndWait().get()==ButtonType.OK)
        {
            Stage stage = (Stage) multiplePlayer.getScene().getWindow();
            System.out.println("Logout laew ja");
            stage.close();
        }       
    }

    @FXML
    private void handleButtonExit_Play(MouseEvent event) 
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to Logout!");
        alert.setContentText("Do you want to Logout?");
               
        if(alert.showAndWait().get()==ButtonType.OK)
        {
            Stage stage = (Stage) multiplePlayer.getScene().getWindow();
            System.out.println("Logout laew ja");
            stage.close();
        }       
    }

    @FXML
    private void handleButtonExit_HowToPlay(MouseEvent event) 
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to Logout!");
        alert.setContentText("Do you want to Logout?");
               
        if(alert.showAndWait().get()==ButtonType.OK)
        {
            Stage stage = (Stage) multiplePlayer.getScene().getWindow();
            System.out.println("Logout laew ja");
            stage.close();
        }       
    }
}
