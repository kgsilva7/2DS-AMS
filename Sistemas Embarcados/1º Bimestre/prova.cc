const int leds[] = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
const int numLeds = 10;
const int botao = 3;  
boolean estado_botao;

void setup() {
    for (int i = 0; i < numLeds; i++) {
        pinMode(leds[i], OUTPUT);
    }
    pinMode(botao, INPUT_PULLUP);
}

void loop() {
   estado_botao = digitalRead(botao);
    if (digitalRead(botao) == LOW) {  
        for (int i = 0; i < 3; i++) {
            sequenciaLeds();
        }
        piscarLeds(10);
    } else {
        apagarLeds();
    }
}

void sequenciaLeds() {
    for (int i = 0; i < numLeds; i++) {
        digitalWrite(leds[i], HIGH);
        delay(150);
        digitalWrite(leds[i], LOW);
    }
    for (int i = numLeds - 1; i >= 0; i--) {
        digitalWrite(leds[i], HIGH);
        delay(150);
        digitalWrite(leds[i], LOW);
    }
}

void piscarLeds(int vezes) {
    for (int i = 0; i < 5; i++) {
        if (digitalRead(botao) == LOW) return;  
        for (int j = 0; j < numLeds; j++) {
            digitalWrite(leds[j], HIGH);
        }
        delay(300);
        for (int j = 0; j < numLeds; j++) {
            digitalWrite(leds[j], LOW);
        }
        delay(300);
    }
}

void apagarLeds() {
    for (int i = 0; i < numLeds; i++) {
        digitalWrite(leds[i], LOW);
    }
}
