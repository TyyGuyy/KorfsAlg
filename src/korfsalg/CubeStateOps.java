/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package korfsalg;

/**
 *
 * @author Tyler
 */
public class CubeStateOps {
    
    String cubeState;
    
    public String move(String state, String op) {
        
        cubeState = "";
        
        if (op.equals("R1")){
            cubeState += (state.charAt(6));
            cubeState += (state.charAt(3));
            cubeState += (state.charAt(0));
            cubeState += (state.charAt(7));
            cubeState += (state.charAt(4));
            cubeState += (state.charAt(1));
            cubeState += (state.charAt(8));
            cubeState += (state.charAt(5));
            cubeState += (state.charAt(2));
            cubeState += (state.substring(12, 18));
            cubeState += (state.charAt(53));
            cubeState += (state.charAt(52));
            cubeState += (state.charAt(51));
            cubeState += (state.substring(18, 51));
            cubeState += (state.charAt(11));
            cubeState += (state.charAt(10));
            cubeState += (state.charAt(9));
        }
        else if (op.equals("R2")) {
            cubeState += (state.charAt(8));
            cubeState += (state.charAt(7));
            cubeState += (state.charAt(6));
            cubeState += (state.charAt(5));
            cubeState += (state.charAt(4));
            cubeState += (state.charAt(3));
            cubeState += (state.charAt(2));
            cubeState += (state.charAt(1));
            cubeState += (state.charAt(0));
            cubeState += (state.substring(15, 18));
            cubeState += (state.charAt(53));
            cubeState += (state.charAt(52));
            cubeState += (state.charAt(51));
            cubeState += (state.substring(9, 12));
            cubeState += (state.substring(18, 51));
            cubeState += (state.charAt(14));
            cubeState += (state.charAt(13));
            cubeState += (state.charAt(12));
            
        }
        else if (op.equals("R3")) {
            cubeState += (state.charAt(2));
            cubeState += (state.charAt(5));
            cubeState += (state.charAt(8));
            cubeState += (state.charAt(1));
            cubeState += (state.charAt(4));
            cubeState += (state.charAt(7));
            cubeState += (state.charAt(0));
            cubeState += (state.charAt(3));
            cubeState += (state.charAt(6));
            cubeState += (state.charAt(53));
            cubeState += (state.charAt(52));
            cubeState += (state.charAt(51));
            cubeState += (state.substring(9, 15));
            cubeState += (state.substring(18, 51));
            cubeState += (state.charAt(17));
            cubeState += (state.charAt(16));
            cubeState += (state.charAt(15));
        }
        else if (op.equals("G1")) {
            cubeState += state.charAt(45);
            cubeState += state.substring(1, 3);
            cubeState += state.charAt(48);
            cubeState += state.substring(4, 6);
            cubeState += state.charAt(51);
            cubeState += state.substring(7, 9);
            cubeState += state.charAt(27);
            cubeState += state.charAt(18);
            cubeState += state.charAt(9);
            cubeState += state.charAt(0);
            cubeState += state.substring(13, 18);
            cubeState += state.charAt(28);
            cubeState += state.charAt(19);
            cubeState += state.charAt(10);
            cubeState += state.charAt(3);
            cubeState += state.substring(22, 27);
            cubeState += state.charAt(29);
            cubeState += state.charAt(20);
            cubeState += state.charAt(11);
            cubeState += state.charAt(6);
            cubeState += state.substring(31, 36);
            cubeState += state.charAt(12);
            cubeState += state.substring(37, 39);
            cubeState += state.charAt(21);
            cubeState += state.substring(40, 42);
            cubeState += state.charAt(30);
            cubeState += state.substring(43, 45);
            cubeState += state.charAt(36);
            cubeState += state.substring(46, 48);
            cubeState += state.charAt(39);
            cubeState += state.substring(49, 51);
            cubeState += state.charAt(42);
            cubeState += state.substring(52);
        }
        else if (op.equals("G2")) {
            cubeState += state.charAt(36);
            cubeState += state.substring(1, 3);
            cubeState += state.charAt(39);
            cubeState += state.substring(4, 6);
            cubeState += state.charAt(42);
            cubeState += state.substring(7, 9);
            cubeState += state.charAt(29);
            cubeState += state.charAt(28);
            cubeState += state.charAt(27);
            cubeState += state.charAt(45);
            cubeState += state.substring(13, 18);
            cubeState += state.charAt(20);
            cubeState += state.charAt(19);
            cubeState += state.charAt(18);
            cubeState += state.charAt(48);
            cubeState += state.substring(22, 27);
            cubeState += state.charAt(11);
            cubeState += state.charAt(10);
            cubeState += state.charAt(9);
            cubeState += state.charAt(51);
            cubeState += state.substring(31, 36);
            cubeState += state.charAt(0);
            cubeState += state.substring(37, 39);
            cubeState += state.charAt(3);
            cubeState += state.substring(40, 42);
            cubeState += state.charAt(6);
            cubeState += state.substring(43, 45);
            cubeState += state.charAt(12);
            cubeState += state.substring(46, 48);
            cubeState += state.charAt(21);
            cubeState += state.substring(49, 51);
            cubeState += state.charAt(30);
            cubeState += state.substring(52);
        }
        else if (op.equals("G3")) {
            cubeState += state.charAt(12);
            cubeState += state.substring(1, 3);
            cubeState += state.charAt(21);
            cubeState += state.substring(4, 6);
            cubeState += state.charAt(30);
            cubeState += state.substring(7, 9);
            cubeState += state.charAt(11);
            cubeState += state.charAt(20);
            cubeState += state.charAt(29);
            cubeState += state.charAt(36);
            cubeState += state.substring(13, 18);
            cubeState += state.charAt(10);
            cubeState += state.charAt(19);
            cubeState += state.charAt(28);
            cubeState += state.charAt(39);
            cubeState += state.substring(22, 27);
            cubeState += state.charAt(9);
            cubeState += state.charAt(18);
            cubeState += state.charAt(27);
            cubeState += state.charAt(42);
            cubeState += state.substring(31, 36);
            cubeState += state.charAt(45);
            cubeState += state.substring(37, 39);
            cubeState += state.charAt(48);
            cubeState += state.substring(40, 42);
            cubeState += state.charAt(51);
            cubeState += state.substring(43, 45);
            cubeState += state.charAt(0);
            cubeState += state.substring(46, 48);
            cubeState += state.charAt(3);
            cubeState += state.substring(49, 51);
            cubeState += state.charAt(6);
            cubeState += state.substring(52);
        }
        else if (op.equals("Y1")) {
            cubeState += state.substring(0, 6);
            cubeState += state.charAt(29);
            cubeState += state.charAt(28);
            cubeState += state.charAt(27);
            cubeState += state.substring(9,11);
            cubeState += state.charAt(36);
            cubeState += state.charAt(30);
            cubeState += state.charAt(21);
            cubeState += state.charAt(12);
            cubeState += state.charAt(6);
            cubeState += state.substring(16, 20);
            cubeState += state.charAt(37);
            cubeState += state.charAt(31);
            cubeState += state.charAt(22);
            cubeState += state.charAt(13);
            cubeState += state.charAt(7);
            cubeState += state.substring(25, 29);
            cubeState += state.charAt(38);
            cubeState += state.charAt(32);
            cubeState += state.charAt(23);
            cubeState += state.charAt(14);
            cubeState += state.charAt(8);
            cubeState += state.substring(34, 36);
            cubeState += state.charAt(33);
            cubeState += state.charAt(24);
            cubeState += state.charAt(15);
            cubeState += state.substring(39);
        }
        else if (op.equals("Y2")) {
            cubeState += state.substring(0, 6);
            cubeState += state.charAt(38);
            cubeState += state.charAt(37);
            cubeState += state.charAt(36);
            cubeState += state.substring(9,11);
            cubeState += state.charAt(33);
            cubeState += state.charAt(32);
            cubeState += state.charAt(31);
            cubeState += state.charAt(30);
            cubeState += state.charAt(29);
            cubeState += state.substring(16, 20);
            cubeState += state.charAt(24);
            cubeState += state.charAt(23);
            cubeState += state.charAt(22);
            cubeState += state.charAt(21);
            cubeState += state.charAt(20);
            cubeState += state.substring(25, 29);
            cubeState += state.charAt(15);
            cubeState += state.charAt(14);
            cubeState += state.charAt(13);
            cubeState += state.charAt(12);
            cubeState += state.charAt(11);
            cubeState += state.substring(34, 36);
            cubeState += state.charAt(8);
            cubeState += state.charAt(7);
            cubeState += state.charAt(6);
            cubeState += state.substring(39);
        }
        else if (op.equals("Y3")) {
            cubeState += state.substring(0, 6);
            cubeState += state.charAt(33);
            cubeState += state.charAt(24);
            cubeState += state.charAt(15);
            cubeState += state.substring(9, 11);
            cubeState += state.charAt(8);
            cubeState += state.charAt(14);
            cubeState += state.charAt(23);
            cubeState += state.charAt(32);
            cubeState += state.charAt(38);
            cubeState += state.substring(16, 20);
            cubeState += state.charAt(7);
            cubeState += state.charAt(13);
            cubeState += state.charAt(22);
            cubeState += state.charAt(31);
            cubeState += state.charAt(37);
            cubeState += state.substring(25, 29);
            cubeState += state.charAt(6);
            cubeState += state.charAt(12);
            cubeState += state.charAt(21);
            cubeState += state.charAt(30);
            cubeState += state.charAt(36);
            cubeState += state.substring(34, 36);
            cubeState += state.charAt(11);
            cubeState += state.charAt(20);
            cubeState += state.charAt(29);
            cubeState += state.substring(39);
        }
        else if (op.equals("B1")) {
            cubeState += state.substring(0, 2);
            cubeState += state.charAt(32);
            cubeState += state.substring(3, 5);
            cubeState += state.charAt(23);
            cubeState += state.substring(6, 8);
            cubeState += state.charAt(32);
            cubeState += state.substring(9, 14);
            cubeState += state.charAt(38);
            cubeState += state.charAt(33);
            cubeState += state.charAt(24);
            cubeState += state.charAt(15);
            cubeState += state.substring(18, 23);
            cubeState += state.charAt(41);
            cubeState += state.charAt(34);
            cubeState += state.charAt(25);
            cubeState += state.charAt(16);
            cubeState += state.substring(27, 32);
            cubeState += state.charAt(44);
            cubeState += state.charAt(35);
            cubeState += state.charAt(26);
            cubeState += state.charAt(17);
            cubeState += state.substring(36, 38);
            cubeState += state.charAt(47);
            cubeState += state.substring(39, 41);
            cubeState += state.charAt(50);
            cubeState += state.substring(42, 44);
            cubeState += state.charAt(53);
            cubeState += state.substring(45, 47);
            cubeState += state.charAt(2);
            cubeState += state.substring(48, 50);
            cubeState += state.charAt(5);
            cubeState += state.substring(51, 53);
            cubeState += state.charAt(8);
        }
        else if (op.equals("B2")) {
            cubeState += state.substring(0, 2);
            cubeState += state.charAt(38);
            cubeState += state.substring(3, 5);
            cubeState += state.charAt(41);
            cubeState += state.substring(6, 8);
            cubeState += state.charAt(44);
            cubeState += state.substring(9, 14);
            cubeState += state.charAt(47);
            cubeState += state.charAt(35);
            cubeState += state.charAt(34);
            cubeState += state.charAt(33);
            cubeState += state.substring(18, 23);
            cubeState += state.charAt(50);
            cubeState += state.charAt(26);
            cubeState += state.charAt(25);
            cubeState += state.charAt(24);
            cubeState += state.substring(27, 32);
            cubeState += state.charAt(53);
            cubeState += state.charAt(17);
            cubeState += state.charAt(16);
            cubeState += state.charAt(15);
            cubeState += state.substring(36, 38);
            cubeState += state.charAt(2);
            cubeState += state.substring(39, 41);
            cubeState += state.charAt(5);
            cubeState += state.substring(42, 44);
            cubeState += state.charAt(8);
            cubeState += state.substring(45, 47);
            cubeState += state.charAt(14);
            cubeState += state.substring(48, 50);
            cubeState += state.charAt(23);
            cubeState += state.substring(51, 53);
            cubeState += state.charAt(32);
        }
        else if (op.equals("B3")) {
            cubeState += state.substring(0, 2);
            cubeState += state.charAt(47);
            cubeState += state.substring(3, 5);
            cubeState += state.charAt(50);
            cubeState += state.substring(6, 8);
            cubeState += state.charAt(53);
            cubeState += state.substring(9, 14);
            cubeState += state.charAt(2);
            cubeState += state.charAt(17);
            cubeState += state.charAt(26);
            cubeState += state.charAt(35);
            cubeState += state.substring(18, 23);
            cubeState += state.charAt(5);
            cubeState += state.charAt(16);
            cubeState += state.charAt(25);
            cubeState += state.charAt(34);
            cubeState += state.substring(27, 32);
            cubeState += state.charAt(8);
            cubeState += state.charAt(15);
            cubeState += state.charAt(24);
            cubeState += state.charAt(33);
            cubeState += state.substring(36, 38);
            cubeState += state.charAt(14);
            cubeState += state.substring(39, 41);
            cubeState += state.charAt(23);
            cubeState += state.substring(42, 44);
            cubeState += state.charAt(32);
            cubeState += state.substring(45, 47);
            cubeState += state.charAt(38);
            cubeState += state.substring(48, 50);
            cubeState += state.charAt(41);
            cubeState += state.substring(51, 53);
            cubeState += state.charAt(44);
        }
        else if (op.equals("O1")) {
            cubeState += state.substring(0, 27);
            cubeState += state.charAt(47);
            cubeState += state.charAt(46);
            cubeState += state.charAt(45);
            cubeState += state.substring(27, 33);
            cubeState += state.charAt(42);
            cubeState += state.charAt(39);
            cubeState += state.charAt(36);
            cubeState += state.charAt(43);
            cubeState += state.charAt(40);
            cubeState += state.charAt(37);
            cubeState += state.charAt(44);
            cubeState += state.charAt(41);
            cubeState += state.charAt(38);
            cubeState += state.charAt(35);
            cubeState += state.charAt(34);
            cubeState += state.charAt(33);
            cubeState += state.substring(48);
            
        }
        else if (op.equals("O2")) {
            cubeState += state.substring(0, 27);
            cubeState += state.substring(33, 36);
            cubeState += state.charAt(47);
            cubeState += state.charAt(46);
            cubeState += state.charAt(45);
            cubeState += state.substring(27, 30);
            cubeState += state.charAt(44);
            cubeState += state.charAt(43);
            cubeState += state.charAt(42);
            cubeState += state.charAt(41);
            cubeState += state.charAt(40);
            cubeState += state.charAt(39);
            cubeState += state.charAt(38);
            cubeState += state.charAt(37);
            cubeState += state.charAt(36);
            cubeState += state.charAt(32);
            cubeState += state.charAt(31);
            cubeState += state.charAt(30);
            cubeState += state.substring(48);
        }
        else if (op.equals("O3")) {
            cubeState += state.substring(0, 27);
            cubeState += state.substring(30, 36);
            cubeState += state.charAt(47);
            cubeState += state.charAt(46);
            cubeState += state.charAt(45);
            cubeState += state.charAt(38);
            cubeState += state.charAt(41);
            cubeState += state.charAt(44);
            cubeState += state.charAt(37);
            cubeState += state.charAt(40);
            cubeState += state.charAt(43);
            cubeState += state.charAt(36);
            cubeState += state.charAt(39);
            cubeState += state.charAt(42);
            cubeState += state.charAt(29);
            cubeState += state.charAt(28);
            cubeState += state.charAt(27);
            cubeState += state.substring(48);
        }
        else if (op.equals("W1")) {
            cubeState += state.charAt(17);
            cubeState += state.charAt(26);
            cubeState += state.charAt(35);
            cubeState += state.substring(3, 9);
            cubeState += state.charAt(2);
            cubeState += state.substring(10, 17);
            cubeState += state.charAt(44);
            cubeState += state.charAt(1);
            cubeState += state.substring(19, 26);
            cubeState += state.charAt(43);
            cubeState += state.charAt(0);
            cubeState += state.substring(28, 35);
            cubeState += state.charAt(42);
            cubeState += state.substring(36, 42);
            cubeState += state.charAt(9);
            cubeState += state.charAt(18);
            cubeState += state.charAt(27);
            cubeState += state.charAt(51);
            cubeState += state.charAt(48);
            cubeState += state.charAt(45);
            cubeState += state.charAt(52);
            cubeState += state.charAt(49);
            cubeState += state.charAt(46);
            cubeState += state.charAt(53);
            cubeState += state.charAt(50);
            cubeState += state.charAt(47);
        }
        else if (op.equals("W2")) {
            cubeState += state.charAt(44);
            cubeState += state.charAt(43);
            cubeState += state.charAt(42);
            cubeState += state.substring(3, 9);
            cubeState += state.charAt(35);
            cubeState += state.substring(10, 17);
            cubeState += state.charAt(27);
            cubeState += state.charAt(26);
            cubeState += state.substring(19, 26);
            cubeState += state.charAt(18);
            cubeState += state.charAt(17);
            cubeState += state.substring(28, 35);
            cubeState += state.charAt(9);
            cubeState += state.substring(36, 42);
            cubeState += state.charAt(2);
            cubeState += state.charAt(1);
            cubeState += state.charAt(0);
            cubeState += state.substring(53, 44);
            cubeState += state.charAt(52);
            cubeState += state.charAt(51);
            cubeState += state.charAt(50);
            cubeState += state.charAt(49);
            cubeState += state.charAt(48);
            cubeState += state.charAt(47);
            cubeState += state.charAt(46);
            cubeState += state.charAt(45);
        }
        else if (op.equals("W3")) {
            cubeState += state.charAt(27);
            cubeState += state.charAt(18);
            cubeState += state.charAt(9);
            cubeState += state.substring(3, 9);
            cubeState += state.charAt(42);
            cubeState += state.substring(10, 17);
            cubeState += state.charAt(0);
            cubeState += state.charAt(43);
            cubeState += state.substring(19, 26);
            cubeState += state.charAt(1);
            cubeState += state.charAt(44);
            cubeState += state.substring(28, 35);
            cubeState += state.charAt(2);
            cubeState += state.substring(36, 42);
            cubeState += state.charAt(35);
            cubeState += state.charAt(26);
            cubeState += state.charAt(17);
            cubeState += state.charAt(47);
            cubeState += state.charAt(50);
            cubeState += state.charAt(53);
            cubeState += state.charAt(46);
            cubeState += state.charAt(49);
            cubeState += state.charAt(52);
            cubeState += state.charAt(45);
            cubeState += state.charAt(48);
            cubeState += state.charAt(51);
        }
        return cubeState;
    }   
}