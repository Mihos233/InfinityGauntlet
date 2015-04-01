// InfinityGuantlet LED Interface.
// Mark Bowling 2015

#include <SoftwareSerial.h> 
#include <SmartThings.h>

#define PIN_THING_RX    3
#define PIN_THING_TX    2

const int spacePin = 4;
const int mindPin = 5;
const int soulPin = 6;
const int realityPin = 7;
const int timePin = 8;
const int powerPin = 9;

SmartThingsCallout_t messageCallout;    
SmartThings smartthing(PIN_THING_RX, PIN_THING_TX, messageCallout);  

void setup() {
  pinMode(spacePin, OUTPUT); 
  pinMode(mindPin, OUTPUT);
  pinMode(soulPin, OUTPUT); 
  pinMode(realityPin, OUTPUT);
  pinMode(timePin, OUTPUT); 
  pinMode(powerPin, OUTPUT);
  Serial.begin(9600);
  Serial.println("Device Started");
}

void loop() {
  smartthing.run();
  //stuff
}


void messageCallout(String message)
{
  if (message.equals("spaceOn"))
  {
    digitalWrite(spacePin, HIGH);
    smartthing.send("spaceOn");
  }
  else if (message.equals("spaceOff"))
  {
    digitalWrite(spacePin, LOW);
    smartthing.send("spaceOff");
  }
    else if (message.equals("mindOn"))
  {
    digitalWrite(mindPin, HIGH);
    smartthing.send("mindOn");
  }
    else if (message.equals("mindOff"))
     {
    digitalWrite(mindPin, LOW);
    smartthing.send("mindOff");
  }
    else if (message.equals("soulOn"))
  {
    digitalWrite(soulPin, HIGH);
    smartthing.send("soulOn");
  }
    else if (message.equals("soulOff"))
  {
    digitalWrite(soulPin, LOW);
    smartthing.send("soulOff");
  }
    else if (message.equals("realityOn"))
  {
    digitalWrite(realityPin, HIGH);
    smartthing.send("realityOn");
  }
    else if (message.equals("realityOff"))
  {
    digitalWrite(realityPin, LOW);
    smartthing.send("realityOff");
  }  
    else if (message.equals("timeOn"))
  {
    digitalWrite(timePin, HIGH);
    smartthing.send("timeOn");
  }
    else if (message.equals("timeOff"))
  {
    digitalWrite(timePin, LOW);
    smartthing.send("timeOff");
  }
    else if (message.equals("powerOn"))
  {
    digitalWrite(powerPin, HIGH);
    smartthing.send("powerOn");
  }
    else if (message.equals("powerOff"))
  {
    digitalWrite(powerPin, LOW);
    smartthing.send("powerOff");
  }
}
