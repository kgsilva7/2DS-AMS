int ledVER = 10;
int ledAMA = 11;
int ledRED = 12;
int pedRED = 8;
int pedVER = 9;
int botao = 2;
boolean estado_botao;

void setup()
{
  pinMode(botao, INPUT);
  digitalWrite(botao, LOW);
  pinMode(ledVER, OUTPUT);
  pinMode(ledAMA, OUTPUT);
  pinMode(ledRED, OUTPUT);
  pinMode(pedRED, OUTPUT);
  pinMode(pedVER, OUTPUT);
}

void loop()
{
  estado_botao = digitalRead(botao);
  
  if (estado_botao == HIGH) {
  digitalWrite(ledVER, LOW);
  delay(500);
  digitalWrite(ledAMA, HIGH);
  delay(1500);
  digitalWrite(ledAMA, LOW);
  delay(1000);
  digitalWrite(pedRED, LOW);
  digitalWrite(ledRED, HIGH);
  digitalWrite(pedVER, HIGH);
  delay(1500);
  digitalWrite(pedVER, LOW);
  delay(500);
  digitalWrite(pedVER, HIGH);
  delay(500);
  digitalWrite(pedVER, LOW);
  delay(500);
  digitalWrite(pedVER, HIGH);
  delay(500);
  digitalWrite(ledRED, LOW);
  digitalWrite(pedVER, LOW);
  delay(500);
  digitalWrite(pedRED, HIGH);
  delay(3000);
  digitalWrite(pedRED, LOW);
  delay(1000);
  }
  
  else {
    digitalWrite(ledVER, HIGH);
	digitalWrite(ledAMA, LOW);
    digitalWrite(pedRED, HIGH);
	}
}