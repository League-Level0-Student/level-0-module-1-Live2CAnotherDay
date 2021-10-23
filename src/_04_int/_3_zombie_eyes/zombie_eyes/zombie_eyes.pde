
void setup() {
PImage face = loadImage("dogs.jpeg");
size(1000, 1000);
face.resize(1000,1000);
background(face);
}
void draw() {
fill(255, 15, 15);
ellipse (340, 350, 20, 15);
ellipse (417, 337, 20, 15);
ellipse (660, 300, 25, 15);
ellipse (720, 302, 10, 10);
fill(10, 10, 10);
ellipse (340, 350, 3, 3);
ellipse (417, 337, 3, 3);
ellipse (660, 300, 3, 3);
ellipse (720, 302, 3, 3);
}
