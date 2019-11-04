package com.esoon.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {

    Image ball = GameUtil.getImage("images/");

    public void paint(Graphics g){  //自动被调用     g相当于一枝画笔
        Color c = g.getColor();
        Font f = g.getFont();
        g.setColor(Color.BLUE);

        g.drawLine(100,100,100,100);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,40,40);
        g.setColor(Color.RED);
        g.setFont(new Font("宋体",Font.BOLD,50));
        g.drawString("我是谁？",200,200);

        g.setColor(c);
        g.setFont(f);
    }

    /**
     * 初始化窗口
     */
    public void launchFrame(){
        this.setTitle("Plane Game");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(0,0);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
