/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgame;

/**
 *
 * @author beaut
 */
public class Player {

    private String namePlayer1;
    private String namePlayer2;
    private int scorePlayer1;
    private int scorePlayer2;

    public Player() {
    }

    public void setNamePlayer1(String namePlayer1) {
        this.namePlayer1 = namePlayer1;
    }

    public void setNamePlayer2(String namePlayer2) {
        this.namePlayer2 = namePlayer2;
    }

    public void setScorePlayer1(int scorePlayer1) {
        this.scorePlayer1 = scorePlayer1;
    }

    public void setScorePlayer2(int scorePlayer2) {
        this.scorePlayer2 = scorePlayer2;
    }

    public String getNamePlayer1() {
        return namePlayer1;
    }

    public String getNamePlayer2() {
        return namePlayer2;
    }

    public int getScorePlayer1() {
        return scorePlayer1;
    }

    public int getScorePlayer2() {
        return scorePlayer2;
    }

    public void player1Win(int score1, int score2) {
        if (((score1 > score2) && (score1 <= 21)) || (score2 > 21)) {
            scorePlayer1++;
        } else if (((score1 < score2) && (score2 <= 21)) || (score1 > 21)) {
            scorePlayer2++;
        }
    }

}
