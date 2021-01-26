public class Mouse implements Animal {
    private boolean myZig; // determines which way to go for each mouse
    
    public Mouse() {
    	myZig = true;
    }

    // required by interface
    public String toString() {
        return "M";
    }

    // toggle boolean, so alternates up and left
    public int getMove() { //AnimalInfo info) {
        myZig = !myZig;
        if (myZig)
            return NORTH; // up
        else
            return WEST; // left
    }
    
    // using basic grey
	public Color getColor() {
		return Color.GRAY;
	}
}
