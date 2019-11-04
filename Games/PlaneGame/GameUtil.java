package com.esoon.game;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;

public class GameUtil {

    //工具类最好将构造器私有化
    private GameUtil(){

    }
    public static Image getImage(String path) { // 返回指定路径文件的图片对象
        BufferedImage bi = null;
        try {
            URL u = GameUtil.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
