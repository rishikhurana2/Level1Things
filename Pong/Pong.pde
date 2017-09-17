float circleX = 400;
float circleY = 400;
float circleW = 50;
float circleH = 50;
float circleXSpeed = 3;
float circleYSpeed = 4;
PImage backgroundImage;
float paddleY = height + 660;
float paddleH = 20;
float paddleW = 100;
int score = 0;
void setup() {
  textAlign(CENTER);
  textSize(23);
  size(800, 800, P2D);
  backgroundImage = loadImage("download.jpeg");
}

void draw() {
  int paddleX = mouseX;
  image(backgroundImage, 0, 0, 800, 800);
  ellipse(circleX, circleY, circleH, circleW); 
  fill(255, 0, 0);
  stroke(255,0,0);
  circleX = circleX + circleXSpeed;
  circleY = circleY + circleYSpeed;
  if (circleX > width) {
     circleXSpeed = circleXSpeed * -1;
  }
  if (circleX < 0) {
     circleXSpeed = circleXSpeed * -1; 
  }
  if (circleY > height) {
     reset();
     score = 0;
  }
  if (circleY < 0) {
     circleYSpeed = circleYSpeed * -1;
  }
  rect(paddleX, paddleY, paddleW, paddleH);
  if (circleY > paddleY && circleX > paddleX && circleX < paddleX + paddleW) {
    circleYSpeed = circleYSpeed * -1;
    circleYSpeed = circleYSpeed * 1.08;
    score = score + 1;
  }
  text("Score: " + score, 700, 20);
}

void reset() {
  circleX = 400;
  circleY = 400;
  circleXSpeed = circleXSpeed * -1;
}