abstract class Cell {
  int x, y;
  boolean isClicked = false;

  Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  abstract void display();
}
