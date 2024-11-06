package Viking;

public class Camera {
    private float x, y; // Position de la caméra

    public Camera(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Méthode pour suivre un objet
    public void update(Player player) {
        // Déplacer la caméra en fonction de la position de l'objet
        x += ((player.getX() - x) - 250) * 0.05f; // 400 pour centrer, ajuste selon l'écran
        y += ((player.getY() - y) - 350) * 0.05f; // 300 pour centrer, ajuste selon l'écran
    }

    // Getter pour les coordonnées
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setter pour les coordonnées
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
