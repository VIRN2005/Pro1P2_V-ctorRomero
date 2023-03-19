package pro1p2_víctorromero;

public class Sun {
    
    // Atributos de la clase
    private int value;      // Valor en soles del objeto
    private int x;          // Coordenada x del objeto en el tablero
    private int y;          // Coordenada y del objeto en el tablero
    
    // Constructor de la clase
    public Sun(int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }
    
    // Métodos para obtener y modificar los atributos de la clase
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
}

