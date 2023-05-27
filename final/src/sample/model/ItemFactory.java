package sample.model;

import java.io.File;


//Factory pattern for two views

public class ItemFactory {

    public baseItem getItem(boolean tableRender,File file){
        if(tableRender){
            return new TableItem(file);
        }
        else{
            return new TileItem(file);
        }
    }
}
