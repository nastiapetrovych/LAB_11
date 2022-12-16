package org.example.task3;

public class ProxyImage implements MyImage{
    private RealImage image;
    private String filename;
    public  ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        if(image == null){
            image = new RealImage(filename);
        }
        image.display();
    }
}
