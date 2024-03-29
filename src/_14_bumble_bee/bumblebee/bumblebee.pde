void draw() {
/*Use a loop to make a body for the Bee!
Then put his head on using drawBeeFace(x,y)
Use Modulo to make the colors alternate 
*/
}

void drawFlower(int x, int y) {
     noStroke();
     translate(x, y);
     // draw 5 petals, rotating after each one
     fill(#c6ff89);      // green
      for (int i = 0; i < 5; i++) {
           ellipse(0, -40, 50, 50);
          rotate(radians(72));
     }
     fill(#fff9bb); // light yellow
     ellipse(0, 0, 50, 50);
} 
void drawBeeFace(int BeeFaceX, int BeeFaceY) {
     noStroke();
     fill(0, 0, 0);
     stroke(1);
     strokeWeight(5);
     line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
     line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
     ellipse(BeeFaceX-17, BeeFaceY-50, 10, 10);
     ellipse(BeeFaceX+17, BeeFaceY-50, 10, 10);
     noStroke();
     fill(183,142,76);
     ellipse(BeeFaceX, BeeFaceY, 60, 60); // face
     fill(255, 237, 209);
     fill(0,0,0);
      ellipse(BeeFaceX-10, BeeFaceY-15, 10, 10); // eyes
     ellipse(BeeFaceX+10, BeeFaceY-15, 10, 10);
      ellipse(BeeFaceX, BeeFaceY-5, 10, 10); // nose
      ellipse(BeeFaceX, BeeFaceY+10, 20, 10);// mouth
     fill(#C19B5E);
     ellipse(BeeFaceX, BeeFaceY+5, 20, 6);
}

void setup() {
     int x =50;
     int y =50;
  ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
     for(int i=0; i <40;i ++){
      if(i%2==0){
         fill(#C69456);
         ellipse(x,y,80,80);
      }
      else{
         fill(#764201);
         ellipse(x,y,80,80);
      }
      x=x+10;
      y=y+10;
     }
     drawBeeFace(x,y);

fill(#B28956);


     drawFlower(350, 100);
      /*for(int l=0; l<30;l++){
      if(l%2==0){
      fill(#C69456);
      }else{
     
        fill(#764201);
      }
      ellipse(0+l*-2
  ,0+l*7,80,80);
      }*/
}
