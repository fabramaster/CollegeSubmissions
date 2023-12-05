//Co-developed by
//Immanual Wiessler 300332880
//Alexander Ross    300213662
#include <stdio.h>

int main() {
  //Please modify the date to be correct
  finding(2023);
    return 0;
}
 int finding(int year) {
  int G;    // Golden Number
  int C;    // Century
  int X;
  int Z;
  int D;
  int E;
  int Month;
  int day;
  G = (year % 19) + 1;
  C = (year / 100) + 1;
  //if ((year % 100) == 0) {
    X = (3 * C / 4) - 12;       // Number of years
    Z = ((8 * C + 5) / 25) - 5; //
 // }
  D = (5 * year / 4) - X - 10;
  E = (11 * G + 20 + Z - X) % 30; // Epact value

  if ((E == 25 && G > 11) || E == 24) {
    E = E + 1;
  }
  int N = 44 - E; //full moon
  if (N < 21) {
    N = N + 30;
  }
  N = N + 7 - ((D + N) % 7);
  if (N > 31) {
    Month = 4;
    day = N - 31;

  } else {
    Month = 3;
    day = N;
  }
   printf("Month: %d\nDay: %d",Month, day);
}
