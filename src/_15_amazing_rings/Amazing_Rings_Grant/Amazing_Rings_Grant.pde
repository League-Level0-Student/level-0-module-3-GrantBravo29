int x1=250;
int x2=800;
void setup() {
  
 size(1000, 1000);

}

void draw() {
 background(100,100,100);
  int size1 = 200;
  int size2=200;
  for(int i = 0; i < 8; i++){
      noFill();  
      ellipse(x1, 250, size1, size1);
      size1=size1-25;

  } 
  for(int i = 0; i < 8; i++){
      noFill();  
      ellipse(x2, 250, size2, size2);
      size2=size2-25;
  }
  
  x1=x1+2;
  x2=x2-2;
  if(x1>=1000
  
}
  
