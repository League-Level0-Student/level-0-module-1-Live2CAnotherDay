import ddf.minim.*;
Minim minim;
AudioPlayer sound;

void setup() {
size(700, 700); 
fill(222, 194, 116);
ellipse(width/2, height/2, 500, 500);
minim = new Minim(this);
sound = minim.loadFile("ding.wav");
}
void draw() {

PImage pepperoni;
pepperoni = loadImage("pepperoni.png");
pepperoni.resize(75, 75);
if (mousePressed){
  image(pepperoni, mouseX, mouseY);
  sound.play();
  sound.rewind();
}
}
