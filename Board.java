package Tetris2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;

    private BufferedImage pause, refresh;

    private final int boardHeight = 20, boardWidth = 10; //размер игрового поля

    public static final int blockSize = 30; //размер блока

    private Color[][] board = new Color[boardHeight][boardWidth]; //поле,цвет

    private Shape[] shapes = new Shape[7]; //формы

    private static Shape currentShape, nextShape; //форма, которая выпадает сейчас

    private Timer looper; //таймер

    private int FPS = 60;

    private int delay = 1000 / FPS;



}
