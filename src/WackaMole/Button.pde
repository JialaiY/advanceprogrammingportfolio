class Button {
  String label;
  float x, y, w = 100, h = 40;

  Button(String label, float x, float y) {
    this.label = label;
    this.x = x;
    this.y = y;
  }

  void display() {
    fill(0, 150, 200);
    rect(x, y, w, h, 10);
    fill(255);
    textAlign(CENTER, CENTER);
    text(label, x + w / 2, y + h / 2);
  }

  boolean isMouseOver(float mx, float my) {
    return mx > x && mx < x + w && my > y && my < y + h;
  }
}
