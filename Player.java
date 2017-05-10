public class Player {
    private int money;
    private int num;
    private int position;
    //getter und setter
    public int getmoney(){return money;};
    public void setmoney(int m){money =m;};
    public int getposition(){return position;};
    public void setposition(int x){position =x;};
    public int getnum() {return num;};
    //constructor
    Player (int x) {num=x;position=101;};
    //onestep
    public int step(int x){
        position=position+x;
        if (position >140) {
            position-=40; // auf los setzen
            return  2000; // geld von los zurueckgeben
        }
        return 0;
    };
}
