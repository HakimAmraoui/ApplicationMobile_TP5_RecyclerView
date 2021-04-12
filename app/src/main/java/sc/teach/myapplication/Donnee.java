package sc.teach.myapplication;

public class Donnee {
    private String name;
    private int size;
    private int image;

    Donnee (String name, int size, int image){
        this.name = name;
        this.size = size;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getImage() {
        return image;
    }

}
