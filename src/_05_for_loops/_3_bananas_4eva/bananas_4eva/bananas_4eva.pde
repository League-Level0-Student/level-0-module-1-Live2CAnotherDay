String banana = "banana";
int x = 0; 
int y = 0;
PImage bananaPic;

void setup() {
    bananaPic = loadImage("Banana.png");
    size(1000, 1000);
    noStroke();
    
}
int banana_count = 0;
void draw() {
while (banana_count <= 50) {    
    image(bananaPic, x, y);
    x += 25;
    y += 25;
    banana_count++; 
}
int x = 1000;
int y = 1000;
while (banana_count <= 50) {    
    image(bananaPic, x, y);
    x -= 25;
    y -= 25;
    banana_count++; 
}
}
