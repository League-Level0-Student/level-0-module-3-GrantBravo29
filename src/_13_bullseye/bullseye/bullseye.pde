int size = 200;
void setup() {
  
 size(500, 500);
  for(int i = 0; i < 8; i++){
  
    if(i%2==0){
      
      fill(255,0,0);
    }
    else{
      fill(0,0,0);
    }
    
  ellipse(250, 250, size, size);
  size=size-25;
 }
}
void draw() {
} 
