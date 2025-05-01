Cell[][] grid;
int gridSize = 5;
int score = 0;

Button startButton, resetButton;

void setup()
{
  size(400, 400);
  grid = new Cell[gridSize][gridSize];
  startButton = new Button("Start", width/2 - 100, height - 60);
  resetButton = new Button("Reset", width/2 + 20, height - 60);

  // Initialize the grid with random cells
  for (int i = 0; i < gridSize; i++) 
  {
    for (int j = 0; j < gridSize; j++) 
    {
      if (random(1) > 0.99999) 
      {
        grid[i][j] = new TrashCell(i, j);
      } 
      else 
      {
        grid[i][j] = new EmptyCell(i, j);
      }
    }
  }
}

void draw() 
{
  background(255);

  // Display grid cells
  for (Cell[] row : grid) {
    for (Cell c : row) {
      c.display();
    }
  }

  // Display buttons
  startButton.display();
  resetButton.display();

  // Display score
  fill(0);
  textSize(24);
  text("Score: " + score, width - 75, 30);
}

void mousePressed() 
{
  try 
  {
    if (startButton.isMouseOver(mouseX, mouseY)) 
    {
      startGame();
    }
    if (resetButton.isMouseOver(mouseX, mouseY)) 
    {
      resetGame();
    }

    // Handle grid cell clicks
    int gridX = mouseX / 50;
    int gridY = mouseY / 50;

    if (gridX < gridSize && gridY < gridSize && grid[gridX][gridY] != null) 
    {
      Cell clickedCell = grid[gridX][gridY];
      if (!clickedCell.isClicked) 
      {
        clickedCell.isClicked = true;
        if (clickedCell instanceof TrashCell) 
        {
          score += 10;
        }
      }
    }
  }
  catch (Exception e) {
    println("Error: " + e.getMessage());
  }
}

// Start the game
void startGame() 
{
  score = 0;
  for (int i = 0; i < gridSize; i++) 
  {
    for (int j = 0; j < gridSize; j++) 
    {
      grid[i][j] = random(1) > 0.7 ? new TrashCell(i, j) : new EmptyCell(i, j);
    }
  }
}

// Reset the game
void resetGame() 
{
  score = 0;
  for (int i = 0; i < gridSize; i++) 
  {
    for (int j = 0; j < gridSize; j++) 
    {
      grid[i][j] = new EmptyCell(i, j);
    }
  }
}
