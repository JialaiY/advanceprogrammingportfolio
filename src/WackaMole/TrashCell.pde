class TrashCell extends Cell {
  TrashCell(int x, int y) {
    super(x, y);
  }

  void display() {
    fill(255, 0, 0);
    rect(x * 50, y * 50, 50, 50);
  }
}
