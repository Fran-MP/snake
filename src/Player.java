
import java.awt.Color;

/**
 * @version 1.0
 * @author Fran_
 */
public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    /**
     *
     * @param no
     */
    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }
    /**
     * 
     * @return Posición del Jugador
     */
    public int getPosition() {
        return playerPosn;
    }
    /**
     * 
     * @return Nombre Jugador
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param posn
     */
    public void setPosition(int posn) {
        playerPosn = posn;
    }

    /**
     *
     * @param posn
     */
    public void incPosition(int posn) {
        playerPosn += posn;
    }

    /**
     *
     * @param c
     */
    public void setPlayerColor(Color c) {
        playerColor = c;
    }
    /**
     * 
     * @return Color jugador
     */
    public Color getPlayerColor() {
        return playerColor;
    }

    /**
     *
     * @param a
     */
    public void incPlayerScore(int a) {
        playerScore += a;
    }
    /**
     * 
     * @return Puntuación
     */
    public int getPlayerScore() {
        return playerScore;
    }

}
