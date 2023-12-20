// check welche Zahlen neben dem leeren Feld stehen 



public class Nummber_to_move_terminal {       
  char[] nummern;                          //definiere Array um dem Hauptprogramm zu übergeben

  char x;
  
  nummern = null;

  //Erste Reihe ----------------------------------------------
  //----------------------------------------------------------
  if (verschiebeSpiel[1][1] = " ") {

    x = verschiebeSpiel[1][2];
    y = verschiebeSpiel[2][1];

    nummern = [{x, y}];
    return nummern;
  };
  
  if (verschiebeSpiel[1][2] = " ") {
    x = verschiebeSpiel[1][1];
    y = verschiebeSpiel[1][3];
    z = verschiebeSpiel[2][2];
    nummern = [{x, y, z}];
    return nummern;
  };

  if (verschiebeSpiel[1][3] = " ") {

    x = verschiebeSpiel[1][2];
    y = verschiebeSpiel[2][3];

    nummern = [{x, y}];
    return nummern;
  };

  //Zweite Reihe ---------------------------------------------
  //----------------------------------------------------------

  if (verschiebeSpiel[2][1] = " ") {
    x = verschiebeSpiel[1][1];
    y = verschiebeSpiel[2][2];
    z = verschiebeSpiel[3][1];
    nummern = [{x, y, z}];
    return nummern;
  };

  if (verschiebeSpiel[2][2] = " ") {
    x = verschiebeSpiel[1][2];
    y = verschiebeSpiel[2][1];
    z = verschiebeSpiel[2][3];
    w = verschiebeSpiel[3][2];
    nummern = [{x, y, z, w}];
    return nummern;
  };

   if (verschiebeSpiel[2][3] = " ") {
    x = verschiebeSpiel[1][3];
    y = verschiebeSpiel[2][2];
    z = verschiebeSpiel[3][3];
    nummern = [{x, y, z}];
    return nummern;
  };
  
  //Dritte Reihe ---------------------------------------------
  //----------------------------------------------------------

  if (verschiebeSpiel[3][1] = " ") {

    x = verschiebeSpiel[2][1];
    y = verschiebeSpiel[3][2];

    nummern = [{x, y}];
    return nummern;
  };
  
  if (verschiebeSpiel[3][2] = " ") {
    x = verschiebeSpiel[3][1];
    y = verschiebeSpiel[3][3];
    z = verschiebeSpiel[2][2];
    nummern = [{x, y, z}];
    return nummern;
  };

  if (verschiebeSpiel[3][3] = " ") {

    x = verschiebeSpiel[3][2];
    y = verschiebeSpiel[2][3];

    nummern = [{x, y}];
    return nummern;
  };


  
}
