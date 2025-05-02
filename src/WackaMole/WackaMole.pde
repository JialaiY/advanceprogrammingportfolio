Cell[][] grid;
int gridSize = 5;
int score = 0;
int gameStartTime;
boolean gameRunning = false;

Button startButton;
PFont font;

void setup() {
  size(400, 400);
  font = createFont("Arial", 20);
  textFont(font);
  grid = new Cell[gridSize][gridSize];
  startButton = new Button("Start", 150, height - 50);
  initGrid(); 
}

void draw() {
  background(255);

  if (gameRunning) {
    int timeLeft = 30 - (millis() - gameStartTime) / 1000;
    if (timeLeft <= 0) {
      gameRunning = false;
      showEndScreen(false);
      return;
    }

    // Display grid
    for (Cell[] row : grid) {
      for (Cell c : row) {
        c.display();
      }
    }

    fill(0);
    textSize(20);
    text("Score: " + score, width - 100, 50);
    text("Time: " + timeLeft, width - 100, 20);

    if (score >= 200) {
      gameRunning = false;
      showEndScreen(true);
    }
  } else {
    startButton.display();
    textAlign(CENTER);
    fill(0);
    textSize(24);
    text("Whack-a-Mole", width / 2, 50);
  }
}

void mousePressed() {
  try {
    if (!gameRunning && startButton.isMouseOver(mouseX, mouseY)) {
      startGame();
    }

    if (gameRunning) {
      int gridX = mouseX / 50;
      int gridY = mouseY / 50;

      if (gridX < gridSize && gridY < gridSize) {
        Cell clicked = grid[gridX][gridY];
        if (!clicked.isClicked && clicked instanceof TrashCell) {
          clicked.isClicked = true;
          score += 10;
          refreshGrid(); 
        }
      }
    }
  } catch (Exception e) {
    println("Error: " + e.getMessage());
  }
}

void startGame() {
  score = 0;
  gameStartTime = millis();
  gameRunning = true;
  refreshGrid();
}

void initGrid() {
  for (int i = 0; i < gridSize; i++) {
    for (int j = 0; j < gridSize; j++) {
      grid[i][j] = new EmptyCell(i, j);
    }
  }
}

void refreshGrid() {
  for (int i = 0; i < gridSize; i++) {
    for (int j = 0; j < gridSize; j++) {
      grid[i][j] = (random(1) < 0.2) ? new TrashCell(i, j) : new EmptyCell(i, j); // 20% chance for mole
    }
  }
}

void showEndScreen(boolean win) {
  background(255);
  fill(0);
  textAlign(CENTER, CENTER);
  textSize(32);
  if (win) {
    text("You Win!", width / 2, height / 2);
  } else {
    text("Time's Up!", width / 2, height / 2);
  }
  textSize(20);
  text("Score: " + score, width / 2, height / 2 + 40);
  text("Click 'Start' to play again", width / 2, height / 2 + 80);
  startButton.display();
}
