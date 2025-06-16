#include <Servo.h>
const int B1_PIN = 5;
const int B2_PIN = 4;
const int B3_PIN = 3;
const int B4_PIN = 2;
const int B5_PIN = 11;
const int LED_PIN = 10;
const int SERVO1_PIN = 7;
const int SERVO2_PIN = 6;
int b1State = LOW;
int b2State = LOW;
int b3State = LOW;
int b4State = LOW;
int b5State = LOW;
Servo servo1;
Servo servo2;
void setup() {
  pinMode(B1_PIN, INPUT);
  pinMode(B2_PIN, INPUT);
  pinMode(B3_PIN, INPUT);
  pinMode(B4_PIN, INPUT);
  pinMode(B5_PIN, INPUT);
  pinMode(LED_PIN, OUTPUT);
  servo1.attach(SERVO1_PIN);
  servo2.attach(SERVO2_PIN);
  servo1.write(0);
  servo2.write(0);
  digitalWrite(LED_PIN, LOW);
}
void loop() {
  b1State = digitalRead(B1_PIN);
  b2State = digitalRead(B2_PIN);
  b3State = digitalRead(B3_PIN);
  b4State = digitalRead(B4_PIN);
  b5State = digitalRead(B5_PIN);
  if (b1State == HIGH) {
    servo1.write(90);
  }
  if (b2State == HIGH) {
    servo1.write(0);
  }
  if (b3State == HIGH) {
    servo2.write(180);
  }
  if (b4State == HIGH) {
    servo2.write(0);
  }
  if (b5State == HIGH) {
    digitalWrite(LED_PIN, HIGH);
    servo1.write(90);
    servo2.write(180);
  } else {
    digitalWrite(LED_PIN, LOW);
  }
  delay(100);
}