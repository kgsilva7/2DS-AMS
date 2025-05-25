int ledVER = 11;
int ledAMA = 12;
int ledRED = 13;
int pedVER = 10;
int pedRED = 9;
int botao = 8;
boolean estado_botao;
int segmentA = 5;
int segmentB = 4;
int segmentC = 3;
int segmentD = 2;
int segmentE = 1;
int segmentF = 6;
int segmentG = 7;

void setup()
{
    pinMode(ledVER, OUTPUT);
    pinMode(ledAMA, OUTPUT);
    pinMode(ledRED, OUTPUT);
    pinMode(pedVER, OUTPUT);
    pinMode(pedRED, OUTPUT);
    pinMode(botao, INPUT);
    digitalWrite(botao, HIGH);
    pinMode(segmentA, OUTPUT);
    pinMode(segmentB, OUTPUT);
    pinMode(segmentC, OUTPUT);
    pinMode(segmentD, OUTPUT);
    pinMode(segmentE, OUTPUT);
    pinMode(segmentF, OUTPUT);
    pinMode(segmentG, OUTPUT);
}

void loop()
{
    estado_botao = digitalRead(botao);
    
    if(estado_botao == LOW){
        exibirNumero(9);
        delay(1000);
        exibirNumero(8);
        delay(1000);
        exibirNumero(7);
        delay(1000);
        exibirNumero(6);
        delay(1000);
        exibirNumero(5);
        delay(1000);
        exibirNumero(4);
        delay(1000);
        exibirNumero(3);
        digitalWrite(ledVER, LOW);
        digitalWrite(ledAMA, HIGH);
        delay(1000);
        exibirNumero(2);
        delay(1000);
        exibirNumero(1);
        delay(1000);
        exibirNumero(0);
        digitalWrite(ledAMA, LOW);
        digitalWrite(ledRED, HIGH);
        digitalWrite(pedRED, LOW);
        digitalWrite(pedVER, HIGH);
        delay(1000);
        
        exibirNumero(9);
        delay(1000);
        exibirNumero(8);
        delay(1000);
        exibirNumero(7);
        delay(1000);
        exibirNumero(6);
        delay(1000);
        exibirNumero(5);
        delay(1000);
        exibirNumero(4);
        delay(1000);
        exibirNumero(3);
        delay(1000);
        exibirNumero(2);
        delay(1000);
        exibirNumero(1);
        delay(1000);
        exibirNumero(0);
        delay(1000);
        digitalWrite(pedVER, LOW);
        digitalWrite(ledRED, LOW);
    } 
    else{
        digitalWrite(ledVER, HIGH);
        digitalWrite(ledAMA, LOW);
        digitalWrite(ledRED, LOW);
        digitalWrite(pedVER, LOW);
        digitalWrite(pedRED, HIGH);
        digitalWrite(segmentA, HIGH);
        digitalWrite(segmentB, HIGH);
        digitalWrite(segmentC, HIGH);
        digitalWrite(segmentD, HIGH);
        digitalWrite(segmentE, HIGH);
        digitalWrite(segmentF, HIGH);
        digitalWrite(segmentG, HIGH);
    }
}

void exibirNumero(int num) {
    switch (num) {
        case 0:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, LOW);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, HIGH);
            break;
        case 1:
            digitalWrite(segmentA, HIGH);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, HIGH);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, HIGH);
            digitalWrite(segmentG, HIGH);
            break;
        case 2:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, HIGH);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, LOW);
            digitalWrite(segmentF, HIGH);
            digitalWrite(segmentG, LOW);
            break;
        case 3:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, HIGH);
            digitalWrite(segmentG, LOW);
            break;
        case 4:
            digitalWrite(segmentA, HIGH);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, HIGH);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, LOW);
            break;
        case 5:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, HIGH);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, LOW);
            break;
        case 6:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, HIGH);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, LOW);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, LOW);
            break;
        case 7:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, HIGH);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, HIGH);
            digitalWrite(segmentG, HIGH);
            break;
        case 8:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, LOW);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, LOW);
            break;
        case 9:
            digitalWrite(segmentA, LOW);
            digitalWrite(segmentB, LOW);
            digitalWrite(segmentC, LOW);
            digitalWrite(segmentD, LOW);
            digitalWrite(segmentE, HIGH);
            digitalWrite(segmentF, LOW);
            digitalWrite(segmentG, LOW);
            break;
    }
}