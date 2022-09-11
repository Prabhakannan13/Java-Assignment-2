import java.util.Scanner;
class Tile
{
    private int edge;
    private int area;
    Tile(int edge)
    {
        this.edge=edge;
        this.area=edge*edge;
    }
    int getArea()
    {
        return area;
    }
}

class Floor
{
    private int length;
    private int width;
    Floor(int length, int width)
    {
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t)
    {
        double tileArea=t.getArea();
        double floorArea=length*width;
        double NumberOfTiles=(floorArea/tileArea);
        System.out.println("Number of tiles: "+NumberOfTiles);
    }   
}
class Tiles_T
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of Tile:");
        int tileLength=input.nextInt();

        Tile t=new Tile(tileLength);
        System.out.println("Enter the length and width of Floor:");
        int floorLength=input.nextInt();
        int floorWidth=input.nextInt();

        Floor f=new Floor(floorLength,floorWidth);
        f.totalTiles(t);
    }
}