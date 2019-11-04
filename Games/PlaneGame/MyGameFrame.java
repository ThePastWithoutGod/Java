package com.esoon.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
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
