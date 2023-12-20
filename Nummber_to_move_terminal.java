public class Nummber_to_move_terminal {

  public static String[] getNumbers(String[][] board){ 
  String[] nummern;                          //definiere Array um dem Hauptprogramm zu übergeben

  String x;
  String y;
  String z;
  String w;

  nummern = null;

  //Erste Reihe ----------------------------------------------
  //----------------------------------------------------------
  if (board[1][1] == "" ) {

    x = board[1][2];
    y = board[2][1];

    nummern = new String[] {x, y};
    return nummern;
  };

  if (board[1][2] == "") {
    x = board[1][1];
    y = board[1][3];
    z = board[2][2];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[1][3] == "") {

    x = board[1][2];
    y = board[2][3];

    nummern = new String[] {x, y};
    return nummern;
  };

  //Zweite Reihe ---------------------------------------------
  //----------------------------------------------------------

  if (board[2][1] == "") {
    x = board[1][1];
    y = board[2][2];
    z = board[3][1];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[2][2] == "") {
    x = board[1][2];
    y = board[2][1];
    z = board[2][3];
    w = board[3][2];
    nummern = new String[] {x, y, z, w};
    return nummern;
  };

   if (board[2][3] == "") {
    x = board[1][3];
    y = board[2][2];
    z = board[3][3];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  //Dritte Reihe ---------------------------------------------
  //----------------------------------------------------------
if (board[3][1] == "") {

    x = board[2][1];
    y = board[3][2];

    nummern = new String[] {x, y};
    return nummern;
  };

  if (board[3][2] == "") {
    x = board[3][1];
    y = board[3][3];
    z = board[2][2];
    nummern = new String[] {x, y, z};
    return nummern;
  };

  if (board[3][3] == "") {

    x = board[3][2];
    y = board[2][3];

    nummern = new String[] {x, y};
    return nummern;
  };
  return nummern;
}}