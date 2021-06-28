package chapterSixteen;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ColorChooser {


    public static Map<String, Color> fetchColors(){
        Map<String, Color>  colorsMap = new HashMap<>();
        String[] colorNames = {"blue", "black", "yellow", "red", "cyan", "darkGray", "gray", "green", "lightGray", "magenta",
                                "orange", "pink", "white"};
        int[] r = {0, 0, 255, 255, 0, 102, 128, 0, 204, 255, 255, 255, 255};
        int[] g = {0, 0, 255, 0, 255, 102, 128, 128, 204, 0, 102, 192, 255};
        int[] b = {255, 0, 0, 0, 255, 102, 128, 0, 204, 255, 0, 203, 255};


        for (int i = 0; i < colorNames.length; i++) {
            colorsMap.put(colorNames[i], new Color(r[i], g[i], b[i]));
        }
        return colorsMap;
    }


}



