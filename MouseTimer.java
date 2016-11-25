package MESS;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MouseTimer {

    Timer timer;

    double currentX;
    double currentY;

    double updatedX;
    double updatedY;


    public MouseTimer(){

        currentX = MouseInfo.getPointerInfo().getLocation().getX();
        currentY = MouseInfo.getPointerInfo().getLocation().getY();

        timer = new Timer(19000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatedX = MouseInfo.getPointerInfo().getLocation().getX();
                updatedY = MouseInfo.getPointerInfo().getLocation().getY();

                if ((updatedX == currentX) && (updatedY == currentY)){
                    Session.getInstance().timeOut = true;
                }
                else{
                    currentX = updatedX;
                    currentY = updatedY;
                    System.out.println("Mouse X:" + currentX);
                    System.out.println("Mouse Y:" + currentY);
                }
            }
        });

    }
}
