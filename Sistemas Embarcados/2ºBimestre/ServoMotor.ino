#include <Servo.h>
Servo servo;
int pos;
void setup (){
servo.attach(6);
servo.write(0);
pinMode(8, OUTPUT);
pinMode(4, OUTPUT);
pinMode(2, OUTPUT);
delay(1000);
}
void loop(){
pos = analogRead(A0);
pos = map(pos, 0, 1023, 0, 180);
servo.write(pos);
if (pos <5){
tone(8,250);
digitalWrite(4, HIGH);
digitalWrite(2, LOW);
}else if (pos > 175){
  tone(8,250);
digitalWrite(4, LOW);
digitalWrite(2, HIGH);
}else{
noTone(8);
digitalWrite(4, LOW);
digitalWrite(2, LOW);
}
delay(15);
}