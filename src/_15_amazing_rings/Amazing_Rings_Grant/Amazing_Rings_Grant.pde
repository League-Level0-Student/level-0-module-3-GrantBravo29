int x1=250;
int x2=800;
int x1Speed=2;
int x2Speed=-2;
void setup() {

  size(1000, 1000);
  smooth(8);
}

void draw() {
  background(100, 100, 100);
  int size1 = 300;
  int size2=300;
  for (int i = 0; i < 16; i++) {
    noFill();  
    ellipse(x1, 250, size1, size1);
    size1=size1-25;
  } 
  for (int i = 0; i < 16; i++) {
    noFill();  
    ellipse(x2, 250, size2, size2);
    size2=size2-25;
  }
  if (x1>800) {
    x1Speed=-2;
  }







  if (x1<250) {
    x1Speed=2;
  }

  x1=x1+x1Speed;
  x2=x2+x2Speed;
  if (x1>=1000) {
  }
  if (x2>800) {
    x2Speed=-2;
  }







  if (x2<250) {
    x2Speed=2;
  }
}
