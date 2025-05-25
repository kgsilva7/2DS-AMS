int led1 = 8;
int led2 = 9;
int led3 = 10;
int led4 = 11;
int botao = 2;
boolean estado_botao;

void setup()
{
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);
  pinMode(botao, INPUT);
  digitalWrite(botao, LOW);
}

void loop()
{
	estado_botao = digitalRead(botao);
  
  if(estado_botao == HIGH){
  
	digitalWrite(led1, HIGH);
    delay(1000);
    digitalWrite(led1, LOW);
    delay(500);
    digitalWrite(led2, HIGH);
    delay(1000);
    digitalWrite(led2, LOW);
    delay(500);
    digitalWrite(led3, HIGH);
    delay(1000);
    digitalWrite(led3, LOW);
    delay(500);
    digitalWrite(led4, HIGH);
    delay(1000);
    digitalWrite(led4, LOW);
    delay(500);
    digitalWrite(estado_botao, LOW);
    
  }
  else{
  
  	digitalWrite(led1, LOW);
    digitalWrite(led2, LOW);
    digitalWrite(led3, LOW);
    digitalWrite(led4, LOW);
    
  }
}