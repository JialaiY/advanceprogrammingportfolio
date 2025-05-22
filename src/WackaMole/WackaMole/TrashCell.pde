class TrashCell extends Cell {
  TrashCell(int x, int y) {
    super(x, y);
  }

  void display() {
    fill(139, 69, 19); 
    ellipse(x * 50 + 25, y * 50 + 25, 40, 40);
  }
}
