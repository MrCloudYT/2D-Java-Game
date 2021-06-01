package de.mrcloud.handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    public boolean up, down, left, right;
    private boolean[] keys;

    public InputHandler() {
        System.out.println("created");
        keys = new boolean[256];
    }

    public void tick() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        System.out.println("pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        System.out.println("no");
    }
}
