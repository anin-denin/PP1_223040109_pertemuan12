package Latihan12;

class Vertex {
    private char label; // label (e.g. 'A')
    private boolean wasVisited;

    // Constructor
    public Vertex(char lab) {
        this.label = lab;
        this.wasVisited = false;
    }

    // Setter for wasVisited
    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    // Getter for wasVisited
    public boolean getWasVisited() {
        return this.wasVisited;
    }

    // Getter for label
    public char getLabel() {
        return this.label;
    }

}