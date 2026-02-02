// C++ code
//
void setup()
{
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(2, OUTPUT);
}

void loop()
{
  digitalWrite(13, HIGH);
  digitalWrite(7, HIGH);
  digitalWrite(8, HIGH);
  digitalWrite(2, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(13, LOW);
  digitalWrite(7, LOW);
  digitalWrite(8, LOW);
  digitalWrite(2, LOW);
  delay(5000); // Wait for 1000 millisecond(s)
  
  digitalWrite(3, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(6, HIGH);
  digitalWrite(12, HIGH);
  delay(500); // Wait for 1000 millisecond(s)
  digitalWrite(3, LOW);
  digitalWrite(9, LOW);
  digitalWrite(6, LOW);
  digitalWrite(12, LOW);
  delay(2500); // Wait for 1000 millisecond(s)
  
  digitalWrite(4, HIGH);
  digitalWrite(10, HIGH);
  digitalWrite(11, HIGH);
  digitalWrite(5, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(4, LOW);
  digitalWrite(10, LOW);
  digitalWrite(11, LOW);
  digitalWrite(5, LOW);
  delay(5000); // Wait for 1000 millisecond(s)
  
  digitalWrite(3, HIGH);
  digitalWrite(9, HIGH);
  digitalWrite(6, HIGH);
  digitalWrite(12, HIGH);
  delay(500); // Wait for 1000 millisecond(s)
  digitalWrite(3, LOW);
  digitalWrite(9, LOW);
  digitalWrite(6, LOW);
  digitalWrite(12, LOW);
  delay(2500); // Wait for 1000 millisecond(s)
}