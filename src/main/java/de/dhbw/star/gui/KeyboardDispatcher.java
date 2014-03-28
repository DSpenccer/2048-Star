/*
 * The MIT License
 *
 * Copyright 2014 Robert Schütte.
 *
 */
package de.dhbw.star.gui;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Robert Schütte
 */
public class KeyboardDispatcher implements KeyEventDispatcher {

    private GameWindow gameWindow;

    public KeyboardDispatcher(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_RELEASED) {
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                gameWindow.getCoreGame().moveDown();
            }

            if (e.getKeyCode() == KeyEvent.VK_UP) {
                gameWindow.getCoreGame().moveUp();
            }

            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                gameWindow.getCoreGame().moveLeft();
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                gameWindow.getCoreGame().moveRight();
            }

            gameWindow.updateWinow();
            System.out.println(gameWindow.getCoreGame().toString());
        }
        return false;
    }
}