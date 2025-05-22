class EmptyCell extends Cell {
  EmptyCell(int x, int y) {
    super(x, y);
  }

  void display() {
    fill(200);
    rect(x * 50, y * 50, 50, 50);
  }
}
